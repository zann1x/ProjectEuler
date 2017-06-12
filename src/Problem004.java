/*
 * Find the largest palindrome made from the product of two 3-digit-numbers
 * Answer: 906609
 */

public class Problem004 {

	public static boolean checkNum(long num) {
		long reverse = 0;
		long check = num;
		while (check > 0) {
			reverse = (reverse * 10) + (check % 10);
			check /= 10;
		}

		return reverse == num;
	}

	public static void main(String[] args) {
		long num = 0;
		long largest = 0;
		for (long i = 100; i < 1000; i++) {
			for (long j = 100; j < 1000; j++) {
				num = i * j;
				if (checkNum(num)) {
					if (num > largest) {
						largest = num;
					}
				}
			}
		}
		System.out.println(largest);
	}
}
