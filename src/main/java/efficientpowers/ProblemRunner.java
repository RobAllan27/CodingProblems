/**
 * 
 */
package efficientpowers;

/** This package aims to deal with the following problem
 * 
 * Given a set of numbers, can we see if for any two numbers in the list, if added they will match a total
 * 
 *  - Given a list of numbers and target number T, return true or false whether any two numbers from the list add up to T.
 *  - So as an example, given [9, 14, 5, 7] and T = 16, return true since 9 + 7 is 16.
 * 	 - Further, how can we optimise this into one pass?
 * 	 - Further, rather than just 2 numbers, return true or false if there are N numbers. So if N was 3 in the above, and T was 21 then return true as  9 + 5 + 7 = 21.
 * 	 - One can assume that N will be smaller that the size of the list.
 *  Test cases are included in the package.
 * 
 * @author Rob
 *
 */
public class ProblemRunner {

	/**
	 * @param args
	 * 
	 * This class is a simple class to simply run the code - a runner class
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//EfficientPowerCalculator myEPC = new EfficientPowerCalculator();
		System.out.println("");
		System.out.println("Result found " + EfficientPowerCalculator.testValue(2,3));
		System.out.println("Result found " + EfficientPowerCalculator.testValue(2,4));
		System.out.println("Result found " + EfficientPowerCalculator.testValue(2,5));
	}

}
