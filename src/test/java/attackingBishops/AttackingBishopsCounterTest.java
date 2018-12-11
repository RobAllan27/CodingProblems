package attackingBishops;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import arraypartsaddtosum.ArrayPartsAdder;

public class AttackingBishopsCounterTest {

	private static AttackingBishopsCounter myABC;
	
	@Test
	public void test1() {
		//fail("Not yet implemented");
		myABC = new AttackingBishopsCounter(5);
		myABC.addBishop(3,3);
		myABC.addBishop(2,2);
		myABC.addBishop(1,1);
		myABC.addBishop(0,0);
		myABC.addBishop(0,1);
		myABC.addBishop(1,2);
		myABC.addBishop(2,3);
		myABC.addBishop(0,3);
		myABC.addBishop(2,1);
		myABC.addBishop(3,0);
		assertEquals(30,myABC.countAttacker());
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented");
		myABC = new AttackingBishopsCounter(5);
		myABC.addBishop(1,1);
		myABC.addBishop(0,0);
		myABC.addBishop(0,1);
		myABC.addBishop(1,2);
		assertEquals(4,myABC.countAttacker());
	}
	
	@Test
	public void test3() {
		//fail("Not yet implemented");
		myABC = new AttackingBishopsCounter(5);
		assertEquals(0,myABC.countAttacker());
	}
	
	@Test
	public void test4() {
		//fail("Not yet implemented");
		myABC = new AttackingBishopsCounter(5);
		myABC.addBishop(0,0);
		myABC.addBishop(0,1);
		myABC.addBishop(1,0);
		myABC.addBishop(1,1);
		assertEquals(4,myABC.countAttacker());
	}
	
	@Test
	public void test5() {
		//fail("Not yet implemented");
		myABC = new AttackingBishopsCounter(5);
		myABC.addBishop(0,0);
		myABC.addBishop(1,1);
		myABC.addBishop(2,2);
		myABC.addBishop(3,3);
		myABC.addBishop(4,4);
		assertEquals(20,myABC.countAttacker());
	}
	
	@Test
	public void test6() {
		//fail("Not yet implemented");
		myABC = new AttackingBishopsCounter(5);
		myABC.addBishop(0,4);
		myABC.addBishop(1,3);
		myABC.addBishop(2,2);
		myABC.addBishop(3,1);
		myABC.addBishop(4,0);
		assertEquals(20,myABC.countAttacker());
	}
	
	@Test
	public void test7() {
		//fail("Not yet implemented");
		myABC = new AttackingBishopsCounter(5);
		myABC.addBishop(2,2);
		myABC.addBishop(3,3);
		myABC.addBishop(2,3);
		myABC.addBishop(3,2);
		assertEquals(4,myABC.countAttacker());
	}
	
	@Test
	public void test8() {
		//fail("Not yet implemented");
		myABC = new AttackingBishopsCounter(5);
		myABC.addBishop(0,0);
		myABC.addBishop(0,1);
		myABC.addBishop(0,2);
		myABC.addBishop(0,3);
		myABC.addBishop(0,4);
		assertEquals(0,myABC.countAttacker());
	}
	
	@Test
	public void test9() {
		//fail("Not yet implemented");
		myABC = new AttackingBishopsCounter(5);
		myABC.addBishop(0,0);
		myABC.addBishop(1,0);
		myABC.addBishop(2,0);
		myABC.addBishop(3,0);
		myABC.addBishop(4,0);
		assertEquals(0,myABC.countAttacker());
	}
}
