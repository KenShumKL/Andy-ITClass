package andy.EulerProject;

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
		
		for (int i=1; i</*???*/; i++) {
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
		while (n > 1) {
			//???????????????
		}
		return count;
	}

}
