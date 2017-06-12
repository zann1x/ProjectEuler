import java.util.Calendar;
import java.util.Date;

/*
 * Find the number of Sundays, which fell on the first of the month during the 20th century (01.01.1901 - 31.12.2000)
 * Answer: 171
 */

public class Problem019 {

	private void getSundays(Calendar startDate, Calendar endDate) {
		int dayCount = 0;
		while (startDate.before(endDate)) {
			if (startDate.get(Calendar.DAY_OF_WEEK) == 1) {
				dayCount++;
			}
			startDate.add(Calendar.MONTH, 1);
		}
		
		System.out.println(dayCount);
	}
	
	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();
		
		Calendar startDate = Calendar.getInstance();
		startDate.set(1901, 0, 1);
		
		Calendar endDate = Calendar.getInstance();
		endDate.set(2000, 11, 31);
		
		Problem019 p = new Problem019();
		p.getSundays(startDate, endDate);
		
		clock.stop();
	}

}
