package andy.EulerProjectAns;


/**
 * 
 * @author Andy
 *
 */

//Largest palindrome product
public class Problem004 {

	public static void main(String[] args) {
		boolean trigger = false;
		for (int j=999; j>=100; j--) {
			for (int i=999; i>=100; i--) {
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
