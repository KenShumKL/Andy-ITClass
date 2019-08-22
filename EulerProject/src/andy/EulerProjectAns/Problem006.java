package andy.EulerProjectAns;

/**
 * 
 * @author Andy
 *Very Easy
 */

//Sum square difference
public class Problem006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int sqSum = 0;
		
		for (int i=1; i<=100l; i++) {
			sum += Math.pow(i, 2);
		}
		
		for (int i=1; i<=100l; i++) {
			sqSum += i;
		}
		sqSum = (int) Math.pow(sqSum, 2);
		
		System.out.println(sqSum - sum); //The answer should be 25164150.
	}

}
