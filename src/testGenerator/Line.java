package testGenerator;

public class Line
{
    private final int number;
    private final String content;

    public Line(
            final int number,
            final String content)
    {
        this.number = number;
        this.content = content;
    }

    // Not used currently. Expected to be necessary for finding usages later
    public int getNumber()
    {
        return number;
    }

    public String getContent()
    {
        return content;
    }
}
