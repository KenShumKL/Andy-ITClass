package andy.EulerProject;

import andy.UsefulMethod.AndyMath;

/**
 * 
 * @author Andy
 *
 */

//Digit factorials	
public class Problem034 {
	
	public static void main(String[] arg) {
		
		int sum = 0;
		
		for (int i=3; i<=/*???*/; i++) {
			if (digitFactorial(i) == i) sum += i;
		}
		
		System.out.println(sum); // The answer should be 40730.
	}
	
	
	
	static int digitFactorial(int input) {
		int sum = 0;
		String inputS = Integer.toString(input);
		
		for (int i=0; i<inputS.length(); i++) {
			 sum += AndyMath.getFactorial(Integer.parseInt(Character.toString(inputS.charAt(i))));
		}
		
		return sum;
	}
}
	
