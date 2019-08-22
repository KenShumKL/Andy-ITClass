package andy.EulerProjectAns;

import andy.UsefulMethod.UsefulMethodMath;; 

/**
 * 
 * @author Andy
 *
 */

//10001st prime
public class Problem007 {

	public static void main(String[] args) {

		int prime = 0;
		for (int i=0; i<10001; i++) {
			prime = UsefulMethodMath.getPrime(prime);
		}
		
		System.out.println(prime); // The answer should be 104743.
	}

}
