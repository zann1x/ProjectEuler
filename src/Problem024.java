import java.util.Arrays;

/*
 * Find the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9.
 * Answer: 2783915460
 */

public class Problem024 {

	private void permutate(int[] input) {
		int i = input.length - 1;
		while (i > 0 && input[i - 1] >= input[i])
			i--;
		if (i <= 0)
			return;

		int j = input.length - 1;
		while (input[j] <= input[i - 1])
			j--;

		int tmp = input[j];
		input[j] = input[i - 1];
		input[i - 1] = tmp;

		j = input.length - 1;
		while (i < j) {
			tmp = input[i];
			input[i] = input[j];
			input[j] = tmp;
			i++;
			j--;
		}
	}

	public void solve(int nthPermutation, int[] input) {
		int n = nthPermutation - 1;

		Arrays.sort(input);

		for (int i = 0; i < n; i++) {
			permutate(input);
		}

		for (int i : input) {
			System.out.print(i);
		}
	}

	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();

		Problem024 p = new Problem024();
		p.solve(1000000, new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 });

		clock.stop();
	}

}
