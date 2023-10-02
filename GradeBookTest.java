import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook gradebook1;
	GradeBook gradebook2;
	@BeforeEach
	void setUp() throws Exception {
	gradebook1 = new GradeBook(5);
	gradebook2 = new GradeBook(5);
	gradebook1.addScore(51);
	gradebook1.addScore(29);
	gradebook1.addScore(34);
	gradebook2.addScore(63);
	gradebook2.addScore(72);
	gradebook2.addScore(82);
	}

	@AfterEach
	void tearDown() throws Exception {
	gradebook1 = null;
	gradebook2 = null;
	}

	@Test
	void testGetScoresSize() {
		assertEquals(3, gradebook1.getScoresSize());
		assertEquals(3, gradebook2.getScoresSize());
	}

	@Test
	void testAddScore() {
		assertEquals(3, gradebook1.getScoresSize());
		assertEquals(3, gradebook2.getScoresSize());
	}

	@Test
	void testSum() {
		assertEquals(114, gradebook1.sum());
		assertEquals(217, gradebook2.sum());
	}

	@Test
	void testMinimum() {
		assertEquals(29, gradebook1.minimum());
		assertEquals(63, gradebook2.minimum());
	}

	@Test
	void testFinalScore() {
		assertEquals(85, gradebook1.finalScore());
		assertEquals(154, gradebook2.finalScore());
	}

	@Test
	void testToString() {
		assertTrue(gradebook1.toString().equals("51 29 34"));
		assertTrue(gradebook1.toString().equals("63 72 82"));
	}

}
