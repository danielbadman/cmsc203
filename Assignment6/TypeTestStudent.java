import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TypeTestStudent {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testValues() {
		Type[] vals = Type.values();
		assertEquals(vals[0], Type.COFFEE);
		assertEquals(vals[1], Type.SMOOTHIE);
		assertEquals(vals[2], Type.ALCOHOL);
	}
	
	@Test
	void testValueOf() {
		assertEquals(Type.COFFEE, Type.valueOf("COFFEE"));
		assertEquals(Type.SMOOTHIE, Type.valueOf("SMOOTHIE"));
		assertEquals(Type.ALCOHOL, Type.valueOf("ALCOHOL"));
	}

}
