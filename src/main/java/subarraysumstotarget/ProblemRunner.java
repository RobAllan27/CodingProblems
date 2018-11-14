/**
 * 
 */
package subarraysumstotarget;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Rob
 *
 */
public class ProblemRunner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubArrayVerifier subArrayVerifier = new SubArrayVerifier();
		int[] myints = {1,2,3,4};
		System.out.println(subArrayVerifier.verifySubArray(myints, 9));
				
		int[] myintsa = {12, 1, 12, 3, 1};
		System.out.println(subArrayVerifier.verifySubArray(myintsa, 24));

		int[] myintsb = {12, 1, 12, 3, 1};
		System.out.println(subArrayVerifier.verifySubArray(myintsb, 15));

		int[] myintsc = {12, 1, 8, 3, 1};
		System.out.println(subArrayVerifier.verifySubArray(myintsc, 17));

		int[] myintsd = {12, 1, 12, 3, 1};
		System.out.println(subArrayVerifier.verifySubArray(myintsd, 15));

		int[] myintse = {1};
		System.out.println(subArrayVerifier.verifySubArray(myintse, 1));
 
		int[] myintsf = {2,2};
		System.out.println(subArrayVerifier.verifySubArray(myintsf, 5));
 
		int[] myintsg = {3,3,3,4,4,4,5,5,5};
		System.out.println(subArrayVerifier.verifySubArray(myintsg, 12));

	}

}
