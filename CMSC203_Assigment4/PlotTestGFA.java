
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * This class represents GFA test cases for a Plot object.
 * 
 * @author Farnaz Eivazi
 * @version 7/11/2022
 * 
 */
public class PlotTestGFA {
	private Plot plot1, plot5;

	@Before
	public void setUp() throws Exception {
		plot1 = new Plot(2, 2, 6, 6);
		plot5 = new Plot(3, 4, 4, 3);
	}

	@After
	public void tearDown() throws Exception {
		plot1 = plot5 = null;
	}

	@Test
	public void testOverlaps() {
		assertTrue(plot1.overlaps(plot5)); // plot5 is entirely inside plot1
	}
	
	@Test
	public void testToString() {
		assertEquals("3,4,4,3",plot5.toString());	
	}
	
	@Test
	public void testEncompasses() {
		assertTrue(plot1.encompasses(plot5));
	}
	
	@Test
	public void testGetX() {
		assertEquals(2, plot1.getX());
	}
	
	@Test
	public void testGetY() {
		assertEquals(2, plot1.getY());
	}
	
	@Test
	public void testGetWidth() {
		assertEquals(6, plot1.getWidth());
	}
	
	@Test
	public void testGetDepth() {
		assertEquals(6, plot1.getDepth());
	}

}
