package colorcoder;

import org.junit.Test;

import colortypes.MajorColor;
import colortypes.MinorColor;

public class ColorCoderTest {
    static ColorPair GetColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor = 
            (MajorColor) ColorMatchCode.getColorFromIndex(zeroBasedPairNumber / MinorColor.values().length, MajorColor.values());
        MinorColor minorColor =
        		(MinorColor) ColorMatchCode.getColorFromIndex(zeroBasedPairNumber %  MinorColor.values().length, MinorColor.values());
        return new ColorPair(majorColor, minorColor);
    }
    
    static int GetPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndexOfColor() *  MinorColor.values().length + minor.getIndexOfColor() + 1;
    }

    @Test
    public static void testNumberToPair(int pairNumber,
        MajorColor expectedMajor,
        MinorColor expectedMinor)
    {
        ColorPair colorPair = GetColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.ToString());
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }
    @Test
    public static void testPairToNumber(
        MajorColor major,
        MinorColor minor,
        int expectedPairNumber)
    {
        int pairNumber = GetPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }

}
