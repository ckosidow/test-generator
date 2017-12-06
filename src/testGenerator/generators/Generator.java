package testGenerator.generators;

import testGenerator.TestClass;
import testGenerator.TestClassMethod;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.StringJoiner;

public abstract class Generator
{
    private static final String OUPUT_LOCATION = "test/testGenerator/outputClasses/";

    public void writeTestCases(
            final TestClass testClass,
            final boolean generateRobust)
    {
        final String className = testClass.getClassName();

        try (final FileOutputStream outStream = new FileOutputStream(OUPUT_LOCATION + "Test" + className + ".java")) {
            final String classInstanceName = "mock" + className;

            outStream.write(("package testGenerator.outputClasses;" + System.lineSeparator()
                    + System.lineSeparator()
                    + "import testGenerator.inputClasses." + className + ';' + System.lineSeparator()
                    + "import org.junit.Test;" + System.lineSeparator()
                    + "import org.junit.runner.RunWith;" + System.lineSeparator()
                    + "import org.mockito.InjectMocks;" + System.lineSeparator()
                    + "import org.mockito.runners.MockitoJUnitRunner;" + System.lineSeparator()
                    + System.lineSeparator()
                    + "@RunWith(MockitoJUnitRunner.class)" + System.lineSeparator()
                    + "public class Test" + className + System.lineSeparator()
                    + '{' + System.lineSeparator()
                    + "    @InjectMocks" + System.lineSeparator()
                    + "    private " + className + ' ' + classInstanceName + ';' + System.lineSeparator()
                    + generateTests(testClass, classInstanceName, generateRobust)
                    + '}').getBytes(StandardCharsets.UTF_8));
        } catch (final IOException e) {
            System.err.println("Something went wrong: " + e.getLocalizedMessage());
        }
    }

    protected abstract String generateTests(
            final TestClass testClass,
            final String classInstanceName,
            final boolean generateRobust) throws IOException;

    protected void findParameterValues(
            final int startGroup,
            final int startSubGroup,
            final int repeatSize,
            final List<StringJoiner> joinerList,
            final int value)
    {
        for (int y = 0; y < repeatSize; y++) {
            joinerList.get(startGroup + (repeatSize * startSubGroup) + y).add(String.valueOf(value));
        }
    }

    protected String printAllTests(
            final String classInstanceName,
            final TestClassMethod method,
            final List<StringJoiner> joinerList) throws IOException
    {
        final int testCount = joinerList.size();
        String out = "";

        for (int i = 0; i < testCount; i++) {
            out += System.lineSeparator()
                    + "    @Test" + System.lineSeparator()
                    + "    public void test" + i + "()" + System.lineSeparator()
                    + "    {" + System.lineSeparator()
                    + "        " + classInstanceName + '.' + method.getMethodName() + joinerList.get(i) + ';' + System.lineSeparator()
                    + "    }" + System.lineSeparator();
        }

        return out;
    }
}