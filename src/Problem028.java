/*
 * Find the sum of the numbers on the diagonals in a 1001x1001 clockwise spiral.
 * Answer: 669171001
 */

import java.math.BigInteger;

public class Problem028 {

	public void solve() {
		BigInteger sum = BigInteger.ONE;
		BigInteger numAtCorner = BigInteger.ONE;

		int cornerDiff = 2;
		int spiralSize = 1;

		while (spiralSize < 1001) {
			// four corners per level (excluding the 1 at the first level)
			for (int i = 0; i < 4; i++) {
				numAtCorner = numAtCorner.add(BigInteger.valueOf(cornerDiff));
				sum = sum.add(numAtCorner);
			}

			cornerDiff += 2;
			spiralSize += 2;
		}

		System.out.println(sum.toString());
	}

	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();

		Problem028 p = new Problem028();
		p.solve();

		clock.stop();
	}

}
