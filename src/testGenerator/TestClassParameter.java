package testGenerator;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestClassParameter<T>
{
    private T type;
    private String name;
    private Map<ExtremeType, String> extremes = new HashMap<>();

    public T getType()
    {
        return type;
    }

    public void setType(final T type)
    {
        this.type = type;
    }

    public String getName()
    {
        return name;
    }

    public void setName(final String name)
    {
        this.name = name;
    }

    public Map<ExtremeType, String> getExtremes()
    {
        return extremes;
    }

    public void setExtremes(final Map<ExtremeType, String> extremes)
    {
        this.extremes = extremes;
    }

    public void findExtremes()
    {
        final Scanner input = new Scanner(System.in, StandardCharsets.UTF_8.name());

        System.out.println("What is the max value for " + name + '?');
        extremes.put(ExtremeType.GLOBAL_MAX, input.nextLine());

        System.out.println("Whas is the min value for " + name + '?');
        extremes.put(ExtremeType.GLOBAL_MIN, input.nextLine());
    }
}