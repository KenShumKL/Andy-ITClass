package andy.EulerProjectAns;

import andy.UsefulMethod.AndyMath;

/**
 * 
 * @author Andy
 * For this question, Question 34
 * I am not sure is this is the answer or not
 *
 */
public class Problem034 {
	
	public static void main(String[] arg) {
		
		int sum = 0;
		
		for (int i=3; i<=2540161; i++) {
			if (digitFactorial(i) == i) sum += i;
		}
		
		System.out.println(sum);
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
	
