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
public class AndyMath {
	
	// boolean part
	
	
	// Prime
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
	 * @param input : an Integer
	 * @return true for a prime number, else return false.
	 * 
	 * A prime number should be >1 and it is an integer.
	 * @link https://en.wikipedia.org/wiki/Prime_number
	 */
	public static boolean isPrime(long input) {
		if (input <= 1) return false;
		if (input == 2) return true;
		for (long i=2; i <=(long) Math.abs(Math.sqrt(input)); i++) if (input % i == 0) return false;
		return true;
	}
	
	
	/**
	 * 
	 * @param input : any positive integer
	 * @return true : Input is a perfect square
	 *  esle false
	 */
	public static boolean isPerfectSquare(int input) {
		return (isInt(Math.sqrt(input)))? true : false;
	}
	
	/**
	 * 
	 * @param input : any positive integer
	 * @return true : Input is a perfect square
	 *  esle false
	 */
	public static boolean isPerfectSquare(long input) {
		return (isInt(Math.sqrt(input)))? true : false;
	}
	
	
	
	// int part
	
	/**
	 * 
	 * @param from
	 * @return The next prime number after "from"
	 * 
	 */
	public static int getPrime(int from) {
		while (!isPrime(++from));
		return from;
	}
	
	/**
	 * 
	 * @param pos : any positive integer 
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
	 * @param a : any positive integer 
	 * @param b : any positive integer 
	 * @return GCD(i.e. HCF) of a and b 
	 */
	public static int getGCD(int a, int b) {
		// a OR b should NOT be 0 or negative 
		if(b==0) return a; 
		return (a % b == 0)? b: getGCD(b, a % b);
	}
	
	/**
	 * 
	 * @param a : any positive integer 
	 * @param b : any positive integer 
	 * @return LCM of a and b 
	 */
	public static int getLCM(int a, int b) {
		// a OR b should NOT be 0 or negative 
		return (a*b) / getGCD(a, b);
	}
	
	/**
	 * 
	 * @param input : any positive integer 
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
	 * @param row : any positive integer
	 * @return Triangle number (1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...)
	 */
	public static int getTriangleNum(int row){
		if (row < 1l) return -1;
        int sum = 0;
        for (int i=0; i<=row; i++) {
        	sum += i;
        }
        return sum;
    }
	
	/**
	 * 
	 * @param input : any positive integer
	 * @return Number of divisors (factors)
	 */
	public static int getNoOfDivisor(int input) {
        int count = 0;
        int end = (int) Math.sqrt(input);
        for (int i=1; i<=end; i++) {
            if (input % i == 0) count += 2;
        }
        if (isPerfectSquare(input)) count++;
        return count;
    }
	
	
	
	
	
	/*
	 * long part
	 */
	
	
	/**
	 * 
	 * @param from
	 * @return The next prime number after "from"
	 * 
	 */
	public static long getPrime(long from) {
		while (!isPrime(++from));
		return from;
	}
	
	/**
	 * 
	 * @param n : Object : any positive integer
	 * @param r : Sample : any positive integer
	 * @return nCr
	 */
	public static long binomial(int n, int r) {
		long temp;
		
		temp = getFactorial((long) (n - r) );
		temp *= getFactorial((long) r);
		temp = getFactorial((long) n) / temp;
		
		return temp;
	}
	
	/**
	 * 
	 * @param pos :any positive integer 
	 * @return The next Fibonacci number at "pos"
	 * 
	 * @link https://en.wikipedia.org/wiki/Fibonacci
	 */
	public static long getFibonacci(long pos) {
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
	public static long getGCD(long a, long b) {
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
	public static long getLCM(long a, long b) {
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
	public static long getFactorial(long input) {
		if (input < 0) return -1;
		if (input == 0 || input == 1) return 1;
		
		long product = 1l;
		for (long i=1l; i<=input; i++) {
			product *= i;
		}
		
		return product;
	}
	
	/**
	 * 
	 * @param row : any positive number (May cause StackOverflowError)
	 * @return Triangle number (1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...)
	 */
	public static long getTriangleNum(long row){
        if (row < 1l) return -1l;
        long sum = 0l;
        for (long i=0l; i<=row; i++) {
        	sum += i;
        }
        return sum;
    }
	
	
	/**
	 * 
	 * @param input : any positive number
	 * @return Number of divisors (factors)
	 */
	public static long getNoOfDivisor(long input) {
		long count = 0;
		long end = (long) Math.sqrt(input);
        for (long i=1l; i<=end; i++) {
            if (input % i == 0) count += 2;
        }
        if (isPerfectSquare(input)) count++;
        return count;
    }
	
	
	
	
	
	
	
	
	// String Part
	
	/**
	 * 
	 * @param input String contains number ONLY
	 * @return Sum of their digit
	 */
	public static int getDigitSum(String input) {
		int sum = 0;
		for (int i=0; i<input.length(); i++) {
			sum += Integer.parseInt(Character.toString(input.charAt(i)));
		}
		return sum; 
	}
	
	
	
	
	
	
	
	
	/*
	 * Integer compare
	 */
	
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
	
	/**
	 * 
	 * @param input
	 * @return true for input is an integer
	 */
	public static boolean isInt(float input) {
		if(Math.abs(input-((int)input)) <= 0.01 ) {
			return true;
		} else {
			return false;
		}
	}
	
}
