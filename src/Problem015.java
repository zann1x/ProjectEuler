/*
 * Find the number of routes that can be taken from the top left to the bottom right in a 20x20 grid.
 * Answer: 137846528820
 */

public class Problem015 {

	public static void main(String[] args) {
		
		Stopwatch clock = new Stopwatch();
		clock.start();

		long[][] grid = new long[21][21];

		// fill up the first row and the first column with a "1" to add up the following possible paths
		for (int i = 0; i < grid.length; i++) {
			grid[i][0] = 1;
			grid[0][i] = 1;
		}

		for (int i = 1; i < grid.length; i++) {
			for (int j = 1; j < grid.length; j++) {
				grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
			}
		}

		System.out.println(grid[20][20]);
		clock.stop();
	}

}
