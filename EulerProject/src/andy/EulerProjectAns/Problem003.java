package andy.EulerProjectAns;

import andy.UsefulMethod.UsefulMethodMathL;

/**
 * 
 * @author Andy
 *
 */

//Largest prime factor
public class Problem003 {

	public static void main(String[] args) {
		long target = 600851475143l;
		
		for (long i=2l; i<target; i++) {
			if (target % i == 0) {
				long inverse = target / i;
				/**
				 * Factors of 6 are 1, 2, 3 and 6
				 * If we get the smaller factor(e.g. 2),
				 * we can get the larger corresponding factor(e.g. 3) 
				 * by larger corresponding factor(inverse) = original number(target) / smaller factor(i)  
				 * (i.e. 3 = 6 / 2)
				 */
				if (UsefulMethodMathL.isPrime(inverse)) {
					System.out.println(inverse); //The answer should be 6857.
					break;
				}
			}
		}
	}
	
}
