package colortypes;

public enum MinorColor implements Color{
	 BLUE(0),
     ORANGE(1),
     GREEN(2),
     BROWN(3),
     SLATE(4);
	private int index;
	
	MinorColor(int index) {
		 this.index = index;
	}

	public int getIndexOfColor() {
		return index;
	}

	public Color getColorFromIndex(int index) {
		return MinorColor.values()[index];
	}

}
