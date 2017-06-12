/*
 * Find the 10.001st prime number
 * Answer: 104743
 */

public class Problem007 {
	public static boolean isPrime(int num) {
		if (num <= 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();
		int primeCount = 0;
		int prime = 1;
		while (primeCount < 10001) {
			prime++;
			if (isPrime(prime)) {
				primeCount++;
			}
		}
		System.out.println(prime);
		clock.stop();
	}
}
