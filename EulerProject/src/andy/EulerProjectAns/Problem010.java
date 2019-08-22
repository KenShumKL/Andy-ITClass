package andy.EulerProjectAns;

import andy.UsefulMethod.AndyMath;

/**
 * 
 * @author Andy
 *
 */

//Summation of primes
public class Problem010 {

	public static void main(String[] args) {
		long sum = 0l;
		
		for (int i=2; i<2000000; i++) {
			if (AndyMath.isPrime(i)) sum += i;
		}
		
		System.out.println(sum); // The answer should be 142913828922.
	}

}
