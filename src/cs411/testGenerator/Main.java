package cs411.testGenerator;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class Main
{
    private static final String OUPUT_LOCATION = "test/cs411/testGenerator/outputClasses/";

    public static void main(final String... args)
    {
        try {
            generateTestCases("ComputeTriangle");
            generateTestCases("ComputeNextDate");
            generateTestCases("ComputeCommission");
        } catch (final IOException | ClassNotFoundException e) {
            System.err.println("Class not found: " + e.getMessage());
        }
    }

    private static void generateTestCases(final String className) throws IOException, ClassNotFoundException
    {
        writeTestCases(new TestClass(className));
    }

    private static void writeTestCases(final TestClass testClass)
    {
        final String className = testClass.getClassName();

        try (final FileOutputStream outStream = new FileOutputStream(OUPUT_LOCATION + "Test" + className + ".java")) {
            final String classInstanceName = "mock" + className;
            final TestType testType = testClass.getTestType();

            outStream.write(("package cs411.testGenerator.outputClasses;" + System.lineSeparator()
                    + System.lineSeparator()
                    + "import cs411.testGenerator.inputClasses." + className + ';' + System.lineSeparator()
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
        for (final TestClassMethod<?> method : testClass.getTestClassMethods()) {
            final List<StringJoiner> joinerList = new ArrayList<>();
            final int paramCount = method.getTestClassParameters().size();
            final int uniqueTestCount = testClass.isRobust()
                    ? 6
                    : 4;

            for (int i = 0; i < uniqueTestCount * paramCount + 1; i++) {
                joinerList.add(new StringJoiner(", ", "(", ")"));
            }

            for (int i = 0; i < paramCount; i++) {
                final Map<ExtremeType, String> parameterExtremes = method.getTestClassParameters().get(i).getExtremes();
                final int max = Integer.parseInt(parameterExtremes.get(ExtremeType.GLOBAL_MAX));
                final int min = Integer.parseInt(parameterExtremes.get(ExtremeType.GLOBAL_MIN));
                final int mid = (max + min) / 2;

                joinerList.get(0).add(String.valueOf(mid));

                for (int x = 0; x < paramCount; x++) {
                    final int blockStart = (x * uniqueTestCount) + 1;

                    if (i == x) {
                        joinerList.get(blockStart).add(String.valueOf(min));
                        joinerList.get(blockStart + 1).add(String.valueOf(min + 1));
                        joinerList.get(blockStart + 2).add(String.valueOf(max - 1));
                        joinerList.get(blockStart + 3).add(String.valueOf(max));

                        if (uniqueTestCount == 6) {
                            joinerList.get(blockStart + 4).add(String.valueOf(min - 1));
                            joinerList.get(blockStart + 5).add(String.valueOf(max + 1));
                        }
                    } else {
                        for (int y = 0; y < uniqueTestCount; y++) {
                            joinerList.get(blockStart + y).add(String.valueOf(mid));
                        }
                    }
                }
            }

            printAllTests(outStream, classInstanceName, method, joinerList);
        }
    }

    private static void determineWCTests(
            final TestClass testClass,
            final FileOutputStream outStream,
            final String classInstanceName) throws IOException
    {
        for (final TestClassMethod<?> method : testClass.getTestClassMethods()) {
            final List<StringJoiner> joinerList = new ArrayList<>();
            final int paramCount = method.getTestClassParameters().size();
            final int uniqueTestCount = testClass.isRobust()
                    ? 7
                    : 5;

            for (int i = 0; i < Math.pow(uniqueTestCount, paramCount); i++) {
                joinerList.add(new StringJoiner(", ", "(", ")"));
            }

            for (int i = 0; i < paramCount; i++) {
                final Map<ExtremeType, String> parameterExtremes = method.getTestClassParameters().get(i).getExtremes();
                final int max = Integer.parseInt(parameterExtremes.get(ExtremeType.GLOBAL_MAX));
                final int min = Integer.parseInt(parameterExtremes.get(ExtremeType.GLOBAL_MIN));
                final int mid = (max + min) / 2;
                final int uniqueToParam = (int) Math.pow(uniqueTestCount, i);
                final int repeatSize = joinerList.size() / (int) Math.pow(uniqueTestCount, i + 1);
                final int groupSize = joinerList.size() / uniqueToParam;

                for (int x = 0; x < uniqueToParam; x++) {
                    final int startGroup = groupSize * x;

                    findParameterValues(startGroup, 0, repeatSize, joinerList, min);
                    findParameterValues(startGroup, 1, repeatSize, joinerList, min + 1);
                    findParameterValues(startGroup, 2, repeatSize, joinerList, mid);
                    findParameterValues(startGroup, 3, repeatSize, joinerList, max - 1);
                    findParameterValues(startGroup, 4, repeatSize, joinerList, max);

                    if (uniqueTestCount == 7) {
                        findParameterValues(startGroup, 5, repeatSize, joinerList, min - 1);
                        findParameterValues(startGroup, 6, repeatSize, joinerList, max + 1);
                    }
                }
            }

            printAllTests(outStream, classInstanceName, method, joinerList);
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