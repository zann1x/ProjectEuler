import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Find the maximum total sum from top to bottom of the given triangle.
 * Answer: 1074
 */

public class Problem018 {

	public static final int DEPTH = 15;

	private int[][] triangle = new int[DEPTH][];

	public void findMax() {
		int[] previous = null;
		for (int i = 1; i < DEPTH; i++) {
			// Addiere Zahlen zeilenweise von unten nach oben auf
			previous = calcMaxRow(triangle[DEPTH - i - 1], triangle[DEPTH - i]);
			printToConsole(previous);
		}
	}

	private int[] calcMaxRow(int[] prev, int[] tri) {
		for (int i = 0; i < prev.length; i++) {
			prev[i] += Math.max(tri[i], tri[i + 1]);
		}
		return prev;
	}

	public void readFile() throws Exception {
		BufferedReader br = null;
		String path = "./files/Problem018.txt";
		FileReader file = new FileReader(path);
		br = new BufferedReader(file);
		Scanner sc = null;

		String line = null;
		int i = 0;
		while ((line = br.readLine()) != null) {
			triangle[i] = new int[i + 1];
			int j = 0;
			sc = new Scanner(line);
			while (sc.hasNext()) {
				int value = sc.nextInt();
				triangle[i][j++] = value;
			}
			i++;
		}

		sc.close();
		br.close();
	}

	private void printToConsole(int[] values) {
		for (int value : values) {
			System.out.print("\t" + value);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();

		Problem018 p = new Problem018();
		try {
			p.readFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		p.findMax();

		clock.stop();
	}

}
