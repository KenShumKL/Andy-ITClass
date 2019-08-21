package andy.UsefulMethod;

import java.util.*;

/**
 * 
 * @author Andy
 *
 */

//Array treatment
public class UsefulMethodArr {
	
	public static int[] removeTheElement(int[] arr, int index)  { 
		// If the array is empty 
		// or the index is not in array range 
		// return the original array 
		if (arr == null || index < 0 || index >= arr.length) { 
			return arr; 
		} 
		// Create another array of size one less 
		int[] newArray = new int[arr.length - 1]; 
		
		// Copy the elements except the index 
		// from original array to the other array 
		for (int i = 0, k = 0; i < arr.length; i++) { 
			// if the index is 
			// the removal element index 
			if (i == index) {
        		continue; 
        	} 
        	// if the index is not 
			// the removal element index 
        	newArray[k++] = arr[i]; 
		} 
		// return the resultant array 
		return newArray; 
	}
	
	public static String[] removeTheElementS(String[] arr, int index)  { 
		if (arr == null || index < 0 || index >= arr.length) { 
			return arr; 
		}
		String[] newArray = new String[arr.length - 1]; 
		
		for (int i = 0, k = 0; i < arr.length; i++) { 
			if (i == index) {
        		continue; 
        	} 
        	newArray[k++] = arr[i]; 
		} 
		return newArray; 
	}
	
	public static int[] addElement(int[] array, int element) {
		array  = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = element;
		return array;
    }
	
	public static String[] addElementS(String[] array, String element) {
		array  = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = element;
		return array;
    }

	
	//Conversion of array
	public static int[] arrStringToInt(String[] input) {
		int[] temp = new int [input.length];
		for (int i=0; i<temp.length; i++) {
			temp[i] = Integer.parseInt(input[i]);
		}
		
		return temp;
	}
	
	public static String[] arrIntToString(int[] input) {
		String[] temp = new String [input.length];
		for (int i=0; i<temp.length; i++) {
			temp[i] = Integer.toString(input[i]);
		}
		
		return temp;
	}

}
