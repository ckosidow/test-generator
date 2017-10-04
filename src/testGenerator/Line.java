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

    public int getNumber()
    {
        return number;
    }

    public String getContent()
    {
        return content;
    }
}
