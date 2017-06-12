import java.math.BigInteger;

/*
 * Find the sum of the digits of 100! (factorial of 100)
 * Answer: 648
 */

public class Problem020 {

	public void doStuff(int num) {
		BigInteger product = BigInteger.valueOf(1);
		BigInteger sum = BigInteger.valueOf(0);
		
		for (int i = num; i >= 1; i--) {
			product = product.multiply(BigInteger.valueOf(i));
		}
		
		String s = product.toString();
		
		for (int i = 0; i < s.length(); i++) {
			sum = sum.add(BigInteger.valueOf(Integer.parseInt(s.substring(i, i+1))));
		}
		
		System.out.println(sum.toString());
	}
	
	public static void main(String[] args) {
		Stopwatch clock = new Stopwatch();
		clock.start();
		
		Problem020 p = new Problem020();
		p.doStuff(100);
		
		clock.stop();
	}
	
}
