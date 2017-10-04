package testGenerator;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClassMethod<T>
{
    private T returnType;
    private String methodName;
    private List<Line> body = new ArrayList<>();
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

    public List<Line> getBody()
    {
        return body;
    }

    public void setBody(final List<Line> body)
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

    public void findMethodBody(final List<Line> classBody) {
        boolean inBody = false;
        int openBracketCount = 0;
        int closeBracketCount = 0;

        for (final Line line : classBody) {
            if (!inBody) {
                if (line.getContent().matches(".*" + returnType + "\\s*" + methodName + "(\\s*\\(.*|\\s*&)")) {
                    body.add(line);

                    openBracketCount = StringUtils.countMatches(line.getContent(), "{");
                    closeBracketCount = StringUtils.countMatches(line.getContent(), "}");

                    inBody = true;
                }
            } else {
                body.add(line);

                openBracketCount += StringUtils.countMatches(line.getContent(), "{");
                closeBracketCount += StringUtils.countMatches(line.getContent(), "}");

                if (openBracketCount > 0 && openBracketCount - closeBracketCount < 1) {
                    break;
                }
            }
        }
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