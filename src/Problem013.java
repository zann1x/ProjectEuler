import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

/*
 * Find the first ten digits of the sum of the given one-hundred 50-digit numbers
 * Answer: 5537376230
 */

public class Problem013 {

	private BigInteger result = BigInteger.ZERO;

	public void doStuff() {
		BufferedReader br = null;
		try {
			String path = "./files/Problem013.txt";
			File file = new File(path);
			br = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = br.readLine()) != null) {
				result = result.add(new BigInteger(line));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		printToConsole();
	}

	public void printToConsole() {
		String s = result.toString();
		System.out.println(s.subSequence(0, 10));
	}

	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();
		Problem013 p = new Problem013();
		p.doStuff();
		clock.stop();
	}

}
