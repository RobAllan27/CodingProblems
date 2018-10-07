package findIfNumbersInArraySumToTotal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

/**
* Strategy overview
* 	Part 1 - simply see if we can make the total out of 2 entries
* 	Part 2 - simply see if we cane make the totl out of N entries
*
* Strategy for part 1 - simply see if we can make the total out of 2 entries

*   - Create an set of Integers  -  as an array list because we want to delete
*   - We will iterate through the set of integers 
*   - take the found integer value from the target total - leaves 'remainder'
*   - See if the remainder exists in the set of Integers - if so we return true
*   - if not we get rid of the first value form the array list and work on the shorter array list.
*   - Stop when the array list only has 1 entry left and return false..


* Strategy for part 2 - simply see if we cane make the totl out of N entries

*  Strategy
*   - get the String into a Arraylist ofIntegers
*   - then we work out a list of all the positions in the array - like 0,1,2, ... n 
*   - then we fill the combinations of those position.
*   - then we take each of those combinations and see if for any of them we get the target.
*   - if any match we return positive
*/

/**
 * @author Rob
 * This class represents the solution to the problem - has 2 methods
 *  - run for solution 1
 *  - testValues for solution 2
 */
public class NumbersInArraySumtoTotalSolver {

	/**
	 * 
	 */
	private ArrayList<ArrayList<Integer>> setOfIntArrays;
	
	// Part 1 - 
	
	/** This is where we run the application from assuming that we are going to use 2 integers from the string.
	 * @param stringofIntegers - an inout string of integers -  like [0,4,2,3,7] etc. Any length and can be negatives
	 * @param ExpectedResult - 
	 * @return boolean to indicate that we got the required target or not.
	 * 
	 * 
	 *	- 1 get the String into a Arraylist ofIntegers
	 *	- 2 then for the first in the array, take that off the target value, to leave a remaider. See if the remainder is in the list.
	 *	- 3 then remove the first form the array (becasue we know it can't be in the solution) and repeat step 2.
	 */
	public boolean run(String stringofIntegers, int ExpectedResult) {
		
		boolean defaultReturnValue  = false;
		int matchingValueToSearchFor = 0;
		
		String[] SetofIntegersAsStrings  = stringofIntegers.split(",");
		
		ArrayList<Integer> listAllIntegers = new ArrayList<Integer>();
		
		for (String singleIntAsString:SetofIntegersAsStrings) {
			
			listAllIntegers.add(Integer.valueOf(singleIntAsString));			
			//System.out.println("Input List: " + listAllIntegers);
		}
		
		if (listAllIntegers.size() < 2) {
			//System.out.println("Input Array is too small -- " + listAllIntegers);
			return defaultReturnValue;
		}
		
		int numberofLoops = listAllIntegers.size();
		
		for (int i = 0; i< numberofLoops;i++ ) {
			
			matchingValueToSearchFor = ExpectedResult - listAllIntegers.get(0).intValue();
		
			for (int j = 1; j < listAllIntegers.size();j++) {
				if (matchingValueToSearchFor == listAllIntegers.get(j).intValue()) {
					return true;
				}
			}
			listAllIntegers.remove(0); // get rid of the first one
		} 
		
		return defaultReturnValue;
		
	}
		
	/** This is where the application is run from - 
	 * @param stringofIntegers - the set of integers that we are going to use to try to hit the target value
	 * @param target - the target value 
	 * @param numberOfElementsUsed
	 * @return -  a boolean to say whether we could hit the value or not
	 * 
	 * - get the String into a Arraylist ofIntegers
     * - then we work out a list of all the positions in the array - like 0,1,2, ... n 
     * - then we fill the combinations of those position.
     * - then we take each of those combinations and see if for any of them we get the target.
     * - if any match we return positive
	 */
	public boolean TestValue(String stringofIntegers,int target, int numberOfElementsUsed) {
		
		boolean foundTarget = false; 
		String[] SetofIntegersAsStrings = stringofIntegers.split(",");
		
		ArrayList<Integer> listAllIntegers = new ArrayList<Integer>();
		
		for (String singleIntAsString:SetofIntegersAsStrings) {
			
			listAllIntegers.add(Integer.valueOf(singleIntAsString));			
			//System.out.println("Input List: " + listAllIntegers);
		}	
		
	    int[] arr = getPositionalIntegers(listAllIntegers);
	    int arraySize = listAllIntegers.size();
	    
	    if (numberOfElementsUsed > arraySize){
	    	return false;
	    }
	    
	    getCombinations(arr,arraySize,numberOfElementsUsed);
	    
	    // now we have got the combinations, let's iterate
	    
	    for (ArrayList<Integer> oneSetOfChoices : setOfIntArrays) {
	    	foundTarget = verifyTotal(oneSetOfChoices, listAllIntegers,target);
	    	if (foundTarget) {
	    		return foundTarget;
	    	}
	    }
	    return foundTarget;
	}
	
	/** This method gets a set of choices, the raw input array and a target and sees if we can make the target. 
	 * @param oneSetOfChoices - this is one of combinations of array positions, like [0,2,3]. We use this set to decide which of the source array values we will use.
	 * @param listAllIntegers - this is a list of all the integers that we were given in the input -  we will use some of these, as driven by setOfChoices to see if we can get to the target.  
	 * @param target -  this is the target value -  we will see if we can iteratively add up to that total.
	 * @return a boolean if the target has been hit.
	 */
	private boolean verifyTotal(ArrayList<Integer> oneSetOfChoices, ArrayList<Integer> listAllIntegers, int target) {
			boolean matchFound = false;
			int currentTotal = 0;
			int valueInList = 0;
			 for (Integer positionInteger: oneSetOfChoices) {
				 valueInList = listAllIntegers.get(positionInteger.intValue()).intValue();
				 currentTotal += valueInList;
			 }
			
			 if (target == currentTotal) {
				 matchFound = true;
			 }
			return matchFound;
	}
	
	/** This method is a simple helper method to get a set of array positions - numbered 0,1,2,3 etc.
	 * We can then use this later on to 'sets of sets' ie the combinations of the array position
	 * @param IntegersList -  we simply pass this so that we can hget its size 
	 * @return an integer array starting at 0 and going up to the size of the array (minus 1 as starts 0) 
	 */
	public static int[] getPositionalIntegers(List<Integer> IntegersList)
	{
	    int[] returnintarray = new int[IntegersList.size()];
	    for (int i=0; i < returnintarray.length; i++)
	    {
	    	returnintarray[i] = i;
	    }
	    return returnintarray;
	}
	
	
	/** A recursive helper method to fill a array of integers.
	 * @param arr - the input array
	 * @param data - data we are building up for any combination
	 * @param start -  the start of the array
	 * @param end -  end of the array
	 * @param index -  index for the array
	 * @param r -  size of the array
	 * @param setOfIntArrays - an array list of arraylist of integer. sow e could get
	 * [[0,1],[0,2],[1,2]...]
	 */
	static void combinationUtil(int arr[], int data[], int start, 
			int end, int index, int r,ArrayList<ArrayList<Integer>> setOfIntArrays) 
	{ 
		// Current combination is ready to be printed, print it 
		if (index == r) { 
		//System.out.println("\n");
		ArrayList<Integer> lineArray = new ArrayList<Integer>();
		
				for (int j=0; j<r; j++) {
					//System.out.print(data[j]); 
					//System.out.println("\n\n"); 
					lineArray.add(new Integer(data[j]));
					}
				setOfIntArrays.add(lineArray);
				return; 
			} 
		// replace index with all possible elements. The condition 
		// "end-i+1 >= r-index" makes sure that including one element 
		// at index will make a combination with remaining elements 
		// at remaining positions 
		for (int i=start; i<=end && end-i+1 >= r-index; i++) 
		{ 
			data[index] = arr[i]; 
			combinationUtil(arr, data, i+1, end, index+1, r,setOfIntArrays); 
		}  

	}	
	
	/** This method takes an array of integers, of length n 
	 * 
	 * The main function that prints all combinations of size r in arr[] of size n.
	 * 
	 * 	The main function that prints all combinations of size r 
	 *  in arr[] of size n. 
	 * @param arr - the input array of the chosen parameter positions.
	 * @param n -  the length of the array
	 * @param r -  the number of 
	 */
	private void getCombinations(int arr[], int n, int r) 
	{ 
		setOfIntArrays = new ArrayList<ArrayList<Integer>>();
		// A temporary array to store all combination one by one 
		int data[]=new int[r]; 

		// Print all combination using temporary array 'data[]' 
		combinationUtil(arr, data, 0, n-1, 0, r,setOfIntArrays);
		//System.out.println("Hello");
	} 
	
}
