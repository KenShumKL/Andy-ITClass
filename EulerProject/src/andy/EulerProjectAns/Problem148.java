package andy.EulerProjectAns;


/**
 * 
 * @author Andy
 *
 */

//Exploring Pascal's triangle
public class Problem148 {

	public static void main(String[] args) {
		System.out.println(method1((long) 1e9));
		System.out.println(method2((int) 1e9));
	}
	
	
	// By God(forgot his name) at Github 
	private static long method1(long r) {
		long[][] units = new long[13][8];
		
		for (int y = 0; y < 13; y++) {
			for (int x = 0; x <= 7; x++) {
				if (y == 0) {
					units[y][x] = x * (x + 1) / 2;
				} else {
					units[y][x] = x * (x + 1) / 2 * units[y - 1][7];
				}
			}
		}
		
		long count = 0;
		int index = 0;
		
		while (r > 0) {
			int mod = (int) (r % 7);
			count = count * (mod + 1) + units[index][mod];
			r = r / 7;
			index++;
		}
		
		return count;
	}
	
	/**
	 * @author HaochenLiu at GitHub
	 * 
	 * @param r
	 * @return
	 */
	private static long method2(int r) {
        if (r <= 7) {
            return r * (r + 1) / 2;
        }
        long ans = 7 * 8 / 2;
        int rr = 7;
        while (rr * 7 <= r) {
            ans *= 7 * 8 / 2;
            rr *= 7;
        }
        int level = r / rr;
        ans *= level * (level + 1) / 2;
        ans += (r / rr + 1) * method2(r % rr);
        return ans;
    }
	
	

}
