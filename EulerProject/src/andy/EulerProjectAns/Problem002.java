package andy.EulerProjectAns;

import andy.UsefulMethod.UsefulMethodMath;

/**
 * 
 * @author Andy
 *
 */

//Even Fibonacci numbers
public class Problem002 {

	public static void main(String[] args) {
		int i = 2;
		long next = (long) UsefulMethodMath.getFibonacci(2);
		long sum = 0l;
		
		while(next <= 4000000) {
			if (next % 2 == 0) sum += next;
			next = (long) UsefulMethodMath.getFibonacci(++i);
		}
		
		System.out.println(sum); // The answer should be 4613732.
		
	}
	
}
