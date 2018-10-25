package backUpCalendarGeneratorTests;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import backUpCalendarGenerator.BackUpCalendarGenerator;

public class BackupCalendarQueryableTest {

	private static BackUpCalendarGenerator myBackUpCalendarGenerator;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		myBackUpCalendarGenerator = new BackUpCalendarGenerator();
	}
	
	@Test
	public void testGetDiskChoiceForDate1() {
	assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(9,2,"01-Jan-2018"),1);
	}
	
	@Test
	public void testGetDiskChoiceForDate2() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(9,2,"02-Jan-2018"),2);
	}
	
	@Test
	public void testGetDiskChoiceForDate3() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(9,2,"27-Jan-2018"),1);
	}
	
	@Test
	public void testGetDiskChoiceForDate4(){
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(9,2,"28-Jan-2018"),3);
	}
	
	//assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(9,2,"09-Sep-2018"),9);
	
	@Test
	public void testGetDiskChoiceForDate5(){
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(9,2,"13-Sep-2018"),9);
	}
	
	
	@Test
	public void testGetDiskChoiceForDate6() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(8,2,"13-Sep-2018"),1);
	}
	
	@Test
	public void testGetDiskChoiceForDate7() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(10,2,"13-Sep-2018"),9);
	}
	
	@Test
	public void testGetDiskChoiceForDate8() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(9,2,"30-Dec-2018"),3);
	}
	
	@Test
	public void testGetDiskChoiceForDate9() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(9,2,"31-Dec-2018"),1);
	}
	
	@Test
	public void testGetDiskChoiceForDate10() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(6,3,"01-Jan-2018"),1);
	}
	
	@Test
	public void testGetDiskChoiceForDate11() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(6,3,"02-Jan-2018"),1);
	}
	
	@Test
	public void testGetDiskChoiceForDate12() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(6,3,"27-Jan-2018"),4);
	}
	
	@Test
	public void testGetDiskChoiceForDate13() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(3,3,"27-Jan-2018"),1);
	}
	
	@Test
	public void testGetDiskChoiceForDate14() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(6,3,"28-Jan-2018"),1);
	}
	
	@Test
	public void testGetDiskChoiceForDate15() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(6,3,"20-Nov-2018"),5);
	}
	
	@Test
	public void testGetDiskChoiceForDate16() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(6,3,"30-Dec-2018"),1);
	}
	
	@Test
	public void testGetDiskChoiceForDate17() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(6,3,"31-Dec-2018"),1);
	}

	@Test
	public void testGetDiskChoiceForDate18() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(5,4,"01-Jan-2018"),1);
	}
	
	@Test
	public void testGetDiskChoiceForDate19() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(5,4,"02-Jan-2018"),1);
	}
	
	@Test
	public void testGetDiskChoiceForDate20() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(5,4,"27-Jan-2018"),1);
	}
	
	@Test
	public void testGetDiskChoiceForDate21() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(5,4,"28-Jan-2018"),2);
	}
	
	@Test
	public void testGetDiskChoiceForDate22() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(5,4,"13-Sep-2018"),5);
	}
	
	@Test
	public void testGetDiskChoiceForDate23() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(4,4,"13-Sep-2018"),1);
	}
	
	@Test
	public void testGetDiskChoiceForDate25() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(5,4,"30-Dec-2018"),2);
	}
	
	@Test
	public void testGetDiskChoiceForDate26() {
		assertEquals(myBackUpCalendarGenerator.getDiskChoiceForDate(5,4,"31-Dec-2018"),1);
	}
}

/****
 * 
 * 
 * 
 * 
 * The following test cases are provided 
radix 2 i.e. 2 day base cycle ###############
Should have 9 test disks
Check if only 8 disks at day 256 that we use disk 1 
•	x is 1 to bits 1
•	x is 2 to bits 10
•	x is 27 to bits 11011
•	x is 28 to bits 11100
•	x is 256 to bits 100000000
•	x is 257 to bits 100000001
•	x is 364 to bits 101101100
•	x is 365 to bits 101101101

getDiskChoiceForDate(int numberOfDisks, int radix, String dateInQuestion)

getDiskChoiceForDate(9,2,"01-Jan-2018"),1);
getDiskChoiceForDate((9,2,"02-Jan-2018"),2);
getDiskChoiceForDate((9,2,"27-Jan-2018"),1);
getDiskChoiceForDate((9,2,"28-Jan-2018"),3);
getDiskChoiceForDate((9,2,"13-Sep-2018"),9);
getDiskChoiceForDate((8,2,"13-Sep-2018"),1);
getDiskChoiceForDate((10,2,"13-Sep-2018"),9);
getDiskChoiceForDate((9,2,"30-Dec-2018"),1);
getDiskChoiceForDate((9,2,"31-Dec-2018"),3);

radix 3 i.e. 3 day base cycle ###############
Should have 6 test disks
Check if only 3 disks at day 27 that we use disk 1 

•	x is 1 to bits 1
•	x is 2 to bits 2
•	x is 27 to bits 1000
•	x is 28 to bits 1001
•	x is 324 to bits 110000
•	x is 364 to bits 111111
•	x is 365 to bits 111112

getDiskChoiceForDate(6,3,"01-Jan-2018"),1);
getDiskChoiceForDate((6,3,"02-Jan-2018"),1);
getDiskChoiceForDate((6,3,"27-Jan-2018"),4);
getDiskChoiceForDate((3,3,"27-Jan-2018"),1);
getDiskChoiceForDate((6,3,"28-Jan-2018"),1);
getDiskChoiceForDate((6,3,"20-Nov-2018"),5);
getDiskChoiceForDate((6,3,"30-Dec-2018"),1);
getDiskChoiceForDate((6,3,"31-Dec-2018"),1);


radix 4 i.e. 4 day base cycle ###############
Should have 5 test disks
Check if only 4 disks at day 256 that we use disk 1 
•	x is 1 to bits 1
•	x is 2 to bits 2
•	x is 3 to bits 3
•	x is 27 to bits 123
•	x is 28 to bits 130
•	x is 256 to bits 10000
•	x is 364 to bits 11230
•	x is 365 to bits 11231


getDiskChoiceForDate(5,4,"01-Jan-2018"),1);
getDiskChoiceForDate((5,4,"02-Jan-2018"),1);
getDiskChoiceForDate((5,4,"27-Jan-2018"),1);
getDiskChoiceForDate((5,4,"28-Jan-2018"),2);
getDiskChoiceForDate((5,4,"13-Sep-2018"),5);
getDiskChoiceForDate((4,4,"13-Sep-2018"),1);
getDiskChoiceForDate((5,4,"30-Dec-2018"),2);
getDiskChoiceForDate((5,4,"31-Dec-2018"),1);

*****/
