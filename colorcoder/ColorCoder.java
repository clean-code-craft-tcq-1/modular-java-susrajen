package colorcoder;

import colortypes.MajorColor;
import colortypes.MinorColor;


public class ColorCoder {

    public static void main(String[] args) {
    	ColorCoderTest colorCoderTestObject = new ColorCoderTest();
    	colorCoderTestObject.testColorsForGivenPairNumber(4, MajorColor.WHITE, MinorColor.BROWN);
    	colorCoderTestObject.testColorsForGivenPairNumber(5, MajorColor.WHITE, MinorColor.SLATE);
    
    	colorCoderTestObject.testPairNumberForGivenColors(MajorColor.BLACK, MinorColor.ORANGE, 12);
    	colorCoderTestObject.testPairNumberForGivenColors(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
