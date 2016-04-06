public class Easter {
	private Easter() {
	}

	public static String calculateEaster(int aYear) {
		int month, day;
		int a = aYear % 19;
		int b = aYear % 4;
		int c = aYear % 7;

		double k = Math.floor(aYear / 100);
		double p = Math.floor((13 + 8 * k) / 25);
		double q = Math.floor((k / 4));

		// 這邊將他轉型成int, 有沒有可能會造成計算的一些偏差呢?
		int m = (int) (15 - p + k - q) % 30;
		int n = (int) (4 + k - q) % 7;

		int d = (19 * a + m) % 30;
		int e = (2 * b + 4 * c + 6 * d + n) % 7;

		if (d + e - 9 >= 0) {
			month = 4;
			day = (d + e - 9);
			if ((d == 29) && (e == 6)) {
				day = 19;
			}
			// mod 30, not mod 3, -2
			if ((d == 28) && (e == 6) && ((11 * m + 11) % 3 < 19)) {
				day = 18;
			}
		} else {
			month = 3;
			day = 22 + d + e;

		}
		return "In " + aYear + ", Easter Sunday is: month = " + month + " and day = " + day;
	}

}
