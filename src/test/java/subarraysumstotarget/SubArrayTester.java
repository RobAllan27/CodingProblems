package subarraysumstotarget;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class SubArrayTester {
	
	private static SubArrayVerifier mySubArrayVerifier;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mySubArrayVerifier = new SubArrayVerifier();
	}

	@Test
	public void test1() {
		//fail("Not yet implemented");
		int[] intarray = {12, 1, 12, 3, 1};
		assertEquals("12,12",mySubArrayVerifier.verifySubArray(intarray,24));
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented"); 
		int[] intarray = {12, 1, 12, 3, 1};
		assertEquals("12,3",mySubArrayVerifier.verifySubArray(intarray,15));
	}
	
	@Test
	public void test3() {
		//fail("Not yet implemented");
		int[] intarray = {12, 1, 8, 3, 1};
		assertEquals("12,3,1,1",mySubArrayVerifier.verifySubArray(intarray,17));
	}
	
	@Test
	public void test4() {
		//fail("Not yet implemented");
		int[] intarray = {12, 1, 12, 3, 1};
		assertEquals("5,4,3,2,1",mySubArrayVerifier.verifySubArray(intarray, 15));
	}
	
	@Test
	public void test5() {
		//fail("Not yet implemented");
		int[] intarray = {1};
		assertEquals("1",mySubArrayVerifier.verifySubArray(intarray,1));
	}
	
	@Test
	public void test6() {
		//fail("Not yet implemented"); 
		int[] intarray = {2,2};
		assertEquals("null",mySubArrayVerifier.verifySubArray(intarray,5));
	}
	
	@Test
	public void test7() {
		//fail("Not yet implemented"); 
		int[] intarray = {3,3,3,4,4,4,5,5,5};
		assertEquals("12,12",mySubArrayVerifier.verifySubArray(intarray, 12));
	}
}
