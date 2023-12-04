import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AlcoholTestStudent {
	Alcohol alc1;
	@BeforeEach
	void setUp() throws Exception {
		alc1 = new Alcohol("Modelo", Size.MEDIUM, true);
	}

	@AfterEach
	void tearDown() throws Exception {
		alc1 = null;
	}

	@Test
	void testIsWeekend () {
		assertTrue(alc1.isWeekend());
	}
	
	@Test
	void testCalcPrice() {
		assertEquals(3.60, alc1.calcPrice());
	}
	
	@Test
	void testToString() {
		assertEquals("Beverage Name: Modelo\nSize: MEDIUM\nIs weekend", alc1.toString());
	}
	
	@Test
	void testEquals() {
		Alcohol alc2 = new Alcohol("Modelo", Size.MEDIUM, true);
		assertTrue(alc1.equals(alc2));
	}
}
