import java.util.ArrayList;
import java.util.List;

/*
 * Find the largest prime factor of the number 600.851.475.143.
 * Answer: 6857
 */

public class Problem003 {

	public static List<Long> calculate(long num) {
		ArrayList<Long> factors = new ArrayList<>();
		for (long i = 2L; i <= num; i++) {
			if (num % i == 0) {
				factors.add(i);
				num /= i;
			}
		}
		return factors;
	}

	public static void main(String[] args) {
		for (long result : calculate(600851475143L)) {
			System.out.println(result);
		}
	}

}
