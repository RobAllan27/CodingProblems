package arraypartsaddtosum;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import backUpCalendarGenerator.BackUpCalendarGenerator;

public class ArrayPartsAdderTest {

	
	private static ArrayPartsAdder myArrayPartsAdder;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		myArrayPartsAdder = new ArrayPartsAdder();
	}
	
	
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertTrue(myArrayPartsAdder.checkArrayAdder(new int[] {1,2,3}));
	}
	
	@Test
	public void test1() {
		//fail("Not yet implemented");
		assertFalse(myArrayPartsAdder.checkArrayAdder(new int[] {0,2,3}));
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented");
		assertFalse(myArrayPartsAdder.checkArrayAdder(new int[] {0,0,3}));
	}
	
	@Test
	public void test3() {
		//fail("Not yet implemented");
		assertTrue(myArrayPartsAdder.checkArrayAdder(new int[] {1,1,2}));
	}

	@Test
	public void test4() {
		//fail("Not yet implemented");
		assertTrue(myArrayPartsAdder.checkArrayAdder(new int[] {0,0}));
	}
	
	@Test
	public void test5() {
		//fail("Not yet implemented");
		assertTrue(myArrayPartsAdder.checkArrayAdder(new int[] {1,1}));
	}
	
	
	@Test
	public void test6() {
		//fail("Not yet implemented");
		assertFalse(myArrayPartsAdder.checkArrayAdder(new int[] {10,10,20,30,40,120}));
	}
	
	@Test
	public void test7() {
		//fail("Not yet implemented");
		assertFalse(myArrayPartsAdder.checkArrayAdder(new int[] {10,10,20,30,40,120,121,122}));
	}
	
	@Test
	public void test8() {
		//fail("Not yet implemented");
		assertTrue(myArrayPartsAdder.checkArrayAdder(new int[] {1,1}));
	}
	
	@Test
	public void test9() {
		//fail("Not yet implemented");
		assertTrue(myArrayPartsAdder.checkArrayAdder(new int[] {10,10,10,20,30,40,120}));
	}
}
