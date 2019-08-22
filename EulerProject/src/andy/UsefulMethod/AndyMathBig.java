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
}
