package cs411.testGenerator;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestClass
{
    private TestType testType;
    private boolean isRobust;
    private boolean isOnOutput;
    private String className;
    private Map<Integer, String> body = new HashMap<>();
    private List<TestClassMethod<?>> testClassMethods = new ArrayList<>();
    private static final List<Integer> ACCESSIBLE_MODIFIERS = Arrays.asList(0, Modifier.PUBLIC, Modifier.PROTECTED);

    public TestClass()
    {

    }

    public TestClass(final String className) throws IOException, ClassNotFoundException
    {
        final List<String> lines = Files.readAllLines(Paths.get("src/cs411/testGenerator/inputClasses/" + className + ".java"));

        this.className = className;
        this.body = IntStream.range(1, lines.size()).boxed().collect(Collectors.toMap(index -> index, lines::get));
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

    public Map<Integer, String> getBody()
    {
        return body;
    }

    public void setBody(final Map<Integer, String> body)
    {
        this.body = body;
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
        final List<Method> allMethods = Arrays.asList(Class.forName("cs411.testGenerator.inputClasses." + className)
                .getDeclaredMethods());

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
        final Scanner input = new Scanner(System.in, StandardCharsets.UTF_8.name());

        System.out.println("Generate robust test cases?");
        isRobust = input.nextBoolean();
    }

    private void findTestType()
    {
        final Scanner input = new Scanner(System.in, StandardCharsets.UTF_8.name());

        System.out.println("What type of tests to generate?");
        testType = TestType.valueOf(input.nextLine().trim().toUpperCase().replace(' ', '_'));
    }

    private void findIsOnOutput() {
        final Scanner input = new Scanner(System.in, StandardCharsets.UTF_8.name());

        System.out.println("Test on output of program?");
        isOnOutput = input.nextBoolean();
    }
}