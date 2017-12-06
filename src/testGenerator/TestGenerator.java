package testGenerator;

import testGenerator.generators.BoundaryValueGenerator;
import testGenerator.generators.Generator;
import testGenerator.generators.WorstCaseGenerator;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestGenerator
{
    public static void main(final String... classNames) throws IOException, ClassNotFoundException
    {
        System.out.println("What type of tests to generate?");
        final TestType testType = TestType.valueOf(new Scanner(System.in, StandardCharsets.UTF_8.name()).nextLine().trim().toUpperCase().replace(' ',
                '_'));

        System.out.println("Generate robust test cases?");
        final boolean isRobust = new Scanner(System.in, StandardCharsets.UTF_8.name()).nextBoolean();

        final Generator testGenerator;

        if (testType == TestType.BOUNDARY_VALUE) {
            testGenerator = new BoundaryValueGenerator();
        } else if (testType == TestType.WORST_CASE) {
            testGenerator = new WorstCaseGenerator();
        } else {
            throw new IOException("Test type is unknown");
        }

        for (final String className : classNames) {
            testGenerator.writeTestCases(new TestClass(className), isRobust);
        }
    }
}