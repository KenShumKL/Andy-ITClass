package andy.UsefulMethod;

import java.util.Random;

/**
 * 
 * @author Andy
 *
 */

public class AndyMathRan {
	
	static Random random = new Random();

	/**
	 * 
	 * @param from
	 * @param to
	 * @return A random integer between from and to inclusive
	 * @throws Exception When from > to
	 */
	public static int getRandom(int from, int to) throws Exception {
		if (from > to ) throw new Exception("getRanInt: from > to");
		if (from == to) return from;
		return random.nextInt(to)+from;
	}
	
	/**
	 * 
	 * @param from
	 * @param to
	 * @return A random double between from and to inclusive
	 * @throws Exception When from > to
	 */
	public static double getRandom(double from, double to) throws Exception {
		if (from > to ) throw new Exception("getRanInt: from > to");
		if (from == to) return from;
		return from + (random.nextDouble()*(to - from));
	}
	
}
