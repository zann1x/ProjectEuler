import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it
 * into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the
 * list to obtain a name score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list.
 * So, COLIN would obtain a score of 938 × 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 * 
 * Answer: 871198282
 */

public class Problem022 {

	private String[] names;
	private int nameSum = 0;
	BigInteger sumTotal = BigInteger.ZERO;

	public void readSingleNamesFromFile() {
		Scanner in = null;
		try {
			in = new Scanner(Paths.get("./files/Problem022.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		while (in.hasNext()) {
			names = in.nextLine().split(",");
		}
		in.close();
	}

	public void extractAndSortNames() {
		// for (int i = 0; i < names.length; i++) {
		// names[i].replaceAll("\"", "");
		// }
		Arrays.sort(names);
	}

	public void sum() {
		for (int i = 0; i < names.length; i++) {
			nameSum = 0;
			for (int j = 1; j < (names[i].length() - 1); j++) {
				nameSum += (int) (names[i].charAt(j) - 64);
			}
			sumTotal = sumTotal.add(BigInteger.valueOf(nameSum * (i + 1)));
		}
		System.out.println(sumTotal);
	}

	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();

		Problem022 p = new Problem022();
		p.readSingleNamesFromFile();
		p.extractAndSortNames();
		p.sum();

		clock.stop();
	}

}
