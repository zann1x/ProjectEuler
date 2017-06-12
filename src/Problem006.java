/*
 * Find the difference between the sum of the squares of the first hundred natural numbers and the square of the sum
 * Answer: 25164150
 */

public class Problem006 {
	public static void main(String[] args) {
		int sum = 0;
		int sqrSum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i * i;
			sqrSum += i;
		}
		sqrSum *= sqrSum;
		System.out.println(sqrSum - sum);
	}
}
