package andy.UsefulMethod;

//import java.math.*;
import java.util.*;

/**
 * 
 * @author Andy
 *
 * Hello guys, I am Andy.
 * Positive integer : where the integer >0
 */

@SuppressWarnings("unused")
public class UsefulMethodMath {
	
	/**
	 * 
	 * @param input : an Integer
	 * @return true for a prime number, else return false.
	 * 
	 * A prime number should be >1 and it is an integer.
	 * @link https://en.wikipedia.org/wiki/Prime_number
	 */
	public static boolean isPrime(int input) {
		
		if (input <= 1) return false;
		if (input == 2) return true;
		for (int i=2; i <=(int) Math.abs(Math.sqrt(input)); i++) if (input % i == 0) return false;
		return true;
	}
	
	/**
	 * 
	 * @param from
	 * @return The next prime number after "from"
	 * 
	 * 
	 */
	public static int getPrime(int from) {
		while (!isPrime(++from));
		return from;
	}
	
	/**
	 * 
	 * @param pos :any positive integer 
	 * @return The next Fibonacci number at "pos"
	 * 
	 * @link https://en.wikipedia.org/wiki/Fibonacci
	 */
	public static int getFibonacci(int pos) {
		if (pos < 1) return -1;
		if (pos == 1 || pos == 2) return 1;
		
		return getFibonacci(pos-2) + getFibonacci(pos-1);
	}

	/**
	 * 
	 * @param a :any positive integer 
	 * @param b :any positive integer 
	 * @return GCD(i.e. HCF) of a and b 
	 */
	public static int getGCD(int a, int b) {
		// a OR b should NOT be 0 or negative 
		if(b==0) return a; 
		return (a % b == 0)? b: getGCD(b, a % b);
	}
	
	/**
	 * 
	 * @param a :any positive integer 
	 * @param b :any positive integer 
	 * @return LCM of a and b 
	 */
	public static int getLCM(int a, int b) {
		// a OR b should NOT be 0 or negative 
		return (a*b) / getGCD(a, b);
	}
	
	/**
	 * 
	 * @param input :any positive integer 
	 * @return Factorial of input, i.e. 
	 * let input be n, 
	 * return n!
	 */
	public static int getFactorial(int input) {
		if (input < 0) return -1;
		if (input == 0 || input == 1) return 1;
		
		return input * getFactorial(input-1);
	}
	
	/**
	 * 
	 * @param input
	 * @return true for input is an integer
	 */
	public static boolean isInt(double input) {
		if(Math.abs(input-((int)input)) <= 0.01 ) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isInt(float input) {
		if(Math.abs(input-((int)input)) <= 0.01 ) {
			return true;
		} else {
			return false;
		}
	}
	
}
