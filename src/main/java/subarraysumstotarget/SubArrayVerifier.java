package subarraysumstotarget;

import java.util.ArrayList;

public class SubArrayVerifier {

	public String verifySubArray(int[] incomingIntegers,int target){
		String returnvalue = "";

		java.util.Arrays.sort(incomingIntegers);
		
		for(int i=0; i<incomingIntegers.length/2; i++)
		{ int temp = incomingIntegers[i]; 
		incomingIntegers[i] = incomingIntegers[incomingIntegers.length -i -1]; 
		incomingIntegers[incomingIntegers.length -i -1] = temp; 
		}

		ArrayList<Integer> IncomingArrayListofIntegers = new ArrayList<Integer>();
		ArrayList<Integer> FoundArrayListofIntegers = new ArrayList<Integer>();
		for (int i =0; i < incomingIntegers.length; i++) {
			IncomingArrayListofIntegers.add(new Integer(incomingIntegers[i]));
		}
		
		FoundArrayListofIntegers = checkMatchesTarget(IncomingArrayListofIntegers, target);
		
		if (FoundArrayListofIntegers.size() > 0) {
			return FoundArrayListofIntegers.toString();
		}
		else {return "null";}
	}
	
	private ArrayList<Integer> checkMatchesTarget(ArrayList<Integer> arrayListofIntegers, int target){
		
		ArrayList<Integer> rtnArrayListofIntegers = new ArrayList<Integer>();
		if (arrayListofIntegers.size() ==1 && arrayListofIntegers.get(0).intValue() == target) {
			rtnArrayListofIntegers.add(arrayListofIntegers.get(0));
			return rtnArrayListofIntegers;
		}
		
		// could refactor the following 3 steps to search if either array 1st or array 2nd or array 1st + 2nd = target 
		if (arrayListofIntegers.size() ==2 && (arrayListofIntegers.get(0).intValue() + arrayListofIntegers.get(1).intValue()) == target) {
			rtnArrayListofIntegers.add(arrayListofIntegers.get(0));
			rtnArrayListofIntegers.add(arrayListofIntegers.get(1));
			return rtnArrayListofIntegers;
		}
		
		if (arrayListofIntegers.size() ==2 && (arrayListofIntegers.get(1).intValue()) == target) {
			rtnArrayListofIntegers.add(arrayListofIntegers.get(1));
			return rtnArrayListofIntegers;
		}
		
		if (arrayListofIntegers.size() ==2 && (arrayListofIntegers.get(0).intValue()) == target) {
			rtnArrayListofIntegers.add(arrayListofIntegers.get(0));
			return rtnArrayListofIntegers;
		}
		
		if (arrayListofIntegers.size() < 3) {
			return rtnArrayListofIntegers;
		}
		int newtarget;
		
		for (int i = 0;i< arrayListofIntegers.size();i++) {
			newtarget = target - arrayListofIntegers.get(i).intValue();
			
			if (newtarget == 0) {
				rtnArrayListofIntegers.add(new Integer(arrayListofIntegers.get(i).intValue()));
				return rtnArrayListofIntegers;
			}
			
			if (newtarget < 0) {
				continue;
			}
			
			ArrayList<Integer> shorterArrayList =  new ArrayList<Integer>();
			for (int j = i + 1; j < arrayListofIntegers.size();j++) {
				shorterArrayList.add(arrayListofIntegers.get(j));
				}
			if (shorterArrayList.isEmpty()) {
				return rtnArrayListofIntegers;
			}
			//we have now got the shorter array
			ArrayList<Integer> foundArrayLisofInts = checkMatchesTarget(shorterArrayList, newtarget);
			if (foundArrayLisofInts.size() > 0) {
				rtnArrayListofIntegers = foundArrayLisofInts;
				//System.out.println(arrayListofIntegers.get(i).intValue());
				rtnArrayListofIntegers.add(0, new Integer(arrayListofIntegers.get(i).intValue()));
				return rtnArrayListofIntegers;
 			}
		}	
		
		return rtnArrayListofIntegers;
	}
}
