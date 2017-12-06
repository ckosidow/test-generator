package testGenerator;

import java.nio.charset.StandardCharsets;
import java.util.EnumMap;
import java.util.Map;
import java.util.Scanner;

public class TestClassParameter
{
    private final String name;
    private final Map<ExtremeType, String> extremes = new EnumMap<>(ExtremeType.class);

    public TestClassParameter(final String name)
    {
        this.name = name;

        findExtremes();
    }

    public Map<ExtremeType, String> getExtremes()
    {
        return new EnumMap<>(extremes);
    }

    private void findExtremes()
    {
        final Scanner input = new Scanner(System.in, StandardCharsets.UTF_8.name());

        System.out.println("What is the max value for " + name + '?');
        extremes.put(ExtremeType.GLOBAL_MAX, input.nextLine());

        System.out.println("What is the min value for " + name + '?');
        extremes.put(ExtremeType.GLOBAL_MIN, input.nextLine());
    }
}