/*
 * Find the product of the coefficients, a and b, for the quadratic expression n^2+an+b that produces the maximum number of primes for consecutive values of n, starting with n=0.
 * Answer: -59231
 */

public class Problem027 {
	
	private boolean isPrime(int num) {
		if (num < 2)
			return false;
		else if (num == 2)
			return true;
		else if (num % 2 == 0)
			return false;
		else {
			for (int i = 3, end = (int) Math.sqrt(num); i <= end; i += 2) {
				if (num % i == 0)
					return false;
			}
			return true;
		}
	}
	
	private int getNumberOfConsecutivePrimes(int a, int b) {
		for (int i = 0; ; i++) {
			int res = i * i + i * a + b;
			if (!isPrime(res))
				return i;
		} 
	}
	
	public void solve() {
		int maxPrimes = 0;
		int maxA = 0;
		int maxB = 0;
		
		for (int a = -999; a < 1000; a++) {
			for (int b = -1000; b <= 1000; b++) {
				int num = getNumberOfConsecutivePrimes(a, b);
				if (num > maxPrimes) {
					maxPrimes = num;
					maxA = a;
					maxB = b;
				}
			}
		}
		int result = maxA * maxB;

		System.out.println(result);
	}

	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();
		
		Problem027 p = new Problem027();
		p.solve();
		
		clock.stop();
	}
}