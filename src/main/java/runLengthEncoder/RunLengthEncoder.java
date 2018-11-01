package runLengthEncoder;

/** This class implements a run length encoder. It takes a string 
 * and then iterates through the string. At the first character, it stashes it.
 * The at each of the next character it either sees it is new character - in which case it appends a counters and 
 * the character.
 * 
 * At the end of the string we have to write out resutls (for the last character type and count) - 
 * we do all the other in the loop.
 * 
 * The problem calls find simple counters
 *  - Other problems may be if one allows numerics in the input character string and you have more than 9,
 *  - how to differentiate between counters and characters. This could be solved with delimiters - say reserve '_' underscore
 * 
 * A private boolean allows the delimiter to be run - test cases are currently without the delimiter.
 * 
 * @author Rob
 *
 */


public class RunLengthEncoder {

	private boolean delimitEnabled = false;
	
	public String getRunLengthEncoding(String inString) {
		
		int stringLength = inString.length();
		char[] inStringChars = inString.toCharArray();
		StringBuilder outputStrBuilder = new StringBuilder();
		char lastChar = '_';
		char currentChar;
		int currentCount = 0;
		
		// we could optimise this by doing the i ==0 outside
		for (int i = 0; i < stringLength; i++) {
			currentChar = inStringChars[i];
			if (i == 0) {
				lastChar = currentChar;
				currentCount = 1;
			}
			if (i > 0) {
				if (currentChar == lastChar) {
					currentCount++;
				}else {
					if (delimitEnabled) {
						outputStrBuilder.append('_').append(currentCount).append('_').append(lastChar);	
					}else {
						outputStrBuilder.append(currentCount).append(lastChar);
					}
					lastChar = currentChar;
					currentCount = 1;
				}
			}
		}
		// finally at the end of the loop we must append the currentChar and current count
			
		if (stringLength > 0) {
			if (delimitEnabled) {
			outputStrBuilder.append('_').append(currentCount).append('_').append(lastChar);	
			}else {
			outputStrBuilder.append(currentCount).append(lastChar);
			}
		}
		 
		return outputStrBuilder.toString();
	}
}
