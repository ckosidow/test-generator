package testGenerator;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass
{
    private final String className;
    private final List<Line> body = new ArrayList<>();
    private final List<TestClassMethod> testClassMethods = new ArrayList<>();
    private final Class testClass;
    private static final List<Integer> ACCESSIBLE_MODIFIERS = Arrays.asList(0, Modifier.PUBLIC, Modifier.PROTECTED);

    public TestClass(final String className) throws IOException, ClassNotFoundException
    {
        final List<String> lines = Files.readAllLines(Paths.get("src/testGenerator/inputClasses/" + className + ".java"));
        final int count = lines.size();

        this.className = className;
        this.testClass = Class.forName("testGenerator.inputClasses." + className);

        for (int i = 0; i < count; i++) {
            body.add(new Line(i, lines.get(i)));
        }

        findMethods();
    }

    public String getClassName()
    {
        return className;
    }

    public List<TestClassMethod> getTestClassMethods()
    {
        return new ArrayList<>(testClassMethods);
    }

    private void findMethods()
    {
        final Method[] allMethods = testClass.getDeclaredMethods();

        for (final Method method : allMethods) {
            if (ACCESSIBLE_MODIFIERS.contains(method.getModifiers())) {
                testClassMethods.add(new TestClassMethod(method, body));
            }
        }
    }
}