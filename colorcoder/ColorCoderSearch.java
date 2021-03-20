package colorcoder;

import colortypes.MajorColor;
import colortypes.MinorColor;

public class ColorCoderSearch {
	
	   static ColorPair getColorFromPairNumber(int pairNumber) {
	        int zeroBasedPairNumber = pairNumber - 1;
	        MajorColor majorColor = 
	            (MajorColor) ColorMatchCode.getColorFromIndex(zeroBasedPairNumber / MinorColor.values().length, MajorColor.values());
	        MinorColor minorColor =
	        		(MinorColor) ColorMatchCode.getColorFromIndex(zeroBasedPairNumber %  MinorColor.values().length, MinorColor.values());
	        return new ColorPair(majorColor, minorColor);
	    }
	    
	    static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
	        return major.getIndexOfColor() *  MinorColor.values().length + minor.getIndexOfColor() + 1;
	    }

}
