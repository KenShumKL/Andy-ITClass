package andy.UsefulMethod;

import java.util.*;

/**
 * 
 * @author Andy
 *
 */

//Array treatment
public class AndyArr {
	
	// Not Tested
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
			if (i == index) continue; 
        	// if the index is not 
			// the removal element index 
        	newArray[k++] = arr[i]; 
		} 
		// return the resultant array 
		return newArray; 
	}
	
	// Not Tested
		public static long[] removeTheElement(long[] arr, int index)  { 
			if (arr == null || index < 0 || index >= arr.length) { 
					return arr; 
			} 
			long[] newArray = new long[arr.length - 1]; 
				
			for (int i = 0, k = 0; i < arr.length; i++) { 
				if (i == index) continue; 
		        newArray[k++] = arr[i]; 
			} 
			return newArray; 
	}
	
	// Not Tested
		public static float[] removeTheElement(float[] arr, int index)  { 
			if (arr == null || index < 0 || index >= arr.length) { 
				return arr; 
			} 
			float[] newArray = new float[arr.length - 1]; 
			
			for (int i = 0, k = 0; i < arr.length; i++) { 
				if (i == index) continue; 
	        	newArray[k++] = arr[i]; 
			} 
			return newArray; 
	}
	
	
	// Not Tested
	public static double[] removeTheElement(double[] arr, int index)  { 
		if (arr == null || index < 0 || index >= arr.length) { 
			return arr; 
		} 
		double[] newArray = new double[arr.length - 1]; 
		
		for (int i = 0, k = 0; i < arr.length; i++) { 
			if (i == index) continue; 
        	newArray[k++] = arr[i]; 
		} 
		return newArray; 
	}
	
	// Not Tested
	public static char[] removeTheElement(char[] arr, int index)  { 
		if (arr == null || index < 0 || index >= arr.length) { 
			return arr; 
		}
		char[] newArray = new char[arr.length - 1]; 
		
		for (int i = 0, k = 0; i < arr.length; i++) { 
			if (i == index) continue; 
        	newArray[k++] = arr[i]; 
		} 
		return newArray; 
	}
	
	// Not Tested
	public static String[] removeTheElement(String[] arr, int index)  { 
		if (arr == null || index < 0 || index >= arr.length) { 
			return arr; 
		}
		String[] newArray = new String[arr.length - 1]; 
		
		for (int i = 0, k = 0; i < arr.length; i++) { 
			if (i == index) continue; 
        	newArray[k++] = arr[i]; 
		} 
		return newArray; 
	}
	
	
	
	public static int[] addElement(int[] array, int element) {
		array  = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = element;
		return array;
    }
	
	// Not tested
	public static long[] addElement(long[] array, long element) {
		array  = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = element;
		return array;
    }
	
	// Not tested
	public static float[] addElement(float[] array, float element) {
		array  = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = element;
		return array;
    }
	
	// Not tested
	public static double[] addElement(double[] array, double element) {
		array  = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = element;
		return array;
	}
	
	// Not tested
	public static char[] addElement(char[] array, char element) {
		array  = Arrays.copyOf(array, array.length + 1);
		array[array.length - 1] = element;
		return array;
	}
	
	public static String[] addElement(String[] array, String element) {
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
	
	
	// Not tested
	public static boolean contains(int[] input, int element) {
		for (int i=0; i<input.length; i++) {
			if (input[i] == element) return true;
		}
		return false;
	}
	
	// Not tested
	public static boolean contains(long[] input, long element) {
		for (int i=0; i<input.length; i++) {
			if (input[i] == element) return true;
		}
		return false;
	}
	
	// Not tested
	public static boolean contains(float[] input, float element) {
		for (int i=0; i<input.length; i++) {
			if (input[i] == element) return true;
		}
		return false;
	}
	
	// Not tested
	public static boolean contains(double[] input, double element) {
		for (int i=0; i<input.length; i++) {
			if (input[i] == element) return true;
		}
		return false;
	}
	
	// Not tested
	public static boolean contains(char[] input, char element) {
		for (int i=0; i<input.length; i++) {
			if (input[i] == element) return true;
		}
		return false;
	}
	
	// Not tested
	public static boolean contains(String[] input, String element) {
		for (int i=0; i<input.length; i++) {
			if (input[i] == element) return true;
		}
		return false;
	}
	
	
	// Not tested
	public static int[] getUnique(int[] input) {
		int[] temp = new int[0];
		for (int i=0; i<input.length; i++) {
			if (!contains(temp, input[i])) temp = addElement(temp, input[i]);
		}
		return temp;
	}
	
	// Not tested
	public static long[] getUnique(long[] input) {
		long[] temp = new long[0];
		for (int i=0; i<input.length; i++) {
			if (!contains(temp, input[i])) temp = addElement(temp, input[i]);
		}
		return temp;
	}
	
	// Not tested
	public static float[] getUnique(float[] input) {
		float[] temp = new float[0];
		for (int i=0; i<input.length; i++) {
			if (!contains(temp, input[i])) temp = addElement(temp, input[i]);
		}
		return temp;
	}
	
	// Not tested
	public static double[] getUnique(double[] input) {
		double[] temp = new double[0];
		for (int i=0; i<input.length; i++) {
			if (!contains(temp, input[i])) temp = addElement(temp, input[i]);
		}
		return temp;
	}
	
	// Not tested
	public static char[] getUnique(char[] input) {
		char[] temp = new char[0];
		for (int i=0; i<input.length; i++) {
			if (!contains(temp, input[i])) temp = addElement(temp, input[i]);
		}
		return temp;
	}
	
	// Not tested
	public static String[] getUnique(String[] input) {
		String[] temp = new String[0];
		for (int i=0; i<input.length; i++) {
			if (!contains(temp, input[i])) temp = addElement(temp, input[i]);
		}
		return temp;
	}
	

}
