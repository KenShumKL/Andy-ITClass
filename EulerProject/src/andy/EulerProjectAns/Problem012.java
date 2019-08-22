package andy.EulerProjectAns;

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
              
        while(AndyMath.getNoOfDivisor(triNum) <= 500) {
            triNum = AndyMath.getTriangleNum(++i);
        }
        System.out.println(triNum); // The answer should be 76576500.
    }
}
