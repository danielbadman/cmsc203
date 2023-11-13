/* 

 * Class: CMSC203  

 * Instructor: Prof. David Kuijt

 * Description: Holiday Bonus JUnit Tests

 * Due: 11/12/2023 

 * Platform/compiler: Eclipse

 * I pledge that I have completed the programming assignment independently. 

*  I have not copied the code from a student or any source.  

*  I have not given my code to any student. 

*  Print your Name here: Daniel Badman

*/ 

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a HolidayBonus object.
 * 
 * @author Farnaz Eivazi
 * @version 7/13/2022
 * 
 */
public class HolidayBonusGFATest {

	private double[][] dataSet1 = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8 } };
	private double[][] dataSet2 = { { 12, 4, -2, 5.5 }, {10, 1, -13}, {-5, 6.1, 7.9} };

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculateHolidayBonusA() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet1);
			assertEquals(3000.0, result[0], .001);
			assertEquals(4000.0, result[1], .001);
			assertEquals(15000.0, result[2], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}

	}
	
	@Test
	public void testCalculateHolidayBonusB() {
		try {
			double[] result = HolidayBonus.calculateHolidayBonus(dataSet2);
			assertEquals(12000.0, result[0], .001);
			assertEquals(3000.0, result[1], .001);
			assertEquals(10000.0, result[2], .001);
		} catch (Exception e) {
			fail("This should not have caused an Exception");
		}

	}

	@Test
	public void testCalculateTotalHolidayBonusA() {
		assertEquals(22000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet1), .001);
	}
	
	@Test
	public void testCalculateTotalHolidayBonusB() {
		assertEquals(25000.0, HolidayBonus.calculateTotalHolidayBonus(dataSet2), .001);
	}

}
