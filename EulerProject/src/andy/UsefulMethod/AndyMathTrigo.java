package andy.UsefulMethod;

/**
 * 
 * @author Andy 
 * 
 * 
 * @Description For Trigonometry problem
 */

public class AndyMathTrigo {

	/**
	 * 
	 * @param m >n
	 * @param n >0, coprime with m, where both cannot be odd
	 * @return Array with of 3, where arr[0] = a, arr[1] = b, arr[2] = c
	 * If Array is null, that means error occurs, e.g. 
	 * m and n are not coprime
	 */
	public static int[] getPythagoreanTriplet(int m, int n) {
		if (AndyMath.getGCD(m, n) != 1) {
			return new int [0];
		}
		int a = (int) (Math.pow(m, 2) - Math.pow(n, 2));
		int b = 2 * m * n;
		int c = (int) (Math.pow(m, 2) + Math.pow(n, 2));
		
		int [] temp = {a, b, c};
		return temp;
		
	}
}
