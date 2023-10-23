
/**
 * This class represents GFA test cases for a ManagementCompany object.
 * 
 * @author Farnaz Eivazi
 * @version 7/12/2022
 * 
 */
import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManagementCompanyGFATest {
	Property sampleProperty;
	Property sampleProperty2;
	Property sampleProperty3;
	Property sampleProperty4;
	Property sampleProperty5;
	ManagementCompany managementCo;
	
	@Before
	public void setUp() throws Exception {
		managementCo= new ManagementCompany("Railey", "555555555",6);
	}

	@After
	public void tearDown() throws Exception {
		managementCo=null;
	}

	@Test
	public void testGetName() {
		assertEquals("Railey", managementCo.getName());
	}
	
	@Test
	public void testGetTaxID() {
		assertEquals("555555555", managementCo.getTaxID());
	}
	
	@Test
	public void testGetManagementFeePercentage() {
		assertEquals(6, managementCo.getManagementFeePercentage());
	}
	
	@Test
	public void testGetPlot() {
		assertEquals(0, managementCo.getPlot().getX());
		assertEquals(0, managementCo.getPlot().getY());
		assertEquals(10, managementCo.getPlot().getWidth());
		assertEquals(10, managementCo.getPlot().getDepth());
	}
	
	@Test
	public void testAddProperty() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);		 
		assertEquals(managementCo.addProperty(sampleProperty),0,0);	//property has been successfully added to index 0
	}
	
	@Test
	public void testGetPropertiesCount() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);		 
		assertEquals(managementCo.addProperty(sampleProperty),0,0);	
		assertEquals(managementCo.getPropertiesCount(), 1);
	}
	
	@Test
	public void testGetTotalRent() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);
		sampleProperty2 = new Property ("Hunna Hunna Hunnas", "Germantown", 111, "Izaya Tiji", 8, 1, 1, 1);
		assertEquals(managementCo.addProperty(sampleProperty),0,0);
		assertEquals(managementCo.addProperty(sampleProperty2), 1);
		assertEquals(managementCo.getTotalRent(), 2724);
	}
	
	@Test
	public void testGetHighestRentProperty() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);
		sampleProperty2 = new Property ("Hunna Hunna Hunnas", "Germantown", 111, "Izaya Tiji", 8, 1, 1, 1);
		assertEquals(managementCo.addProperty(sampleProperty),0,0);
		assertEquals(managementCo.addProperty(sampleProperty2), 1);
		assertEquals(managementCo.getHighestRentPropperty(), sampleProperty);
	}
	
	@Test
	public void testRemoveLastProperty() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);
		sampleProperty2 = new Property ("Hunna Hunna Hunnas", "Germantown", 111, "Izaya Tiji", 8, 1, 1, 1);
		assertEquals(managementCo.addProperty(sampleProperty),0,0);
		assertEquals(managementCo.addProperty(sampleProperty2), 1);
		managementCo.removeLastProperty();
		assertEquals(managementCo.getNumberOfProperties(), 1);
	}
	
	@Test
	public void testIsPropertiesFull() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613, "BillyBob Wilson",2,5,2,2);
		sampleProperty2 = new Property ("Hunna Hunna Hunnas", "Germantown", 111, "Izaya Tiji", 8, 1, 1, 1);
		sampleProperty3 = new Property ("Tell Me", "Gaithersburg", 1414, "Lil Shine", 0, 0, 1, 1);
		sampleProperty4 = new Property ("##RR", "Golend Coral", 7007, "Daroo Baby", 1, 9, 1, 1);
		sampleProperty5 = new Property ("X&Whattttt", "Rockville", 209, "OsamaSon", 0, 1, 1, 1);
		
		
		assertEquals(managementCo.addProperty(sampleProperty),0,0);
		assertEquals(managementCo.addProperty(sampleProperty2), 1);
		assertEquals(managementCo.addProperty(sampleProperty3), 2);
		assertEquals(managementCo.addProperty(sampleProperty4), 3);
		assertEquals(managementCo.addProperty(sampleProperty5), 4);
		assertTrue(managementCo.isPropertiesFull());
	}
	
	@Test
	public void testIsManagementFeeValid() {
		assertTrue(managementCo.isManagementFeeValid());
	}

	@Test
	public void testToString() {
		sampleProperty = new Property ("Sunsational", "Beckman", 2613.0, "BillyBob Wilson",2,5,2,2);
		assertEquals(managementCo.addProperty(sampleProperty), 0);	//property has been successfully added to index 0
		String expectedString = "List of the properties for Railey, taxID: 555555555\n"
				+ "______________________________________________________\n"
				+ "Sunsational,Beckman,BillyBob Wilson,2613.0\n"
				+ "______________________________________________________\n"
				+"\n"
				+ "total management Fee: 156.78";
		System.out.println(expectedString);
		System.out.println(managementCo.toString());
		assertEquals(expectedString, managementCo.toString());
				
	}

}
