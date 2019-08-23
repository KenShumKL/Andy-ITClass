package andy.UsefulMethod;

import java.math.*;

/**
 * 
 * @author Andy
 *
 */


public class AndyMathBig {

	/**
	 * 
	 * @param n : Object
	 * @param r : Sample
	 * @return nCr
	 */
	public static BigInteger getBinomial(int n, int r) {
		// n!
		BigInteger nFactorial = getFactorial(n);
		// r!
		BigInteger rFactorial = getFactorial(r);
		// (n-r)!
		BigInteger n_rFactorial = getFactorial(n-r);
		// r!(n-r)!
		BigInteger denominator = rFactorial.multiply(n_rFactorial);
		
		
		BigInteger result = nFactorial.divide(denominator);
		
		return result;
		
	}
	
	/**
	 * 
	 * @param input : any positive integer 
	 * @return Factorial of input, i.e. 
	 * let input be n, 
	 * return n!
	 */
	public static BigInteger getFactorial(int number) {
		BigInteger factorial = BigInteger.ONE;
		for (int i = number; i > 0; i--) {
			factorial = factorial.multiply(BigInteger.valueOf(i)); 
		} 
		return factorial;
	}
	
	/**
	 * 
	 * @param input BigInteger
	 * @return Sum of their digit
	 */
	public static long getDigitSum(BigInteger input) {
		String inputS = input.toString();
		long sum = 0l;
		for (int i=0; i<inputS.length(); i++) {
			sum += Integer.parseInt(Character.toString(inputS.charAt(i)));
		}
		return sum; 
	}
	
	/**
	 * 
	 * @param pos : any positive integer 
	 * @return The next Fibonacci number at "pos"
	 * 
	 * @link https://en.wikipedia.org/wiki/Fibonacci
	 */
	public static BigInteger getFibonacci(int pos) {
		if (pos == 1 || pos == 2) return BigInteger.ONE;
		
		int posCount = 3;
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;
		BigInteger c = BigInteger.ZERO;
		
		while (posCount <= pos) {
			c = a.add(b);
			a = b;
			b = c;
			posCount++;
		}
		return c;
		
	}
	
}
