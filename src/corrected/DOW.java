package corrected;

public class DOW {
	/**
	 * An array of Strings containing Days of week in a Sequential manner.
	 */
	private static final String[] daysOfWeek = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday",
			"Sunday" };

	public static String DayOfWeek(int day) {
		return daysOfWeek[day - 1];
	}
}
