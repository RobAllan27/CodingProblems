package efficientpowers;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class EfficientPowerCalculatorTest {

	//private static EfficientPowerCalculator myEfficientPowerCalculator;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		//myEfficientPowerCalculator = new EfficientPowerCalculator();
	}
	
	@Test
	public void Test1() {
		//fail("Not yet implemented");
		assertEquals(4096,EfficientPowerCalculator.testValue(2, 12));
	}

	@Test
	public void Test2() {
		//fail("Not yet implemented");
		assertEquals(19683,EfficientPowerCalculator.testValue(3, 9));
	}
	
	@Test
	public void Test3() {
		//fail("Not yet implemented");
		assertEquals(EfficientPowerCalculator.testValue(4, 17),17179869184L);
	}
	
	@Test
	public void Test4() {
		//fail("Not yet implemented");
		assertEquals(EfficientPowerCalculator.testValue(5, 7),78125);
	}
	
	@Test
	public void Test5() {
		//fail("Not yet implemented");
		assertEquals(EfficientPowerCalculator.testValue(6, 14),78364164096L);
	}
	
	@Test
	public void Test6() {
		//fail("Not yet implemented");
		assertEquals(EfficientPowerCalculator.testValue(7, 14),678223072849L);
	}

	@Test
	public void Test7() {
		//fail("Not yet implemented");
		assertEquals(EfficientPowerCalculator.testValue(8, 3),512L);
	}
	
	@Test
	public void Test8() {
		//fail("Not yet implemented");
		assertEquals(EfficientPowerCalculator.testValue(15, 4),50625);
	}
	
	@Test
	public void Test9() {
		//fail("Not yet implemented");
		assertEquals(EfficientPowerCalculator.testValue(45, 5),184528125);
	}
	
	@Test
	public void Test10() {
		//fail("Not yet implemented");
		assertEquals(EfficientPowerCalculator.testValue(456, 5),19716245323776L);
	}
}
