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
	
	
	
	/**
	 * 
	 * @param a input -1 for unknown 
	 * @param b input -1 for unknown
	 * @param c hypotenuse, input -1 for unknown
	 * @param angleA Opposite Angle of a, input -1 for unknown
	 * @param angleB Opposite Angle of b, input -1 for unknown
	 * @param angleC Opposite Angle of c, input -1 for unknown
	 * @return An array
	 */
	public static double[] toTriArr(
			double a, double b, double c, 
			double angleA, double angleB, double angleC
			) throws Exception{
		
		double[] triangle = {a ,b, c, angleA, angleB, angleC};
		
		if (c != Math.max(a, Math.max(b, c))) throw new Exception("toTriArr: c is not the hypotenuse");
		return triangle;
	}
	
	/**
	 * 
	 * @return Unfinished
	 */
	public static double[] solveTriangle(double[] triangle) {
		
		// Try Pythagorean theorem
		
		
		// Check for solvable
		
		
		
		
		
		
		
		
		return null;
	}
	
	/**
	 * 
	 * @return Unfinished
	 */
	public static double[] lawOfCotangent() {
		return null;
	}
}
