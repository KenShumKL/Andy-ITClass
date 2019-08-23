package andy.EulerProjectAns;

import java.math.BigInteger;
import andy.UsefulMethod.AndyMathBig;

/**
 * 
 * @author Andy
 *
 */

//Power digit sum
public class Problem016 {

	public static void main(String[] args)  {
		BigInteger two = new BigInteger("2");
		two = two.pow(1000);
		
		long answer = AndyMathBig.getDigitSum(two);
		
		System.out.println(answer);
	}
}
