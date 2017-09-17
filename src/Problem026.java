/*
 * Find the value of d < 1000 for which 1/d contains the longest recurring cycle in its decimal fraction part.
 * Answer: 983
 */

public class Problem026 {

	public void findLongestRecurringCycle(int max) {
		int longestCycle = 0;
		int biggestD = 0;
		
		for (int i = 2; i < max; i++) {
			int value = 1;
			int position = 0;
			int remainders[] = new int[i + 1];
			
			while (value != 0 && remainders[value] == 0) {
				remainders[value] = position;
				value *= 10;
				value %= i;
				position++;
			}
			
			if (position - remainders[value] > longestCycle) {
				longestCycle = position - remainders[value];
				biggestD = i;
			}
		}
		
		System.out.println("Longest Cycle length is " + longestCycle + " at value " + biggestD);
	}

	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();

		Problem026 p = new Problem026();
		p.findLongestRecurringCycle(1000);

		clock.stop();
	}

}
