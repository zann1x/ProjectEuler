import java.util.ArrayList;
import java.util.List;

/*
 * Find the sum of all primes below 2 million
 * Answer: 142913828922
 */

public class Problem010 {

	public static List<Integer> findPrimes(int limit) {
		// Algorithm: Sieve of however the f** he's called
		List<Integer> list = new ArrayList<>();

		int limitSQRT = (int) Math.sqrt(limit);
		boolean[] isComposite = new boolean[limit + 1];

		for (int i = 2; i <= limitSQRT; i++) {
			if (!isComposite[i]) {
				System.out.println(i + " ");
				list.add(i);
				for (int j = i * i; j <= limit; j += i) {
					isComposite[j] = true;
				}
			}
		}
		for (int i = limitSQRT + 1; i <= limit; i++) {
			if (!isComposite[i]) {
				System.out.println(i + " ");
				list.add(i);
			}
		}

		return list;
	}

	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();
		//
		long sum = 0;
		for (long i : findPrimes(25)) {
			sum += i;
		}
		System.out.println(sum);
		//
		clock.stop();
	}

}
