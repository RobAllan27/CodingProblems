package wellFormedString;

import java.util.LinkedList;

public class WellFormedStringChecker {

	/**
	Given a string of round, curly, and square open and closing brackets, return whether the brackets are balanced (well-formed).
			For example, given the string "([])[]({})", you should return true.
			Given the string "([)]" or "((()", you should return false.
	*/
	
	private LinkedList<StoredPairSet> myLL;
	
	public boolean testStringForWQellFormedNess(String inString) {
		
		myLL = new LinkedList<StoredPairSet>();
		
		if (inString.isEmpty()) {
			 return false;
		}
		
		char[] chars  = inString.toCharArray();
		char charbeingTested;
		
		for (int i=0;i < chars.length;i++) {
			 charbeingTested = chars[i];
			if (charbeingTested == ']' || charbeingTested == '}' || charbeingTested == '>')
			{
				if (myLL.isEmpty()) {
					return false;
				} 
				char openingCharOfLast = myLL.getLast().getPairSetCloseCharacter();
				if (charbeingTested != openingCharOfLast) {
					return false;
				}
				else
				{// must be equal
					myLL.removeLast();
				}
			}else{
				// we need to add a new element.
				StoredPairSet myStoredPairSet = new StoredPairSet();
				myStoredPairSet.setPairSetCloseCharacter(charbeingTested);
				myLL.add(myStoredPairSet);
			}
		}
		
		// we have gone though all the characters, we hould now have a full ste of matching pair
		if (myLL.isEmpty()) {
			return true;
		}
		// not empty. Something left over
		return false;
	}
}
