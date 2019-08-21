package andy.EulerProjectAns;

import andy.UsefulMethod.UsefulMethodMathL;

/**
 * 
 * @author Andy
 *
 */

public class Problem003 {

	public static void main(String[] args) {
		long target = 600851475143l;
		
		for (long i=target-1; i>=1; i--) {
			if ((target % i == 0) && (UsefulMethodMathL.isPrime(i))) {
				System.out.println(i);
				break;
			}
		}

	}
	


}
