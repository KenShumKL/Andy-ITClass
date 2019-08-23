package andy.DevelopingKit;

import andy.UsefulMethod.*;

// Interesting question

/**
 * 
 * @author Andy
 * 
 * Digit of 
 *
 */

//Unsolved
public class Problem043 {

	static AndyMath andy = new AndyMath();
	public static void main(String[] args) {
		int[] nums = new int [10];
		
		
		

		int[] multipleOf11 = new int [0];
		int[] multipleOf13 = new int [0];
		int[] multipleOf17 = new int [0];
		
		multipleOf11 = getUniqueArr(getMultipleOf(11));
		multipleOf13 = getUniqueArr(getMultipleOf(13));
		multipleOf17 = getUniqueArr(getMultipleOf(17));
		
		
		
		multipleOf13 = common(multipleOf11, multipleOf13);
		multipleOf17 = common(multipleOf13, multipleOf17);
		
		printArr(multipleOf17);
		
		for (int i=0; i<multipleOf17.length; i++) {
			if (multipleOf17[i] == 890) {
				System.out.println(0);
				break;
			}
		}
		
		
	}
	
	static int[] getMultipleOf(int input) {
		int[] temp = new int [0];
		for (int i=input; i<=987; i++) {
			if (i % input == 0) {
				temp = AndyArr.addElement(temp, i);
			}
		}
		return temp;
	}
	
	
	static void printArr(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static int[] getUniqueArr(int[] arr) { 
		for (int i=arr.length-1; i>=0; i--) {
			if (!isUnique(arr[i])) {
				arr = AndyArr.removeTheElement(arr, i);
			}
		}
		return arr;
	}	
	
	static boolean isUnique(int input) {
		String inputS = Integer.toString(input);
		
		if (inputS.length() == 2) {
			inputS = "0" + inputS;
		} else if (inputS.length() == 1) {
			inputS = "00" + inputS;
		}
		
		if (inputS.charAt(0) == inputS.charAt(1) || inputS.charAt(0) == inputS.charAt(2) ||
				inputS.charAt(1) == inputS.charAt(2)) {
			return false;
		}
		
		return true;
	}

	static int[] common(int[] arr1, int[] arr2) {
		
		
		
		int[] temp = new int [0];
		for (int j=0; j<arr1.length; j++) {
			for (int k=0; k<arr2.length; k++) {
				if (
						fill0(Integer.toString(arr1[j])).charAt(1) == fill0(Integer.toString(arr2[k])).charAt(0) &&
						fill0(Integer.toString(arr1[j])).charAt(2) == fill0(Integer.toString(arr2[k])).charAt(1)
						) {
					
					temp = AndyArr.addElement(temp, arr2[k]); 
				}
			}
		}
		
		return temp;
	}
	
	static String fill0 (String input) {
		if (input.length() == 2) {
			input = "0" + input;
		} else if (input.length() == 1) {
			input = "00" + input;
		}
		
		return input;
	}
}
