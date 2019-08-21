package andy.EulerProject;

import andy.UsefulMethod.*;

/**
 * 
 * @author Andy
 *
 */

//Multiples of 3 and 5
public class Problem001 {
	
	public static void main(String[] arg) {
		int sum = 0;
		
		for (int i=1; i<1000; i++) {
			if (/*What*/) {
				sum += i;
			} else if (/*What*/) {
				sum += i;
			}//
		}
		
		System.out.println(sum); //The correct answer should be 233168.
		
	}
	
	private static boolean isDivisible3(int input) {
		return (input % 3 == 0)? true: false;
	}
	
	private static boolean isDivisible5(int input) {
		return (input % 5 == 0)? true: false;
	}
	
}
