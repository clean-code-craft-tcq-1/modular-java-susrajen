package colorcoder;

import colortypes.MajorColor;
import colortypes.MinorColor;

public class ColorCoderTest {

    public void testColorsForGivenPairNumber(int pairNumber,
        MajorColor expectedMajor,
        MinorColor expectedMinor)
    {
        ColorPair colorPair = ColorCoderSearch.getColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.ToString());
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }

    public void testPairNumberForGivenColors(
        MajorColor major,
        MinorColor minor,
        int expectedPairNumber)
    {
        int pairNumber = ColorCoderSearch.getPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }

}
