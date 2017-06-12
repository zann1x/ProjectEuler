/*
 * Find the sum of all the multiples of 3 or 5 below 1000. 
 * (below 10: 3 + 5 + 6 + 9 = 23)
 * Answer: 233168
 */

public class Problem001 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("The sum of all multiples is: " + sum);
	}

}
