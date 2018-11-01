package wellFormedString;

public class StoredPairSet {

	private char pairSetCloseCharacter;
	
	/**
	 * @return the pairSetCharacter
	 */
	public char getPairSetCloseCharacter() {
		return pairSetCloseCharacter;
	}
	/**
	 * @param pairSetCharacter the pairSetCharacter to set
	 * Not sure that we can do an enum with character, so use a case statement 
	 */
	public void setPairSetCloseCharacter(char pairOpenSetCharacter) {
		
		switch (pairOpenSetCharacter){
			case '{':
				pairSetCloseCharacter = '}';
			break;	
			case '<':
				pairSetCloseCharacter = '>';
			break;
			case '[':
				pairSetCloseCharacter = ']';
			break;
		}
	}
}
