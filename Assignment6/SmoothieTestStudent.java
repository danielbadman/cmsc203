import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SmoothieTestStudent {
	Smoothie smoothie1;
	@BeforeEach
	void setUp() throws Exception {
		smoothie1 = new Smoothie("Berry Blend", Size.LARGE, 3, true);
	}

	@AfterEach
	void tearDown() throws Exception {
		smoothie1 = null;
	}

	@Test
	void testGetNumOfFruits() {
		assertEquals(3, smoothie1.getNumOfFruits());
	}
	
	@Test
	void testGetAddProtein() {
		assertTrue(smoothie1.getAddProtein());
	}
	
	@Test
	void testCalcPrice() {
		assertEquals(7.00, smoothie1.calcPrice());
	}
	
	@Test
	void testToString() {
		assertEquals("Beverage Name: Berry Blend\nSize: LARGE\nNumber of Fruits: 3\nHas protein", smoothie1.toString());
	}

	@Test
	void testEquals() {
		Smoothie smoothie2 = new Smoothie("Berry Blend", Size.LARGE, 3, true);
		Smoothie smoothie3 = new Smoothie("Berry Mash", Size.LARGE, 3, true);
		assertTrue(smoothie1.equals(smoothie2));
		assertFalse(smoothie1.equals(smoothie3));
	}
}
