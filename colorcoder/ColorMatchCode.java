package colorcoder;

import colortypes.Color;

public class ColorMatchCode {
	public static Color getColorFromIndex(int index, Color[] values) {
		return values[index];
	}

	public static void printAllColors(Color[] values) {
		for (Color col : values) {
			System.out.println(col + " at index " + col.getIndexOfColor());
		}
	}
}
