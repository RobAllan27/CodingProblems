package efficientpowers;

import java.util.ArrayList;

public class EfficientPowerCalculator {

	private int x; // integer to find the power of could be flat but basic algorithm works.
	private  int y; // this is the exponent
	
	public static long testValue(int x,  int y) {
		
		ArrayList<Long> logpowersof2 = new ArrayList<Long>();
		//x^1, x^2, x^4, x^8 etc
		//int[] powe
		
		String binary = Integer.toBinaryString(y);
		//number of power we need is as given by the length of string.
		
		int numberofPowers = binary.length();
		
		logpowersof2.add(new Long(x));
		long l;
		
		for (int i = 1; i < numberofPowers; i++) {
			l = logpowersof2.get(i -1) * logpowersof2.get(i -1);
		
			logpowersof2.add(new Long(l));
		};
		
		long output = 1;
		
		char[] charatersOfBinaryIndex = binary.toCharArray();
		
		for (int j = 0; j < numberofPowers; j++) {
			if (charatersOfBinaryIndex[j] == '1'){
				output = output * logpowersof2.get(numberofPowers - j - 1).longValue();
			}
		}
		
		return output;
	}
}
