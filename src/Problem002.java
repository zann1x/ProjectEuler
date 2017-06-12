/*
 * Find the sum of all even-valued fibonacci sequence terms below 4 million.
 * Answer:  4613732
 */

public class Problem002 {

	public static void main(String[] args) {
		int sum_final = 0;
		int sum = 1;
		int sum_prev = 1;
		int temp = 0;
		while (sum < 4000000) {
			temp = sum;
			sum += sum_prev;
			sum_prev = temp;
			if (sum % 2 == 0) sum_final += sum;
		}
		System.out.println("Sum of all even fibonaccis below 4 million: " + sum_final);
	}

}
