package cs411.testGenerator.inputClasses;

public class ComputeTriangle
{
    private static final int MIN_SIDE_LENGTH = 5;
    private static final int MAX_SIDE_LENGTH = 205;

    public void findTriangle(
            final int aLength,
            final int bLength,
            final int cLength)
    {
        System.out.print("A: " + aLength + '\t');
        System.out.print("B: " + bLength + '\t');
        System.out.print("C: " + cLength + '\t');

        final boolean isValidTriangle = isSideValid(aLength) && isSideValid(bLength) && isSideValid(cLength);
        final boolean sidesConnect = aLength < bLength + cLength
                && bLength < aLength + cLength
                && cLength < aLength + bLength;

        if (isValidTriangle && sidesConnect) {
            if (aLength == bLength && bLength == cLength) {
                System.out.println("Equilateral");
            } else if (aLength != bLength && aLength != cLength && bLength != cLength) {
                System.out.println("Scalene");
            } else {
                System.out.println("Isosceles");
            }
        } else {
            System.out.println("Not a triangle");
        }
    }

    private static boolean isSideValid(final int sideLength)
    {
        return sideLength >= MIN_SIDE_LENGTH && sideLength <= MAX_SIDE_LENGTH;
    }
}