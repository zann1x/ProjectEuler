/*
 * Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.
 * Answer: 443839
 */

import java.util.ArrayList;
import java.util.List;

public class Problem030 {

    private void buildFifthPowers(int[] fifthPowers) {
        for (int i = 0; i < fifthPowers.length; i++) {
            fifthPowers[i] = i;
            for (int j = 0; j < 4; j++) {
                fifthPowers[i] *= i;
            }
        }
    }

    public void solve() {
        int fifthPowers[] = new int[10];
        List<Integer> numbers = new ArrayList<>();
        
        buildFifthPowers(fifthPowers);

        int sum;
        for (int i = 2; i < 355000; i++) { // upper bound -> 6 * 9^5
            sum = 0;
            int tmp = i;
            while (tmp > 0) {
                int num = tmp % 10;
                tmp /= 10;

                sum += fifthPowers[num];
            }

            if (sum == i) {
                numbers.add(sum);
            }
        }

        sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Stopwatch clock = new Stopwatch();
        clock.start();

        Problem030 p = new Problem030();
        p.solve();

        clock.stop();
    }

}
