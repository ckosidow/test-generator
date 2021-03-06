package testGenerator.generators;

import testGenerator.Extremes;
import testGenerator.TestClass;
import testGenerator.TestClassMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class BoundaryValueGenerator extends Generator
{
    @Override
    protected String generateTests(
            final TestClass testClass,
            final String classInstanceName,
            final boolean generateRobust)
    {
        final StringBuilder out = new StringBuilder();

        for (final TestClassMethod method : testClass.getTestClassMethods()) {
            final List<StringJoiner> parameters = new ArrayList<>();
            final int paramCount = method.getTestClassParameters().size();
            final int uniqueTestCount = generateRobust
                    ? 6
                    : 4;
            final int testAmt = uniqueTestCount * paramCount + 1;

            for (int i = 0; i < testAmt; i++) {
                parameters.add(new StringJoiner(", ", "(", ")"));
            }

            for (int i = 0; i < paramCount; i++) {
                final Extremes parameterExtremes = method.getTestClassParameters().get(i).getExtremes();
                final int max = Integer.parseInt(parameterExtremes.getGlobalMax());
                final int min = Integer.parseInt(parameterExtremes.getGlobalMin());
                final int mid = (max + min) / 2;

                parameters.get(0).add(String.valueOf(mid));

                for (int x = 0; x < paramCount; x++) {
                    final int blockStart = (x * uniqueTestCount) + 1;

                    if (i == x) {
                        parameters.get(blockStart).add(String.valueOf(min));
                        parameters.get(blockStart + 1).add(String.valueOf(min + 1));
                        parameters.get(blockStart + 2).add(String.valueOf(max - 1));
                        parameters.get(blockStart + 3).add(String.valueOf(max));

                        if (generateRobust) {
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

            out.append(printAllTests(classInstanceName, method, parameters));
        }

        return out.toString();
    }
}