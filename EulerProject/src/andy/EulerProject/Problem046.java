package andy.EulerProject;

import andy.UsefulMethod.AndyArr;
import andy.UsefulMethod.AndyMath;
/**
 * 
 * @author Andy
 *
 * OCN : odd composite number
 * P : prime
 * K : Any positive integer
 * 
 * OCN = P +  2* K^2
 */

//Goldbach's other conjecture
public class Problem046 {

	
	public static void main(String[] args) {
		int oddComposite = getOddComposite(2);
		while(isFactorizable(oddComposite)) {
			oddComposite = getOddComposite(oddComposite);
		}
		
		System.out.println(oddComposite);
		// The answer should be 5777.

	}
	
	
	private static int getOddComposite(int from) {
		//???????????
		return from;
	}

	private static boolean isFactorizable(int input) {
		// Test for is K exist
		int[] primes = {2};
		//???????????
		
		return false;
	}
}
