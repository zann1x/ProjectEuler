/*
 * Find the product abc where the pythagorean triplet is a+b+c=1000
 * Answer: 31875000
 */

public class Problem009 {

	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();
		//
		int a, b, c;
		int m = 1000;
		int prod = 0;

		for (a = 1; a < m / 3; a++) {
			for (b = a; b < m / 2; b++) {
				c = m - a - b;

				if ((a * a) + (b * b) == (c * c)) {
					if ((a + b + c) == 1000) {
						prod = a * b * c;
						break;
					}
				}

			}
		}

		System.out.println(prod);

		clock.stop();
	}
}
