/**
 * 
 */
package findNextMissingIntegerInArray;

/**
 * This package aims to solve the following problem
 * 
 * Given an array of integers, find the first missing positive integer in linear time and constant space. 
 * In other words, find the lowest positive integer that does not exist in the array. 
 * The array can contain duplicates and negative numbers as well.
 *	
 * Interpreted this as
 *  - if there is array with positives in it, then find next lowest missing inter that is greater than lowest positive.
 *  - if the existing array positive starts at N, and there are no missing integers, then return one moe thnthe greatest number
 *  - if there is only 1 positive then return 1 greater
 *  - if there are no positive numbers (> 0) then return 0.
 * 
 * Test cases
 * [-4,-3, -2,-1] -  return 0
 * [-3,-2,-1,0] - return 0.
 * [-4,-3, 0,1] - return 2
 * [-4,-3, 0,1,2] - return 3
 * [-4,-3, 0,1,3] - return 2
 * [-4,-3, 0,1,3,4] - return 2
 * [-4,-3, 0,1,3,4,5] - return 2
 * [-4,-3, 0,1,4] - return 2
 * [-4,-3, 0,1,4,5] - return 2
 * For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.
 * 
 * Solution approach
 *  - Put the numbers into a Set, and then sort the set - use a Treeset - gets rid of duplicates.
 *  - Then use a stream and get get a set that only has positive values - here I treat 0 as not being positive 
 *  - Then check to see if it is contiguous based on size and considering highest and lowset entries - 
 *  - If contiguous, then return the next value up.
 *  - If not contiguous, start at the beginning and calculate the next value up -  if if is not just a single value up, return the missing value. 
 * @author Rob
 *	
 *	This class is a simple class to simply run the code - a runner class
 */
public class ProblemRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingIntegerSolver mySolver = new MissingIntegerSolver();
		
		System.out.println("Result of mySolver.run(\"-4,-3,-2,-1\") - should be 0 - is "+ mySolver.run("-4,-3,-2,-1"));
		System.out.println("Result of mySolver.run(\"-3,-2,-1,0\") - should be 0 - is "+ mySolver.run("-3,-2,-1,0")); // return 0.
		System.out.println("Result of mySolver.run(\"-4,-3,0,1\") - should be 2 - is "+ mySolver.run("-4,-3,0,1")); // return 2
		System.out.println("Result of mySolver.run(\"-4,-3,0,1,2\") - should be 3 - is "+ mySolver.run("-4,-3,0,1,2")); // return 3
		System.out.println("Result of mySolver.run(\"-4,-3,0,1,3\") - should be 2 - is "+ mySolver.run("-4,-3,0,1,3")); // return 2
		System.out.println("Result of mySolver.run(\"-4,-3,0,1,3,4\") - should be 2 - is "+ mySolver.run("-4,-3,0,1,3,4")); // return 2
		System.out.println("Result of mySolver.run(\"-4,-3,0,1,3,4\") - should be 2 - is "+ mySolver.run("-4,-3,0,1,3,4,5")); // return 2
		System.out.println("Result of mySolver.run(\"-4,-3,0,1,4\") - should be 2 - is "+ mySolver.run("-4,-3,0,1,4")); // return 2
		System.out.println("Result of mySolver.run(\"-4,-3,0,1,4,5\") - should be 2 - is "+ mySolver.run("-4,-3,0,1,4,5")); // return 2
		System.out.println("Result of mySolver.run(\"6,7,8\") - should be 9 - is "+ mySolver.run("6,7,8,")); // return 2
		
	}

}
