public class GoKart {
	public static final int MAX_BARS = 8;
	private String mColor;
	private int mBarsCount;

	public GoKart(String color) {
		mColor = color;
		mBarsCount = 0;
	}

	public boolean isBatteryEmpty () {
		return mBarsCount == 0;
	}

	public String getColor() {
		return mColor;
	}

	public void charge() {
		mBarsCount = MAX_BARS;
	}
}