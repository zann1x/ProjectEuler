/*
 * Find the sum of all amicable numbers under 10000
 * Answer: 31626
 */

public class Problem021 {

	private int max = 10000;
	int sum1 = 0, sum2 = 0, sumPair = 0;

	public void findAmicableNums() {
		for (int i = 1; i <= max; i++) {
			sum1 = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0)
					sum1 += j;
			}

			sum2 = 0;
			for (int k = 1; k < sum1; k++) {
				if (sum1 % k == 0)
					sum2 += k;
			}

			if (sum1 != sum2 && sum2 == i)
				sumPair += i;
		}
		System.out.println(sumPair);
	}

	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();

		Problem021 p = new Problem021();
		p.findAmicableNums();

		clock.stop();
	}

}
