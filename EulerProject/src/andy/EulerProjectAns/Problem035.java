package andy.EulerProjectAns;

import andy.UsefulMethod.*;

public class Problem035 {
	
	public static void main(String arg[]) {
		int primeCount = 0;
		
		for (int i=1; i<1000000; i++) {
			if (isCircularPrime(i)) primeCount++;
		}
		
		System.out.println(primeCount);
		// Output: 55
		// Answer correct.
	}
	
	public static boolean isCircularPrime(int input) {
		String inputS = Integer.toString(input);
		for (int i=0; i<inputS.length(); i++) {
			if (!(AndyMath.isPrime(Integer.parseInt(AndyStr.rotate(inputS, i))))) return false;
		}
		return true;
	}
}
