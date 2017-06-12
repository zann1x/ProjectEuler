/*
 * Find the number of letters that are used to write the number 1 to 1000, spaces and hyphens excluded.
 * Answer: 21124
 */

public class Problem017 {

	public static String[] ones = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
			"fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	public static String[] tens = { "", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	public static String[] hundreds = { "", "onehundred", "twohundred", "threehundred", "fourhundred", "fivehundred", "sixhundred", "sevenhundred",
			"eighthundred", "ninehundred" };

	public String word(int word) {

		if (word < 20) {
			return ones[word];
		}

		if (word < 100) {
			return tens[word / 10] + ones[word % 10];
		}

		if (word < 1000) {
			if (word % 100 != 0) {
				String withAnd = "and" + word(word % 100);
				return hundreds[word / 100] + withAnd;
			} else {
				return hundreds[word / 100];
			}
		}

		if (word == 1000) {
			return "onethousand";
		}

		return null;
	}

	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();

		Problem017 p = new Problem017();

		int result = 0;

		for (int i = 1; i <= 1000; i++) {
			result += p.word(i).length();
		}

		System.out.println(result);
		clock.stop();
	}

}
