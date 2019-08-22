package andy.EulerProject;

import andy.UsefulMethod.AndyMath;

/**
 * 
 * @author Andy
 *
 */

// Highly divisible triangular number
public class Problem012 {

	public static void main(String[] args) {
        long i = 1l;
        long triNum = AndyMath.getTriangleNum(i);
              
        // I used 2 hours to simplify this question.
        
        System.out.println(triNum); // The answer should be 76576500.
    }
}
