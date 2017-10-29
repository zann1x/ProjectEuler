/*
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 * Answer:
 */

public class Problem030 {

    public void solve() {
        int fifthPowers[] = new int[10];
        for (int i = 0; i < 10; i++) {
            fifthPowers[i] = i;
            for (int j = 0; j < 4; j++) {
                fifthPowers[i] *= i;
            }
        }

        for (int i = 1; i < 355000; i++) { // upper bound -> 6 * 9^5
            // TODO
        }
    }

    public static void main(String[] args) {
        Stopwatch clock = new Stopwatch();
        clock.start();

        Problem030 p = new Problem030();
        p.solve();

        clock.stop();
    }

}
