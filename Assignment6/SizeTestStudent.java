import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SizeTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testValues() {
		Size[] vals = Size.values();
		assertEquals(vals[0], Size.SMALL);
		assertEquals(vals[1], Size.MEDIUM);
		assertEquals(vals[2], Size.LARGE);
	}
	
	@Test
	void testValueOf() {
		assertEquals(Size.SMALL, Size.valueOf("SMALL"));
		assertEquals(Size.MEDIUM, Size.valueOf("MEDIUM"));
		assertEquals(Size.LARGE, Size.valueOf("LARGE"));
	}

}
