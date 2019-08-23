package andy.EulerProjectAns;

/**
 * 
 * @author Andy
 *
 */

//Number letter counts
public class Problem017 {

	public static final String[] units = 
		   { "","one","two","three","four","five","six","seven","eight","nine","ten",
		      "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	public static final String[] tens = 
		   {"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	public static final String[] hundreds = 
		   {"","onehundred","twohundred","threehundred","fourhundred","fivehundred","sixhundred",
		      "sevenhundred","eighthundred","ninehundred"}; 
	
	
	
	public static void main(String[] args) {
		int count = 0;
		
		for (int i=1; i<=1000; i++) {
			count +=  getLetter(i).length();
		}
		
		System.out.println(count); // The answer should be 21224.

	}
	
	
	/**
	 * 
	 * @param input For not more than 1000
	 * @return
	 * 
	 * Adopted form Hunter McMillen (https://coderanch.com/t/437744/java/Project-Euler)
	 * Modified by Andy
	 */
	public static String getLetter(int input) {
		String withAnd = "";
	    if(input == 1000) {
	    	return "onethousand";
	    }
	    
	    if(input < 20) {
	    	return units[input];
	    }
	    
	    if(input < 100) {
	    	/*
	    	 * Divided input by 10 gives it the correct index position in the array of tens
	    	 * For example: 60 is at position 6 in the tens array 
	    	 * 60/10 = 6. tens[6] = "sixty"
	    	 */
	    	return tens[input/10] + getLetter(input%10);
	    }
	      
	    withAnd = getLetter(input % 100);
	      
	    /*
	     * If the number is not an perfect hundred value e.g. 100, 200, 300,
	     * then you have to add "and" to it according to the number.
	     * getting the remainder when divided by 100 allows you to see
	     * if the number needs an "and"
	     * e.g. : 333 % 100 = 33, so the answer would be "threehundredandthirtythree".
	     */
	       
	    if(withAnd.length() > 0) withAnd = "and" + withAnd;

	    return hundreds[input/100] + withAnd;
		
	}

}
