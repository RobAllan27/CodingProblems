package runLengthEncoder;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import findNextMissingIntegerInArray.MissingIntegerSolver;

public class RunLengthEncoderTest {

	private static RunLengthEncoder myRLencdr;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		myRLencdr  = new RunLengthEncoder();
	}

	@Test
	public void test1() {
		assertEquals("1a",myRLencdr.getRunLengthEncoding("a"));
	}
	
	@Test
	public void test2() {
		assertEquals("1A",myRLencdr.getRunLengthEncoding("A"));
	}
	
	@Test
	public void test3() {
		assertEquals("3a2b2c2A",myRLencdr.getRunLengthEncoding("aaabbccAA"));
	}
	
	@Test
	public void test4() {
		assertEquals("3a212c22",myRLencdr.getRunLengthEncoding("aaa11cc22"));
	}
	
	
	
	@Test
	public void test5() {
		assertEquals("8a",myRLencdr.getRunLengthEncoding("aaaaaaaa"));
	}
	
	@Test
	public void test6() {
		assertEquals("1a1b1c1.1}1_1+",myRLencdr.getRunLengthEncoding("abc.}_+"));
	}
	
	@Test
	public void test7() {
		assertEquals("2a2b3c1.2}1_1+",myRLencdr.getRunLengthEncoding("aabbccc.}}_+"));
	}
	
}
