package findNextMissingIntegerInArray;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

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
 */
public class MissingIntegerSolver {

	
	/**
	 * Solution approach
	 *  - Put the numbers into a Set, and then sort the set - use a Treeset - gets rid of duplicates.
	 *  - Then use a stream and get get a set that only has positive values - here I treat 0 as not being positive 
	 *  - Then check to see if it is contiguous based on size and considering highest and lowset entries - 
	 *  - If contiguous, then return the next value up.
	 *  - If not contiguous, start at the beginning and calculate the next value up - if if is not just a single value up (i.e. incrementing by 1, return the missing value. 
	 * 
	 * @param stringofIntegers
	 * @return int - this is an integer value representing lowest missing integer value.
	 */
	public int run(String stringofIntegers) {
		
		String[] SetofIntegersAsStrings  = stringofIntegers.split(",");
		
		TreeSet<Integer> sortedAllIntegers = new TreeSet<Integer>();
		
		for (String singleIntAsString:SetofIntegersAsStrings) {
			
			sortedAllIntegers.add(Integer.valueOf(singleIntAsString));			
			//System.out.println("Input Sorted Set: " + sortedAllIntegers);
		}

        Set<Integer> positiveIntegers = sortedAllIntegers.stream().filter(foundInteger -> foundInteger.intValue() > 0)
                .collect(Collectors.toSet());
        
        //If there are no positives (> 0) retrun 0;
        
        if (positiveIntegers.size() == 0)
        	{
        	return 0;
        	}
        
        TreeSet<Integer> sortedPositiveIntegers = new TreeSet<Integer>();
        sortedPositiveIntegers.addAll(positiveIntegers);
       
        // lets see if contiguous
        int sortedPostivesSetSize = sortedPositiveIntegers.size(); 
        int lowestintInSet = sortedPositiveIntegers.first().intValue();
        int highestintInSet = sortedPositiveIntegers.last().intValue();
        
        // if the top - bottom + 1 equals the size it is contiguous - i.e. no gaps (8-4 +1  = 5 i.e. 5 members)
        if ((highestintInSet - lowestintInSet +1) == sortedPostivesSetSize) {
        	return highestintInSet + 1;
        }
        
        //else we need to find the next gaps
        int runningtotal;
		int nextIntInSet = 0;
        runningtotal = sortedPositiveIntegers.first().intValue();
        
        for (Integer singlePostiveInteger:sortedPositiveIntegers) {
			
        	nextIntInSet = singlePostiveInteger.intValue();
        	if ((nextIntInSet -1 >  runningtotal)){
        		return runningtotal +1;
        	}
        	runningtotal = nextIntInSet;
		}
        
        return 0;
	}
}
