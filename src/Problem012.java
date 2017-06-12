import java.text.DecimalFormat;

/*
 * Find the first triangle number to have over 500 divisors.
 * Answer: 76576500
 */

public class Problem012 {

	private int tri;

	public void doStuff() {
		boolean stop = false;
		int n = 1;
		while (!stop) {
			int counter = 0;

			tri = n * (n + 1) / 2;

			for (int i = 1; i < Math.sqrt(tri); i++) {
				if (tri % i == 0) {
					counter += 2;
				}
				if (counter > 500) {
					DecimalFormat f = new DecimalFormat();
					System.out.println(f.format(tri));
					stop = true;
				}
			}
			n++;
		}
	}

	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();
		Problem012 p = new Problem012();
		p.doStuff();
		clock.stop();
	}

}
