package andy.EulerProjectAns;

import java.math.BigInteger;
import andy.UsefulMethod.AndyMathBig;;

/**
 * 
 * @author Andy
 *
 */

//Factorial digit sum
public class Problem020 {

	public static void main(String[] args) {
		BigInteger factorial = AndyMathBig.getFactorial(100);
		System.out.println(AndyMathBig.getDigitSum(factorial)); // The answer should be 648.
	}

}
