package testGenerator;

import java.util.ArrayList;
import java.util.List;

public class Extremes
{
    private String globalMax;
    private String globalMin;
    private List<String> localMins = new ArrayList<>();
    private List<String> localMaxs = new ArrayList<>();

    public String getGlobalMax()
    {
        return globalMax;
    }

    public void setGlobalMax(final String globalMax)
    {
        this.globalMax = globalMax;
    }

    public String getGlobalMin()
    {
        return globalMin;
    }

    public void setGlobalMin(final String globalMin)
    {
        this.globalMin = globalMin;
    }

    public List<String> getLocalMins()
    {
        return new ArrayList<>(localMins);
    }

    public void setLocalMins(final List<String> localMins)
    {
        this.localMins = localMins == null
                ? new ArrayList<>()
                : new ArrayList<>(localMins);
    }

    public List<String> getLocalMaxs()
    {
        return new ArrayList<>(localMaxs);
    }

    public void setLocalMaxs(final List<String> localMaxs)
    {
        this.localMaxs = localMaxs == null
                ? new ArrayList<>()
                : new ArrayList<>(localMaxs);
    }
}