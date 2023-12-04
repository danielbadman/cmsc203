import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTestStudent {
	Customer customer1;
	@BeforeEach
	void setUp() throws Exception {
	customer1 = new Customer("Yhapojj", 22);
	}

	@AfterEach
	void tearDown() throws Exception {
	customer1 = null;
	}

	@Test
	void testGetName() {
		assertEquals("Yhapojj", customer1.getName());
	}
	
	@Test
	void testGetAge() {
		assertEquals(22, customer1.getAge());
	}
	
	@Test
	void testSetName() {
		customer1.setName("Izaya");
		assertEquals("Izaya", customer1.getName());
	}
	
	@Test
	void testSetAge() {
		customer1.setAge(33);
		assertEquals(33, customer1.getAge());
	}
	
	@Test
	void testToString() {
		assertEquals("Name: Yhapojj\nAge: 22", customer1.toString());
	}

}
