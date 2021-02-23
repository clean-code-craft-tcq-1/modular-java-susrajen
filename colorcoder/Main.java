package colorcoder;

import colortypes.MajorColor;
import colortypes.MinorColor;


public class Main {

    public static void main(String[] args) {
    	ColorMatchCode.printAllColors(MajorColor.values());
    	ColorMatchCode.printAllColors(MinorColor.values());
    	ColorCoderTest.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
    	ColorCoderTest.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);
    
    	ColorCoderTest.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
    	ColorCoderTest.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
    }
}
