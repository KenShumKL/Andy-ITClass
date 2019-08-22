package andy.UsefulMethod;

/**
 * 
 * @author Andy
 *
 */

public class AndyStr {
	
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
