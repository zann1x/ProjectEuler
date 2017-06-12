/*
 * Find the number under one million which produces the longest chain of the Collatz sequence (..., 4, 2, 1).
 * Answer: 837799
 */

public class Problem014 {

	public static void main(String[] args) {
		
		Stopwatch clock = new Stopwatch();
		clock.start();

		long largest = 0;
		int largestCount = 0;

		for (int i = 2; i < 1_000_000; i++) {
			long tmp = i;
			int counter = 1;

			while (tmp > 1) {
				if (tmp % 2 == 0)
					tmp /= 2;
				else if (tmp % 2 != 0)
					tmp = tmp * 3 + 1;

				counter++;
			}

			if (counter > largestCount) {
				largestCount = counter;
				largest = i;
			}
		}

		System.out.println(largest);
		clock.stop();
	}

}
