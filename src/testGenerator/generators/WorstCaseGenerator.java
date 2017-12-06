package testGenerator.generators;

import testGenerator.ExtremeType;
import testGenerator.TestClass;
import testGenerator.TestClassMethod;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class WorstCaseGenerator extends Generator
{
    @Override
    protected String generateTests(
            final TestClass testClass,
            final String classInstanceName,
            final boolean generateRobust) throws IOException
    {
        String out = "";

        for (final TestClassMethod method : testClass.getTestClassMethods()) {
            final List<StringJoiner> parameters = new ArrayList<>();
            final int paramCount = method.getTestClassParameters().size();
            final int uniqueTestCount = generateRobust
                    ? 7
                    : 5;

            for (int i = 0; i < Math.pow(uniqueTestCount, paramCount); i++) {
                parameters.add(new StringJoiner(", ", "(", ")"));
            }

            for (int i = 0; i < paramCount; i++) {
                final Map<ExtremeType, String> parameterExtremes = method.getTestClassParameters().get(i).getExtremes();
                final int max = Integer.parseInt(parameterExtremes.get(ExtremeType.GLOBAL_MAX));
                final int min = Integer.parseInt(parameterExtremes.get(ExtremeType.GLOBAL_MIN));
                final int mid = (max + min) / 2;
                final int uniqueToParam = (int) Math.pow(uniqueTestCount, i);
                final int repeatSize = parameters.size() / (int) Math.pow(uniqueTestCount, i + 1);
                final int groupSize = parameters.size() / uniqueToParam;

                for (int x = 0; x < uniqueToParam; x++) {
                    final int startGroup = groupSize * x;

                    findParameterValues(startGroup, 0, repeatSize, parameters, min);
                    findParameterValues(startGroup, 1, repeatSize, parameters, min + 1);
                    findParameterValues(startGroup, 2, repeatSize, parameters, mid);
                    findParameterValues(startGroup, 3, repeatSize, parameters, max - 1);
                    findParameterValues(startGroup, 4, repeatSize, parameters, max);

                    if (generateRobust) {
                        findParameterValues(startGroup, 5, repeatSize, parameters, min - 1);
                        findParameterValues(startGroup, 6, repeatSize, parameters, max + 1);
                    }
                }
            }

            out += printAllTests(classInstanceName, method, parameters);
        }

        return out;
    }
}