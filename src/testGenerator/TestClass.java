package testGenerator;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestClass
{
    private TestType testType;
    private boolean isRobust;
    private boolean isOnOutput;
    private String className;
    private List<Line> body = new ArrayList<>();
    private List<TestClassMethod<?>> testClassMethods = new ArrayList<>();
    private static final List<Integer> ACCESSIBLE_MODIFIERS = Arrays.asList(0, Modifier.PUBLIC, Modifier.PROTECTED);

    public TestClass()
    {

    }

    public TestClass(final String className) throws IOException, ClassNotFoundException
    {
        final List<String> lines = Files.readAllLines(Paths.get("src/testGenerator/inputClasses/" + className + ".java"));
        final int count = lines.size();

        this.className = className;

        for (int i = 0; i < count; i++) {
            body.add(new Line(i, lines.get(i)));
        }

        this.findTestType();
        this.findRobustness();
        this.findMethods();
    }

    public TestType getTestType()
    {
        return testType;
    }

    public void setTestType(final TestType testType)
    {
        this.testType = testType;
    }

    public boolean isRobust()
    {
        return isRobust;
    }

    public void setRobust(final boolean robust)
    {
        isRobust = robust;
    }

    public boolean isOnOutput()
    {
        return isOnOutput;
    }

    public void setOnOutput(final boolean onOutput)
    {
        isOnOutput = onOutput;
    }

    public String getClassName()
    {
        return className;
    }

    public void setClassName(final String className)
    {
        this.className = className;
    }

    public List<Line> getBody()
    {
        return new ArrayList<>(body);
    }

    public void setBody(final List<Line> body)
    {
        this.body = body == null ? new ArrayList<>() : new ArrayList<>(body);
    }

    public List<TestClassMethod<?>> getTestClassMethods()
    {
        return testClassMethods;
    }

    public void setTestClassMethods(final List<TestClassMethod<?>> testClassMethods)
    {
        this.testClassMethods = testClassMethods;
    }

    public void findMethods() throws ClassNotFoundException
    {
        final List<Method> allMethods = Arrays.asList(Class.forName("testGenerator.inputClasses." + className).getDeclaredMethods());

        for (final Method method : allMethods) {
            if (ACCESSIBLE_MODIFIERS.contains(method.getModifiers())) {
                final TestClassMethod accessibleTestClassMethod = new TestClassMethod();

                accessibleTestClassMethod.setMethodName(method.getName());
                accessibleTestClassMethod.setVisibility(method.getModifiers());
                accessibleTestClassMethod.setReturnType(method.getReturnType());
                accessibleTestClassMethod.findParameters(method);

                testClassMethods.add(accessibleTestClassMethod);
            }
        }

        for (final TestClassMethod<?> testClassMethod : testClassMethods) {
            testClassMethod.findMethodBody(body);
        }
    }

    private void findRobustness()
    {
        System.out.println("Generate robust test cases?");
        isRobust = new Scanner(System.in, StandardCharsets.UTF_8.name()).nextBoolean();
    }

    private void findTestType()
    {
        System.out.println("What type of tests to generate?");
        testType = TestType.valueOf(new Scanner(System.in, StandardCharsets.UTF_8.name()).nextLine().trim().toUpperCase().replace(' ', '_'));
    }

    private void findIsOnOutput()
    {
        System.out.println("Test on output of program?");
        isOnOutput = new Scanner(System.in, StandardCharsets.UTF_8.name()).nextBoolean();
    }
}