import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoffeeTestStudent {
	Coffee coffee1;
	@BeforeEach
	void setUp() throws Exception {
		coffee1 = new Coffee("Latte", Size.SMALL, true, false);
	}

	@AfterEach
	void tearDown() throws Exception {
	coffee1 = null;
	}

	@Test
	void testGetExtraShot() {
		assertTrue(coffee1.getExtraShot());
	}
	
	@Test
	void testGetExtraSyrup() {
		assertFalse(coffee1.getExtraSyrup());
	}
	
	@Test
	void testCalcPrice() {
		assertEquals(2.50, coffee1.calcPrice());
	}
	
	@Test
	void testToString() {
		assertEquals("Beverage Name: Latte\nSize: SMALL\nHas extra shot\nNo extra syrup", coffee1.toString());
	}

	@Test
	void testEquals() {
		Coffee coffee2 = new Coffee("Latte", Size.SMALL, true, false);
		assertTrue(coffee1.equals(coffee2));
	}
}
