package andy.EulerProjectAns;

import andy.UsefulMethod.*;
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

public class Problem046 {

	
	public static void main(String[] args) {
		int oddComposite = getOddComposite(2);
		while(isFactorizable(oddComposite)) {
			oddComposite = getOddComposite(oddComposite);
		}
		
		System.out.println(oddComposite);
		// Output: 5777

	}
	
	
	private static int getOddComposite(int from) {
		do {
			from++;
		}
		while(AndyMath.isPrime(from) || from % 2 == 0);
		return from;
	}

	private static boolean isFactorizable(int input) {
		// Test for is K exist
		int[] primes = {2};
		while (primes[primes.length-1] < input) {
			primes = AndyArr.addElement(primes, AndyMath.getPrime(primes.length-1));
		}
		
		for (int p=0; p<primes.length; p++) {
			int maxK = (int) Math.ceil(Math.abs(Math.sqrt((input - primes[p]) / 2)));
			
			for (int k=1; k<= maxK; k++) {
				if (input == (primes[p] + 2* Math.pow(k, 2))) return true;
			}
			
		}
		
		return false;
	}
}
