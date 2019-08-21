package andy.UsefulMethod;

//import java.math.*;
import java.util.*;

/**
 * 
 * @author Andy
 *
 * Hello guy, I am Andy.
 * Here is some method that is useful for Project Euler and others.
 */

@SuppressWarnings("unused")
public class UsefulMethodMath {
	//Main
	
	public static boolean isPrime(int input) {
		if (input <= 1) return false;
		if (input == 2) return true;
		for (int i=2; i <=(int) Math.abs(Math.sqrt(input)); i++) if (input % i == 0) return false;
		return true;
	}
	
	public static int getPrime(int from) {
		while (!isPrime(++from));
		return from;
	}
	
	public static int getFibonacci(int pos) {
		if (pos < 1) return -1;
		if (pos == 1 || pos == 2) return 1;
		
		return getFibonacci(pos-2) + getFibonacci(pos-1);
	}

	public static int getGCD(int a, int b) {
		if(b==0) return a; 
		return (a % b == 0)? b: getGCD(b, a % b);
	}
	
	public static int getLCM(int a, int b) {
		return (a*b) / getGCD(a, b);
	}
	
	public static int getFactorial(int input) {
		if (input < 0) return -1;
		if (input == 0 || input == 1) return 1;
		
		return input * getFactorial(input-1);
	}
	
	public static boolean isInt(double input) {
		if(Math.abs(input-((int)input)) <= 0.01 ) {
			return true;
		} else {
			return false;
		}
	}
	
	
	// String treatment
	
	public static String rotate(String input, int digit) {
		// Check digit size
		if (digit > input.length()) return rotate(input, digit-input.length());
		
		String temp = "";
		for (int i=digit; i<input.length(); i++) {
			temp += input.charAt(i);
		}
		for (int i=0; i<digit; i++) {
			temp += input.charAt(i);
		}
		return temp;
	}
	
	public static String removeChar(String input, int index) {
		if (input == null || index < 0 || index >= input.length()) { 
			return input; 
		}
		String newString = "";
		
		for (int i = 0; i < input.length(); i++) { 
			if (i == index) {
        		continue; 
        	} 
			newString += Character.toString(input.charAt(i)); 
		} 
		return newString; 
		
	}
	
}
