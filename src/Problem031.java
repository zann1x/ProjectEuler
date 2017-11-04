/*
 * Find the number of different ways 2 pound can be made using any number of coins.
 * Answer: 
 */

import java.util.Arrays;
import java.util.List;

public class Problem031 {

    public void solve() {
    	int possibleWays = 0;
        List<Integer> coins = Arrays.asList(1, 2, 5, 10, 20, 50, 100, 200);

        
    }

    public static void main(String[] args) {
        Stopwatch clock = new Stopwatch();
        clock.start();

        Problem031 p = new Problem031();
        p.solve();

        clock.stop();
    }

}
