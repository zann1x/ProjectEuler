import java.math.BigInteger;

/*
 * Find the sum of the digits of the number 2^1000.
 * Answer: 1366
 */

public class Problem016 {

	public static void main(String[] args) {

		Stopwatch clock = new Stopwatch();
		clock.start();

		BigInteger zero = BigInteger.ZERO;
		BigInteger ten = BigInteger.TEN;
		BigInteger result = zero;
		BigInteger number = BigInteger.valueOf(2).pow(1000);

		while (number.compareTo(zero) > 0) {
			result = result.add(number.mod(ten));
			number = number.divide(ten);
		}

		System.out.println(result);
		clock.stop();
	}

}
