package andy.EulerProjectAns;


/**
 * 
 * @author Andy
 *
 */

//Special Pythagorean triplet
public class Problem009 {

	public static void main(String[] args) {
		for (int a = 3; a <= 1000; a++) {
            for (int b = a + 1; b < 1000; b++) {
                
                double cSquared = Math.pow(a, 2) + Math.pow(b, 2);
                double c = Math.sqrt(cSquared);
                
                if (a + b + c == 1000) {
                	System.out.println("a: " + a +" b: " + b  + " c: " + (int) c);
                    System.out.println(a * b * c);
                    System.out.println(Integer.toString(a*b*(int)c)); //The answer should be 3.1875E7 (i.e. 31875000).
                    break;
                }
            }
        }
	}
}
