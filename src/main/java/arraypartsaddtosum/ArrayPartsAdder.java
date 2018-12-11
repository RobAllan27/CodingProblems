package arraypartsaddtosum;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

public class ArrayPartsAdder {

	
	public boolean checkArrayAdder(int[] incomingInts) {
		
		double lenofIntsArrayasDouble = new Integer(incomingInts.length).doubleValue();
		
		int maxCounterforArray = new Double(Math.pow(2, lenofIntsArrayasDouble)).intValue();
		
		ArrayList<String> integersAsBinaryStrings = new ArrayList<String>();
		
		//start at 1 as no point everying in array and do not count last as veryintg just in one array 
		
		for (int i  =1; i < maxCounterforArray -1; i++) {
			
			integersAsBinaryStrings.add(StringUtils.leftPad(Integer.toBinaryString(i),incomingInts.length,"0"));
		}

		for (int j = 0; j < maxCounterforArray -2; j++) {
			int leftsum = 0;
			int rightsum = 0;
			char[] binarymarker  = integersAsBinaryStrings.get(j).toCharArray(); 
			for (int k = 0;k < binarymarker.length;k++) {
				if (Character.getNumericValue(binarymarker[k]) == 0) {
					leftsum +=  incomingInts[k];
				}
				if (Character.getNumericValue(binarymarker[k]) == 1) {
					rightsum +=  incomingInts[k];
				}
			}
			if (leftsum == rightsum) {
				return true;
			}
		}
		return false;
	}
}
