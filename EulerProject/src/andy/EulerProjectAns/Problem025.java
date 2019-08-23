package andy.EulerProjectAns;

import andy.UsefulMethod.AndyMathBig;

/**
 * 
 * @author Andy
 *
 */

//1000-digit Fibonacci number
public class Problem025 {

	public static void main(String[] args) {
		System.out.println(method1());
		System.out.println("===============================");
		System.out.println(method2());
		
		// The answer should be 4782.
	}
	
	private static int method1() {
		int pos = 0;
		while (AndyMathBig.getFibonacci(++pos).toString().length() < 1000);	
		return pos;
	}
	
	private static int method2() {
		// For those who are extreme good at Mathematics.
		double goldenRatio = (1+Math.sqrt(5))/2;
		System.out.println("Golden Ratio: " + goldenRatio);
		return (int) Math.round((((Math.log10(10) * 999) + (Math.log10(5)/2)) / Math.log10(goldenRatio)));
	}
}
