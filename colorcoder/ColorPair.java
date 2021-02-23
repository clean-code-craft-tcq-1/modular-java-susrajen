package colorcoder;

import colortypes.MajorColor;
import colortypes.MinorColor;

public class ColorPair {
	  private MajorColor majorColor;
      private MinorColor minorColor;
      
      public ColorPair(MajorColor major, MinorColor minor)
      {
          majorColor = major;
          minorColor = minor;
      }
      public MajorColor getMajor() {
          return majorColor;
      }
      public MinorColor getMinor() {
          return minorColor;
      }
      String ToString() {
          String colorPairStr = MajorColor.values()[majorColor.getIndexOfColor()].toString();
          colorPairStr += " ";
          colorPairStr += MinorColor.values()[minorColor.getIndexOfColor()].toString();
          return colorPairStr;
      }
}
