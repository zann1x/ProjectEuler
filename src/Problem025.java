import java.math.BigInteger;

/*
 * Find the index of the first term in the Fibonacci sequence to contain 1000 digits.
 * Answer: 4782
 */

public class Problem025 {

	public void fibonacci(final int DIGITS) {
		BigInteger lowerBound = BigInteger.TEN.pow(DIGITS - 1);
		BigInteger prev = BigInteger.ONE;
		BigInteger curr = BigInteger.ONE;
		BigInteger tmp = BigInteger.ZERO;
		
		int i = 2;
		for ( ; curr.compareTo(lowerBound) <= 0; i++) {
			tmp = curr.add(prev);
			prev = curr;
			curr = tmp;
		}
		
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();
		
		Problem025 p = new Problem025();
		p.fibonacci(1000);
		
		clock.stop();
	}
	
}
