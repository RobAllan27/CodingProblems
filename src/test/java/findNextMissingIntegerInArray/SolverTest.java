package findNextMissingIntegerInArray;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class SolverTest {

	static MissingIntegerSolver mySolver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		mySolver  = new MissingIntegerSolver();
		
	}

	@Test
	public void testRun1() {
		assertEquals(0,mySolver.run("-4,-3,-2,-1"));
	
	}
	
	@Test
	public void testRun2() {
		assertEquals(2,mySolver.run("-4,-3,0,1")); // return 2		
	}
	
	@Test
	public void testRun3() {
		assertEquals(3,mySolver.run("-4,-3,0,1,2")); // return 3
	}	
	
	@Test
	public void testRun4() {
		assertEquals(3,mySolver.run("-4,-3,0,1,2")); // return 3
	}	
	
	@Test
	public void testRun5() {
		assertEquals(2,mySolver.run("-4,-3,0,1,3")); // return 2
	}	
	
	@Test
	public void testRun6() {
		assertEquals(2,mySolver.run("-4,-3,0,1,3,4")); // return 2
	}	
	
	@Test
	public void testRun7() {
		assertEquals(2,mySolver.run("-4,-3,0,1,3,4,5")); // return 2	
	}	
	
	@Test
	public void testRun8() {
		assertEquals(2,mySolver.run("-4,-3,0,1,4")); // return 2

	}	
	
	@Test
	public void testRun9() {
		assertEquals(2,mySolver.run("-4,-3,0,1,4,5")); // return 2
	}
	
	@Test
	public void testRun10() {
		assertEquals(9,mySolver.run("6,7,8,")); // return 9	
	}
	

}
