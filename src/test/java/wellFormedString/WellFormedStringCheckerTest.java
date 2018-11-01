package wellFormedString;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import findNextMissingIntegerInArray.MissingIntegerSolver;

public class WellFormedStringCheckerTest {

	private static WellFormedStringChecker myWellFormedStringChecker;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

		myWellFormedStringChecker = new WellFormedStringChecker();
	}

	@Test
	@Ignore
	public void test1() {
		//myWellFormedStringChecker.testStringForWQellFormedNess(inString);
	}

	@Test
	public void test2() {
		assertFalse(myWellFormedStringChecker.testStringForWQellFormedNess("["));
	}

	@Test
	public void test3() {
		assertTrue(myWellFormedStringChecker.testStringForWQellFormedNess("{}"));
	}
	
	@Test
	public void test4() {
		assertTrue(myWellFormedStringChecker.testStringForWQellFormedNess("{<[]>}"));
	}

	@Test
	public void test5() {			
		assertTrue(myWellFormedStringChecker.testStringForWQellFormedNess("{<[{<[]>}]>}"));
	}
	
	@Test
	public void test6() {					
		assertFalse(myWellFormedStringChecker.testStringForWQellFormedNess("{<[}{]>}"));
	}	
	
	@Test
	public void test7() {
		assertFalse(myWellFormedStringChecker.testStringForWQellFormedNess("{<[}]>}"));
}	
	@Test
public void test8() {
	assertTrue(myWellFormedStringChecker.testStringForWQellFormedNess("{<[{<[]{}>}]>}"));
}

	@Test
public void test9() {
	assertTrue(myWellFormedStringChecker.testStringForWQellFormedNess("{<[{<[]{}<>>}]>}"));
}	

	@Test
public void test10() {
	assertFalse(myWellFormedStringChecker.testStringForWQellFormedNess("}"));
		}
	
	@Test
	public void test11() {
		assertFalse(myWellFormedStringChecker.testStringForWQellFormedNess(""));
	}	
	
	@Test
	public void test12() {
		assertTrue(myWellFormedStringChecker.testStringForWQellFormedNess("{}[]<>"));
	}
	
	@Test
	public void test13() {
		assertFalse(myWellFormedStringChecker.testStringForWQellFormedNess("{}[]<"));
	}
	
	@Test
	public void test14() {
		assertFalse(myWellFormedStringChecker.testStringForWQellFormedNess("{}[]>"));
	}

	@Test
	public void test15() {
		assertFalse(myWellFormedStringChecker.testStringForWQellFormedNess("{}]<>"));
	}

	@Test
	public void test16() {
		//fail("Not yet implemented");
		assertFalse(myWellFormedStringChecker.testStringForWQellFormedNess("{}[<>"));
	}

	@Test
	public void test17() {
		//fail("Not yet implemented");
		assertFalse(myWellFormedStringChecker.testStringForWQellFormedNess("{[]<>"));
		}
	
	@Test
	public void test18() {
			//fail("Not yet implemented");
			assertFalse(myWellFormedStringChecker.testStringForWQellFormedNess("}[]<>"));
	}		

}
