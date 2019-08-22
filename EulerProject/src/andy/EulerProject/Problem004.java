package andy.EulerProject;


/**
 * 
 * @author Andy
 *
 *For this problem you just need to fill in the correct code to replace "What"
 */

//Largest palindrome product
public class Problem004 {

	public static void main(String[] args) {
		boolean trigger = false;
		for (int j=/*What*/; j>=/*What*/; j--) {
			for (int i=/*What*/; i>=/*What*/; i--) {
				String productOfJI = Integer.toString(j*i);
				if (productOfJI.charAt(0) == productOfJI.charAt(productOfJI.length()-1)) {
					System.out.println(productOfJI); //The answer should be 990009
					trigger = true;
					break;
				}
			}
			if (trigger) break;
		}
	}

}
