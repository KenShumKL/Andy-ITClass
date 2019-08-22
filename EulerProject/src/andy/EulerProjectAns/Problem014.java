package andy.EulerProjectAns;

/**
 * 
 * @author Andy
 *
 */

//Longest Collatz sequence
public class Problem014 {

	public static void main(String[] args) {
		long count = 0l;
		int maxStart = 1;
		
		for (int i=1; i<1000000; i++) {
			if (count < getNoOfCollatz(i)) {
				count = getNoOfCollatz(i);
				maxStart = i;
			}
		}
		
		System.out.println(maxStart); //The answer should be 837799.
		

	}
	
	public static long getNoOfCollatz(long input) { 
		long n = input;
		long count = 0l;
		count++;//Also count the starting term(i.e. input) 
		while (n > 1) {
			n = (n % 2 == 0)? Math.abs((n/2)) : Math.abs((Math.abs(3*n)+1));
			count++;
		}
		return count;
	}
	
	
	/*
	 * I have totally no idea why this can't work
	 */
	public static long getNoOfCollatzDISABLED(int input) { 
		int n = input;
		long count = 0l;
		count++;//Also count the starting term(i.e. input) 
		while (n > 1) {
			n = (n % 2 == 0)? Math.abs((n/2)) : Math.abs((Math.abs(3*n)+1));
			count++;
		}
		return count;
	}

}
