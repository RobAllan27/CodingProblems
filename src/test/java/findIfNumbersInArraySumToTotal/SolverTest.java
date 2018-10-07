package findIfNumbersInArraySumToTotal;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class SolverTest {

	private static NumbersInArraySumtoTotalSolver mySolver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		mySolver = new NumbersInArraySumtoTotalSolver();
	}

	// First set of test cases looks at where there just 2 valeus being tested
	
	// second set of test cases looks at where we have a target and we see if the total 
	// can be made using N (all N) parameters
	
	/*
	 * Test cases - part 1
	 * [0,0,0,0] and T = 1, should be false
	 * [0,0,1,0] and T = 1, should be true
	 * [0,0,1,1] and T = 1, should be false
	 * [0,0,-,1] and T = 0, should be true
	 * [0,0,2,2] and T = 3, should be false
	 * [0,0,2,2] and T = 4, should be false
	 * [0,0,-2,-2] and T = -5, should be false
	 * [0,0,-2,-2] and T = -4, should be true
	 * [0,0,-2,-3] and T = -4, should be false
	 * [0,0,-2,-3] and T = -5, should be true
	 * [0,0,2,3] and T = 4, should be false
	 * [0,0,2,3] and T = 5, should be true
	 * [-1,-3,8,9] and T = 10, should be false
	 * [-1,-3,8,9] and T = 7, should be true
	 * [-1,-3,8,9] and T = 8, should be true
	 * [2,4,8,9] and T = 21, should be false
	 * [2,4,8,9] and T = 12, should be true
	 * [1,2,3,4,8,9] and T = 15, should be false
	 * [1,2,3,4,8,9] and T = 17, should be true
	 */
	
	@Test
	public void testRun1() {
		
		// [0,0,0,0] and T = 1, should be false
		assertFalse(mySolver.run("0,0,0,0",1));
	}
	
	@Test
	public void testRun2() {

		// [0,0,1,0] and T = 1, should be true
		assertTrue(mySolver.run("0,0,1,0",1));
	}
	
	@Test
	public void testRun3() {

		// * [0,0,1,1] and T = 1, should be false
		assertTrue(mySolver.run("0,0,1,1",1));
	}
	
	@Test
	public void testRun4() {
	// * [0,0,-1,1] and T = 0, should be true
		assertTrue(mySolver.run("0,0,-1,1",0));
	}
	
	@Test
	public void testRun5() {

		// * [0,0,2,2] and T = 3, should be false
		assertFalse(mySolver.run("0,0,2,2",3));
	}
	
	@Test
	public void testRun6() {
		// * [0,0,2,2] and T = 4, should be true
		assertTrue(mySolver.run("0,0,2,2",4));
	}
	
	@Test
	public void testRun7() {
		// * [0,0,-2,-2] and T = -5, should be false
		assertFalse(mySolver.run("0,0,-2,-2",-5));
	}
	
	@Test
	public void testRun8() {
		// * [0,0,-2,-2] and T = -4, should be true
		assertTrue(mySolver.run("0,0,-2,-2",-4));
	}
	
	@Test
	public void testRun9() {

		// * [0,0,-2,-3] and T = -5, should be true
		assertTrue(mySolver.run("0,0,-2,-3",-5));
	}
	
	@Test
	public void testRun10() {

		// * [0,0,2,3] and T = 4, should be false
		assertFalse(mySolver.run("0,0,2,3",4));

	}
	
	@Test
	public void testRun11() {
		 //* [0,0,2,3] and T = 5, should be true
		assertTrue(mySolver.run("0,0,2,3",5));
	}
	
	@Test
	public void testRun12() {

		// * [-1,-3,8,9] and T = 10, should be false
		assertFalse(mySolver.run("-1,-3,8,9",10));

	}
	
	@Test
	public void testRun13() {
		 // * [-1,-3,8,9] and T = 7, should be true
		assertTrue(mySolver.run("-1,-3,8,9",7));
	}
	
	@Test
	public void testRun14() {

		// * [-1,-3,8,9] and T = 8, should be true
		assertTrue(mySolver.run("-1,-3,8,9",8));

	}
	
	@Test
	public void testRun15() {
		 // * [2,4,8,9] and T = 21, should be false
		assertFalse(mySolver.run("2,4,8,9",21));
	}
	
	@Test
	public void testRun16() {

		//	 * [2,4,8,9] and T = 12, should be true	
		assertTrue(mySolver.run("2,4,8,9",12));
	}
	
	@Test
	public void testRun17() {

	// * [1,2,3,4,8,9] and T = 15, should be false
		assertFalse(mySolver.run("1,2,3,4,8,9",15));
	}
	
	@Test
	public void testRun18() {

		// * [1,2,3,4,8,9] and T = 17, should be true
		assertTrue(mySolver.run("1,2,3,4,8,9",17));
	}
	
	// Second set of tests
	
	
	@Test
	public void testRun30() {	
	assertTrue(mySolver.TestValue("1,2,3,4",5,2));
	}	
	
	@Test
	public void testRun31() {
	assertTrue(mySolver.TestValue("1,2,3,4",6,2));
	}
	
	@Test
	public void testRun32() {
	assertTrue(mySolver.TestValue("1,2,3,4",7,2));
	}	
	
	@Test
	public void testRun33() {
	assertTrue(mySolver.TestValue("1,2,3,4",8,3));
	}	
	
	@Test
	public void testRun34() {
	assertTrue(mySolver.TestValue("1,2,3,4",9,3));
	}	
	
	@Test
	public void testRun35() {
	assertFalse(mySolver.TestValue("1,2,3,4",10,3));
	}	
	
	@Test
	public void testRun36() {
	assertFalse(mySolver.TestValue("1,2,3,4",9,4));
	}	
	
	@Test
	public void testRun37() {
	assertFalse(mySolver.TestValue("1,2,3,4",11,4));
	}	
	
	@Test
	public void testRun38() {
	assertFalse(mySolver.TestValue("-1,2,3,4",8,3));
	}	
	
	@Test
	public void testRun39() {
	assertTrue(mySolver.TestValue("-1,2,3,4",8,4));
	}	
	
	@Test
	public void testRun40() {
	assertTrue(mySolver.TestValue("-1,-2,-3,-4",-10,4));
	}	
	
	@Test
	public void testRun41() {
	assertTrue(mySolver.TestValue("-1,-2,-3,-4",-9,3));
	}	
	
	@Test
	public void testRun42() {
	assertFalse(mySolver.TestValue("-1,-2,-3,-4",-9,5));
	}	
	
	@Test
	public void testRun43() {
	assertTrue(mySolver.TestValue("-10,20,3,-4",23,2));
	}	
	
	@Test
	public void testRun44() {
	assertTrue(mySolver.TestValue("-10,20,3,4",-10,1));
	}	
	
	@Test
	public void testRun45() {
	assertTrue(mySolver.TestValue("-10,20,3,4",20,1));
	}	
	
	@Test
	public void testRun46() {
	assertTrue(mySolver.TestValue("-10,20,3,4",3,1));
	}
	
	@Test
	public void testRun47() {
	assertTrue(mySolver.TestValue("-10,20,3,4",4,1));
	}
}
