package andy.EulerProjectAns;

/**
 * 
 * @author Andy
 *
 */

//Smallest multiple
public class Problem005 {

	public static void main(String[] args) {
		int i=1;
		boolean trigger = true;
		
		while (trigger) {
			i++;
			for (int j=2; j<=20; j++) {
				if (i % j != 0) break;
				if (j == 20) trigger = false;
			}
		}
		System.out.println(i); //The answer should be 232792560.
	}
	

}
