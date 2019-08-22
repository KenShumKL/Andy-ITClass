package andy.EulerProjectAns;

import andy.UsefulMethod.AndyMath;

/**
 * 
 * @author Andy
 *
 */

//Even Fibonacci numbers
public class Problem002 {

	public static void main(String[] args) {
		int i = 2;
		int next = AndyMath.getFibonacci(2);
		int sum = 0;
		
		while(next <= 4000000) {
			if (next % 2 == 0) sum += next;
			next = AndyMath.getFibonacci(++i);
		}
		
		System.out.println(sum); // The answer should be 4613732.
		
	}
	
}
