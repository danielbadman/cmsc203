import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OrderTestStudent {
	Order orderOne, orderTwo, orderThree;
	@BeforeEach
	public void setUp() throws Exception {
		orderOne = new Order(8, Day.TUESDAY, new Customer("Arhum", 17));
		orderTwo = new Order(12, Day.SATURDAY, new Customer("Blake", 13));
		orderThree = new Order(10, Day.THURSDAY, new Customer("Gavin", 88));
	}

	@AfterEach
	public void tearDown() throws Exception {
		orderOne = orderTwo = orderThree = null;
	}

	@Test
	public void testGetOrderTime() {
		assertEquals(8, orderOne.getOrderTime());
	}
	
	@Test
	public void testGetOrderDay() {
		assertEquals(Day.SATURDAY, orderTwo.getOrderDay());
	}
	
	@Test
	public void testGetCustomer() {
		assertEquals("Name: Arhum\nAge: 17", orderOne.getCustomer().toString());
	}
	
	@Test
	public void testGetBeverage() {
		Coffee cf = new Coffee("Espresso", Size.SMALL, true, false);
		Alcohol al = new Alcohol("Fireball", Size.LARGE, false);
		Smoothie sm1 = new Smoothie("Chocolate Berry", Size.MEDIUM, 2, false);
		Smoothie sm2 = new Smoothie("Chocolate Berry", Size.LARGE, 2, false);

		orderOne.addNewBeverage("Espresso", Size.SMALL, true, false);
		orderOne.addNewBeverage("Fireball", Size.LARGE);
		orderOne.addNewBeverage("Chocolate Berry", Size.MEDIUM, 2, false);
		assertTrue(orderOne.getBeverage(0).equals(cf));
		assertTrue(orderOne.getBeverage(1).equals(al));
		assertTrue(orderOne.getBeverage(2).equals(sm1));
		assertFalse(orderOne.getBeverage(2).equals(sm2));
	}

	@Test
	public void testAddNewBeverage() throws NullPointerException {

		assertTrue(orderOne.getTotalItems() == 0);
		orderOne.addNewBeverage("Espresso", Size.SMALL, true, false);
		assertTrue(orderOne.getBeverage(0).getBevType().equals(Type.COFFEE));
		orderOne.addNewBeverage("Fireball", Size.LARGE);
		assertTrue(orderOne.getBeverage(1).getBevType().equals(Type.ALCOHOL));
		orderOne.addNewBeverage("Chocolate Berry", Size.MEDIUM, 2, false);
		assertTrue(orderOne.getBeverage(2).getBevType().equals(Type.SMOOTHIE));
		assertTrue(orderOne.getTotalItems() == 3);

		orderTwo.addNewBeverage("Chocolate Berry", Size.LARGE, 4, true);
		assertTrue(orderTwo.getBeverage(0).getBevType().equals(Type.SMOOTHIE));
		orderTwo.addNewBeverage("Fireball", Size.SMALL);
		assertTrue(orderTwo.getBeverage(1).getBevType().equals(Type.ALCOHOL));
		orderTwo.addNewBeverage("Espresso", Size.MEDIUM, false, true);
		assertTrue(orderTwo.getBeverage(2).getBevType().equals(Type.COFFEE));
		assertTrue(orderTwo.getTotalItems() == 3);

	}

	@Test
	public void testCalcOrderTotal() {
		orderOne.addNewBeverage("Espresso", Size.SMALL, true, false); //2.50
		orderOne.addNewBeverage("Fireball", Size.LARGE); //4
		orderOne.addNewBeverage("Chocolate Berry", Size.MEDIUM, 2, false); //4

		assertEquals(10.5, orderOne.calcOrderTotal(), .01);

		orderTwo.addNewBeverage("Chocolate Berry", Size.LARGE, 4, true); //7.50
		orderTwo.addNewBeverage("Fireball", Size.SMALL); //2.60
		orderTwo.addNewBeverage("Espresso", Size.MEDIUM, false, true); //3.50

		assertEquals(13.6, orderTwo.calcOrderTotal(), .01);

	}
	
	@Test
	public void testFindNumOfBeveType() {
		orderTwo.addNewBeverage("Chocolate Berry", Size.LARGE, 4, true);
		orderTwo.addNewBeverage("Fireball", Size.SMALL);
		orderTwo.addNewBeverage("Espresso", Size.MEDIUM, false, true); 
		orderTwo.addNewBeverage("Kiwi Mango", Size.SMALL, 2, false);
		orderTwo.addNewBeverage("Gold Skies", Size.SMALL, 3, false);
		orderTwo.addNewBeverage("Coors", Size.MEDIUM);
		
		assertEquals(1, orderTwo.findNumOfBeveType(Type.COFFEE));
		assertEquals(2, orderTwo.findNumOfBeveType(Type.ALCOHOL));
		assertEquals(3, orderTwo.findNumOfBeveType(Type.SMOOTHIE));
	}
	
	
}
