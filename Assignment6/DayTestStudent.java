import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DayTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testValues() {
		Day[] vals = Day.values();
		assertEquals(vals[0], Day.MONDAY);
		assertEquals(vals[1], Day.TUESDAY);
		assertEquals(vals[2], Day.WEDNESDAY);
		assertEquals(vals[3], Day.THURSDAY);
		assertEquals(vals[4], Day.FRIDAY);
		assertEquals(vals[5], Day.SATURDAY);
		assertEquals(vals[6], Day.SUNDAY);
	}
	
	@Test
	void testValueOf() {
		assertEquals(Day.MONDAY, Day.valueOf("MONDAY"));
		assertEquals(Day.TUESDAY, Day.valueOf("TUESDAY"));
		assertEquals(Day.WEDNESDAY, Day.valueOf("WEDNESDAY"));
		assertEquals(Day.THURSDAY, Day.valueOf("THURSDAY"));
		assertEquals(Day.FRIDAY, Day.valueOf("FRIDAY"));
		assertEquals(Day.SATURDAY, Day.valueOf("SATURDAY"));
		assertEquals(Day.SUNDAY, Day.valueOf("SUNDAY"));
	}

}
