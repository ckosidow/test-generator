package testGenerator;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class TestClassParameter<T>
{
    private T type;
    private final String name;
    private final Extremes extremes = new Extremes();

    public TestClassParameter(final String name)
    {
        this.name = name;

        findExtremes();
    }

    public Extremes getExtremes()
    {
        return extremes;
    }

    private void findExtremes()
    {
        final Scanner input = new Scanner(System.in, StandardCharsets.UTF_8.name());

//        if (!ClassUtils.isPrimitiveOrWrapper(type.getClass())) {
//            // Recursively find the extremes of the methods/fields used inside this object
//        }

        System.out.println("What is the max value for " + name + '?');
        extremes.setGlobalMax(input.nextLine());

        System.out.println("What is the min value for " + name + '?');
        extremes.setGlobalMin(input.nextLine());
    }
}