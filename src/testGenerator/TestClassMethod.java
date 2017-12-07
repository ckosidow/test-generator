package testGenerator;

import org.apache.commons.lang3.StringUtils;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClassMethod
{
    private final Method method;
    private final List<Line> body = new ArrayList<>();
    private final List<TestClassParameter<?>> testClassParameters = new ArrayList<>();

    public TestClassMethod(final Method method)
    {
        this.method = method;

        findParameters();
    }

    public String getMethodName()
    {
        return method.getName();
    }

    public List<TestClassParameter<?>> getTestClassParameters()
    {
        return new ArrayList<>(testClassParameters);
    }

    public void findMethodBody(final List<Line> classBody)
    {
        boolean inBody = false;
        int openBracketCount = 0;
        int closeBracketCount = 0;

        for (final Line line : classBody) {
            final String lineContent = line.getContent();

            if (!inBody) {
                if (lineContent.matches(".*" + method.getReturnType() + "\\s*" + method.getName() + "(\\s*\\(.*|\\s*&)")) {
                    body.add(line);

                    openBracketCount = StringUtils.countMatches(lineContent, "{");
                    closeBracketCount = StringUtils.countMatches(lineContent, "}");

                    inBody = true;
                }
            } else {
                body.add(line);

                openBracketCount += StringUtils.countMatches(lineContent, "{");
                closeBracketCount += StringUtils.countMatches(lineContent, "}");

                if (openBracketCount > 0 && openBracketCount - closeBracketCount < 1) {
                    break;
                }
            }
        }
    }

    private void findParameters()
    {
        final List<Parameter> reflectParameters = Arrays.asList(method.getParameters());
        final String[] paramNames = new LocalVariableTableParameterNameDiscoverer().getParameterNames(method);

        for (int i = 0; i < reflectParameters.size(); i++) {
            testClassParameters.add(new TestClassParameter(paramNames[i]));
        }
    }
}