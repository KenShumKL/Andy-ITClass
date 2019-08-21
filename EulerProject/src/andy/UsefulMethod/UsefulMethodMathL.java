package andy.UsefulMethod;

/**
 * 
 * @author Andy
 *For long use.
 */

public class UsefulMethodMathL {

	public static boolean isPrime(long input) {
		if (input <= 1) return false;
		if (input == 2) return true;
		for (long i=2; i <=(long) Math.abs(Math.sqrt(input)); i++) if (input % i == 0) return false;
		return true;
	}
	
	public static long getPrime(long from) {
		while (!isPrime(++from));
		return from;
	}
	
	public static long getFibonacci(long pos) {
		if (pos < 1) return -1;
		if (pos == 1 || pos == 2) return 1;
		
		return getFibonacci(pos-2) + getFibonacci(pos-1);
	}

	public static long getGCD(long a, long b) {
		// a OR b should NOT be 0 or negative 
		if(b==0) return a; 
		return (a % b == 0)? b: getGCD(b, a % b);
	}
	
	public static long getLCM(long a, long b) {
		// a OR b should NOT be 0 or negative 
		return (a*b) / getGCD(a, b);
	}
	
	public static long getFactorial(long input) {
		if (input < 0) return -1;
		if (input == 0 || input == 1) return 1;
		
		return input * getFactorial(input-1);
	}
}
