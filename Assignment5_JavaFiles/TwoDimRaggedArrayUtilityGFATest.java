/* 

 * Class: CMSC203  

 * Instructor: Prof. David Kuijt

 * Description: Two Dimensional Ragged Array Utility JUnit Tests

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
 * This class represents GFA test cases for a TwoDimRaggedArrayUtility object.
 * 
 * @author Farnaz Eivazi
 * @version 7/13/2022
 * 
 */
public class TwoDimRaggedArrayUtilityGFATest {
	private double[][] dataSet1 = {{1,2,3},{4,5},{6,7,8,9}};
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test getRowTotal method
	 * Returns the total of all the elements of row 1.
	 * Row 0 refers to the first row in the two dimensional array
	 */
	
	@Test
	public void testGetTotal() {
		assertEquals(45.0,TwoDimRaggedArrayUtility.getTotal(dataSet1),.001);
	}
	
	@Test
	public void testGetAverage() {
		assertEquals(5.0,TwoDimRaggedArrayUtility.getAverage(dataSet1),.001);
	}
	
	@Test
	public void testGetRowTotal() {
		assertEquals(9.0,TwoDimRaggedArrayUtility.getRowTotal(dataSet1,1),.001);
	}
	
	@Test
	public void testGetColumnTotal() {
		assertEquals(11.0,TwoDimRaggedArrayUtility.getColumnTotal(dataSet1,0),.001);
	}
	
	@Test
	public void testGetHighestInRow() {
		assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInRow(dataSet1, 2), .001);
	}
	
	@Test
	public void testGetHighestInRowIndex() {
		assertEquals(3, TwoDimRaggedArrayUtility.getHighestInRowIndex(dataSet1, 2));
	}
	
	@Test
	public void testGetLowestInRow() {
		assertEquals(4.0, TwoDimRaggedArrayUtility.getLowestInRow(dataSet1, 1), .001);
	}
	
	@Test
	public void testGetLowestInRowIndex() {
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInRowIndex(dataSet1, 1));
	}
	
	@Test
	public void testGetHighestInColumn() {
		assertEquals(8.0, TwoDimRaggedArrayUtility.getHighestInColumn(dataSet1, 2), .001);
	}
	
	@Test
	public void testGetHighestInColumnIndex() {
		assertEquals(2, TwoDimRaggedArrayUtility.getHighestInColumnIndex(dataSet1, 2));
	}
	
	@Test
	public void testGetLowestInColumn() {
		assertEquals(3.0, TwoDimRaggedArrayUtility.getLowestInColumn(dataSet1, 2), .001);
	}
	
	@Test
	public void testGetLowestInColumnIndex() {
		assertEquals(0, TwoDimRaggedArrayUtility.getLowestInColumnIndex(dataSet1, 2));
	}
	
	@Test
	public void testGetHighestInArray() {
		assertEquals(9.0, TwoDimRaggedArrayUtility.getHighestInArray(dataSet1), .001);
	}
	
	@Test
	public void testGetLowestInArray() {
		assertEquals(1.0, TwoDimRaggedArrayUtility.getLowestInArray(dataSet1), .001);
	}
}
