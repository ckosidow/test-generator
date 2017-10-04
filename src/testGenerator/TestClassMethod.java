package testGenerator;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;
import java.util.stream.Collectors;

public class TestClassMethod<T>
{
    private T returnType;
    private String methodName;
    private Map<Integer, String> body = new HashMap<>();
    private List<TestClassParameter<?>> testClassParameters = new ArrayList<>();
    private int visibility;

    public T getReturnType()
    {
        return returnType;
    }

    public void setReturnType(final T returnType)
    {
        this.returnType = returnType;
    }

    public String getMethodName()
    {
        return methodName;
    }

    public void setMethodName(final String methodName)
    {
        this.methodName = methodName;
    }

    public Map<Integer, String> getBody()
    {
        return body;
    }

    public void setBody(final Map<Integer, String> body)
    {
        this.body = body;
    }

    public List<TestClassParameter<?>> getTestClassParameters()
    {
        return testClassParameters;
    }

    public void setTestClassParameters(final List<TestClassParameter<?>> testClassParameters)
    {
        this.testClassParameters = testClassParameters;
    }

    public int getVisibility()
    {
        return visibility;
    }

    public void setVisibility(final int visibility)
    {
        this.visibility = visibility;
    }

    public void findMethodBody(final Map<Integer, String> classBody) {
        boolean inBody = false;
        int openBracketCount = 0;
        int closeBracketCount = 0;

        for (final Map.Entry<Integer, String> line : classBody.entrySet()) {
            if (!inBody) {
                if (line.getValue().matches(".*" + returnType + "\\s*" + methodName + "(\\s*\\(.*|\\s*&)")) {
                    body.put(line.getKey(), line.getValue());

                    openBracketCount = StringUtils.countMatches(line.getValue(), "{");
                    closeBracketCount = StringUtils.countMatches(line.getValue(), "}");

                    inBody = true;
                }
            } else {
                body.put(line.getKey(), line.getValue());

                openBracketCount += StringUtils.countMatches(line.getValue(), "{");
                closeBracketCount += StringUtils.countMatches(line.getValue(), "}");

                if (openBracketCount > 0 && openBracketCount - closeBracketCount < 1) {
                    break;
                }
            }
        }

        body = body.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));
    }

    public void findParameters(final Method reflectMethod)
    {
        this.findParameterInfo(reflectMethod);

        for (final TestClassParameter<?> testClassParameter : testClassParameters) {
            testClassParameter.findExtremes();
        }
    }

    private void findParameterInfo(final Method reflectMethod) {
        final List<Parameter> reflectParameters = Arrays.asList(reflectMethod.getParameters());

        for (int i = 0; i < reflectParameters.size(); i++) {
            final Parameter parameter = reflectParameters.get(i);
            final TestClassParameter methodParam = new TestClassParameter();

            methodParam.setType(parameter.getType());
            methodParam.setName(new LocalVariableTableParameterNameDiscoverer().getParameterNames(reflectMethod)[i]);

            testClassParameters.add(methodParam);
        }
    }
}