package testGenerator.generators;

import testGenerator.ExtremeType;
import testGenerator.TestClass;
import testGenerator.TestClassMethod;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class BoundaryValueGenerator extends Generator
{
    @Override
    protected void generateTests(
            final TestClass testClass,
            final FileOutputStream outStream,
            final String classInstanceName,
            final boolean generateRobust) throws IOException
    {
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

            printAllTests(outStream, classInstanceName, method, parameters);
        }
    }
}