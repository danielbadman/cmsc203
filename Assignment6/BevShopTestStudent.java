import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BevShopTestStudent {
	BevShop shop1;
	@BeforeEach
	void setUp() throws Exception {
		shop1 = new BevShop();
	}
	
	@AfterEach
	void tearDown() throws Exception {
	shop1 = null;
	}

	@Test
	void testIsValidTime() {
		assertTrue(shop1.isValidTime(12));
		assertFalse(shop1.isValidTime(3));
	}
	
	@Test
	void testGetMaxNumOfFruits() {
		assertEquals(5, shop1.getMaxNumOfFruits());
	}

	@Test
	void testGetMinAgeForAlcohol() {
		assertEquals(21, shop1.getMinAgeForAlcohol());
	}
	
	@Test
	void testGetMaxOrderForAlcohol() {
		assertEquals(3, shop1.getMaxOrderForAlcohol());
	}
	
	@Test
	void testIsMaxFruit() {
		assertFalse(shop1.isMaxFruit(4));
		assertTrue(shop1.isMaxFruit(5));
		assertTrue(shop1.isMaxFruit(7));
	}
	
	@Test
	void testIsEligibleForMore() {
		shop1.startNewOrder(12, Day.MONDAY, "Shionnah", 18);
		shop1.processAlcoholOrder("Rum", Size.MEDIUM);
		shop1.processAlcoholOrder("Sop", Size.LARGE);
		shop1.processAlcoholOrder("Coors", Size.SMALL);
		
		assertFalse(shop1.isEligibleForMore());
		
		shop1.startNewOrder(14, Day.SATURDAY, "Gavin", 24);
		shop1.processAlcoholOrder("Rum", Size.MEDIUM);
		shop1.processAlcoholOrder("Sop", Size.LARGE);
		
		assertTrue(shop1.isEligibleForMore());
	}
	
	@Test
	void testGetNumOfAlcoholDrink() {
		shop1.startNewOrder(12, Day.MONDAY, "Shionnah", 18);
		shop1.processAlcoholOrder("Rum", Size.MEDIUM);
		shop1.processAlcoholOrder("Sop", Size.LARGE);
		shop1.processAlcoholOrder("Coors", Size.SMALL);
		
		assertEquals(3, shop1.getNumOfAlcoholDrink());
	}
	
	@Test
	void testIsValidAge() {
		assertTrue(shop1.isValidAge(27));
		assertFalse(shop1.isValidAge(11));
	}
	
	@Test
	void testTotalOrderPrice() {
		shop1.startNewOrder(12, Day.MONDAY, "Shionnah", 18);
		shop1.processAlcoholOrder("Rum", Size.MEDIUM);
		shop1.processAlcoholOrder("Sop", Size.LARGE);
		shop1.processAlcoholOrder("Coors", Size.SMALL);
		
		assertEquals(9, shop1.totalOrderPrice(shop1.getCurrentOrder().getOrderNo()));
	}
	
	@Test
	void testTotalMonthlySale() {
		shop1.startNewOrder(12, Day.MONDAY, "Shionnah", 18);
		shop1.processAlcoholOrder("Rum", Size.MEDIUM);
		shop1.processAlcoholOrder("Sop", Size.LARGE);
		shop1.processAlcoholOrder("Coors", Size.SMALL);
		
		shop1.startNewOrder(14, Day.SATURDAY, "Gavin", 24);
		shop1.processAlcoholOrder("Heineken", Size.MEDIUM);
		shop1.processAlcoholOrder("Slurp Juice", Size.LARGE);
		
		assertEquals(17.2, shop1.totalMonthlySale());
	}
	
	@Test
	void testTotalNumOfMonthlyOrders() {
		shop1.startNewOrder(12, Day.MONDAY, "Shionnah", 18);
		shop1.startNewOrder(14, Day.SATURDAY, "Gavin", 24);
		shop1.startNewOrder(19, Day.THURSDAY, "Miguel", 66);
		
		assertEquals(3, shop1.totalNumOfMonthlyOrders());
	}
	
	@Test
	void testGetCurrentOrder() {
		shop1.startNewOrder(12, Day.MONDAY, "Shionnah", 18);
		shop1.startNewOrder(14, Day.SATURDAY, "Gavin", 24);
		shop1.startNewOrder(19, Day.THURSDAY, "Miguel", 66);
		
		assertEquals(shop1.orders.get(2).getOrderNo(), shop1.getCurrentOrder().getOrderNo());
	}
	
	@Test
	void testGetOrderAtIndex() {
		shop1.startNewOrder(12, Day.MONDAY, "Shionnah", 18);
		shop1.startNewOrder(14, Day.SATURDAY, "Gavin", 24);
		shop1.startNewOrder(19, Day.THURSDAY, "Miguel", 66);
		
		assertEquals(shop1.orders.get(1).toString(), shop1.getOrderAtIndex(1).toString());
	}
	
	@Test
	void testSortOrders() {
		shop1.startNewOrder(12, Day.MONDAY, "Shionnah", 18);
		shop1.startNewOrder(19, Day.THURSDAY, "Miguel", 66);
		shop1.startNewOrder(14, Day.SATURDAY, "Gavin", 24);
		shop1.startNewOrder(19, Day.SUNDAY, "Blake", 12);
		
		shop1.sortOrders();
		
		assertEquals(-1, shop1.getOrderAtIndex(0).compareTo(shop1.getOrderAtIndex(1)));
		assertEquals(-1, shop1.getOrderAtIndex(1).compareTo(shop1.getOrderAtIndex(2)));
		assertEquals(-1, shop1.getOrderAtIndex(2).compareTo(shop1.getOrderAtIndex(3)));
	}
}
