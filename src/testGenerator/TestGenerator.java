package testGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringJoiner;

public class TestGenerator
{
    private static final String OUPUT_LOCATION = "test/testGenerator/outputClasses/";
    private static TestType testType;
    private static boolean isRobust;

    public static void main(final String... classNames) throws IOException, ClassNotFoundException
    {
        System.out.println("What type of tests to generate?");
        testType = TestType.valueOf(new Scanner(System.in, StandardCharsets.UTF_8.name()).nextLine().trim().toUpperCase().replace(' ', '_'));

        System.out.println("Generate robust test cases?");
        isRobust = new Scanner(System.in, StandardCharsets.UTF_8.name()).nextBoolean();

        for (final String className : classNames) {
            writeTestCases(new TestClass(className));
        }
    }

    private static void writeTestCases(final TestClass testClass)
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
                    + "    private " + className + ' ' + classInstanceName + ';' + System.lineSeparator()).getBytes(StandardCharsets.UTF_8));

            if (testType == TestType.BOUNDARY_VALUE) {
                determineBVATests(testClass, outStream, classInstanceName);
            } else if (testType == TestType.WORST_CASE) {
                determineWCTests(testClass, outStream, classInstanceName);
            }

            outStream.write("}".getBytes(StandardCharsets.UTF_8));
        } catch (final IOException e) {
            System.err.println("Something went wrong: " + e.getLocalizedMessage());
        }
    }

    private static void determineBVATests(
            final TestClass testClass,
            final FileOutputStream outStream,
            final String classInstanceName) throws IOException
    {
        for (final TestClassMethod method : testClass.getTestClassMethods()) {
            final List<StringJoiner> parameters = new ArrayList<>();
            final int paramCount = method.getTestClassParameters().size();
            final int uniqueTestCount = isRobust
                    ? 6
                    : 4;
            final int testAmt = uniqueTestCount * paramCount + 1;

            for (int i = 0; i < testAmt; i++) {
                parameters.add(new StringJoiner(", ", "(", ")"));
            }

            for (int i = 0; i < paramCount; i++) {
                final Map<ExtremeType, String> parameterExtremes = method.getTestClassParameters().get(i).getExtremes();
                final int max = Integer.parseInt(parameterExtremes.get(ExtremeType.GLOBAL_MAX));
                final int min = Integer.parseInt(parameterExtremes.get(ExtremeType.GLOBAL_MIN));
                final int mid = (max + min) / 2;

                parameters.get(0).add(String.valueOf(mid));

                for (int x = 0; x < paramCount; x++) {
                    final int blockStart = (x * uniqueTestCount) + 1;

                    if (i == x) {
                        parameters.get(blockStart).add(String.valueOf(min));
                        parameters.get(blockStart + 1).add(String.valueOf(min + 1));
                        parameters.get(blockStart + 2).add(String.valueOf(max - 1));
                        parameters.get(blockStart + 3).add(String.valueOf(max));

                        if (uniqueTestCount == 6) {
                            parameters.get(blockStart + 4).add(String.valueOf(min - 1));
                            parameters.get(blockStart + 5).add(String.valueOf(max + 1));
                        }
                    } else {
                        for (int y = 0; y < uniqueTestCount; y++) {
                            parameters.get(blockStart + y).add(String.valueOf(mid));
                        }
                    }
                }
            }

            printAllTests(outStream, classInstanceName, method, parameters);
        }
    }

    private static void determineWCTests(
            final TestClass testClass,
            final FileOutputStream outStream,
            final String classInstanceName) throws IOException
    {
        for (final TestClassMethod method : testClass.getTestClassMethods()) {
            final List<StringJoiner> parameters = new ArrayList<>();
            final int paramCount = method.getTestClassParameters().size();
            final int uniqueTestCount = isRobust
                    ? 7
                    : 5;

            for (int i = 0; i < Math.pow(uniqueTestCount, paramCount); i++) {
                parameters.add(new StringJoiner(", ", "(", ")"));
            }

            for (int i = 0; i < paramCount; i++) {
                final Map<ExtremeType, String> parameterExtremes = method.getTestClassParameters().get(i).getExtremes();
                final int max = Integer.parseInt(parameterExtremes.get(ExtremeType.GLOBAL_MAX));
                final int min = Integer.parseInt(parameterExtremes.get(ExtremeType.GLOBAL_MIN));
                final int mid = (max + min) / 2;
                final int uniqueToParam = (int) Math.pow(uniqueTestCount, i);
                final int repeatSize = parameters.size() / (int) Math.pow(uniqueTestCount, i + 1);
                final int groupSize = parameters.size() / uniqueToParam;

                for (int x = 0; x < uniqueToParam; x++) {
                    final int startGroup = groupSize * x;

                    findParameterValues(startGroup, 0, repeatSize, parameters, min);
                    findParameterValues(startGroup, 1, repeatSize, parameters, min + 1);
                    findParameterValues(startGroup, 2, repeatSize, parameters, mid);
                    findParameterValues(startGroup, 3, repeatSize, parameters, max - 1);
                    findParameterValues(startGroup, 4, repeatSize, parameters, max);

                    if (uniqueTestCount == 7) {
                        findParameterValues(startGroup, 5, repeatSize, parameters, min - 1);
                        findParameterValues(startGroup, 6, repeatSize, parameters, max + 1);
                    }
                }
            }

            printAllTests(outStream, classInstanceName, method, parameters);
        }
    }

    private static void findParameterValues(
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

    private static void printAllTests(
            final FileOutputStream outStream,
            final String classInstanceName,
            final TestClassMethod method,
            final List<StringJoiner> joinerList) throws IOException
    {
        final int testCount = joinerList.size();

        for (int i = 0; i < testCount; i++) {
            outStream.write((System.lineSeparator()
                    + "    @Test" + System.lineSeparator()
                    + "    public void test" + i + "()" + System.lineSeparator()
                    + "    {" + System.lineSeparator()
                    + "        " + classInstanceName + '.' + method.getMethodName() + joinerList.get(i) + ';' + System.lineSeparator()
                    + "    }" + System.lineSeparator()).getBytes(StandardCharsets.UTF_8));
        }
    }
}