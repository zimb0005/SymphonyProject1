package test_symphony;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.Address;
import symphony.AddressBuilder;

/**
 * tests the AddressBuilder class in the symphony package
 * @author Team 2
 *@version 1.0.0	November 2016
 */
public class Test_AddressBuilder extends TestCase{
	public Test_AddressBuilder(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Test_AddressBuilder.class);
	}
	
	protected void setUp() throws Exception {
		System.out.println("Test_AddressBuilder Begin");
		addressBuilder = new AddressBuilder();
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_AddressBuilder End");
		addressBuilder = null;
	}
	/**
	 * Test the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_AddressBuilder.testConstructors");
		assertNotNull("\t\tTest_AddressBuilder.testConstructors: Test_AddressBuilder is null", addressBuilder);
	}
	/**
	 * Test the accessors.
	 */
	public void testAccessors(){
		System.out.println("\tExecuting Test_AddressBuilder.testAccessors");
		addressBuilder.setStreetNum("123");
		addressBuilder.setCity("Ottawa");
		addressBuilder.setCountry("Canada");
		addressBuilder.setProvince("Ontario");
		addressBuilder.setStreetName("Macy Blvd");
		assertEquals("123",addressBuilder.getStreetNum());
		assertEquals("Ottawa",addressBuilder.getCity());
		assertEquals("Canada",addressBuilder.getCountry());
		assertEquals("Ontario",addressBuilder.getProvince());
		assertEquals("Macy Blvd",addressBuilder.getStreetName());
	}
	/**
	 * Test the mutators/modifiers.
	 */
	public void testMutators(){
		System.out.println("\tExecuting Test_AddressBuilder.testMutators");
		addressBuilder.setStreetNum("123");
		addressBuilder.setCity("Ottawa");
		addressBuilder.setCountry("Canada");
		addressBuilder.setProvince("Ontario");
		addressBuilder.setStreetName("Macy Blvd");
		assertEquals("123",addressBuilder.getStreetNum());
		assertEquals("Ottawa",addressBuilder.getCity());
		assertEquals("Canada",addressBuilder.getCountry());
		assertEquals("Ontario",addressBuilder.getProvince());
		assertEquals("Macy Blvd",addressBuilder.getStreetName());
		
	}
	/**
	 * Test behaviors.
	 */
	public void testBehaviors(){
		System.out.println("\tExecuting Test_AddressBuilder.testBehaviors");
		addressBuilder.city("Ottawa").country("Canada").province("Ontario").streetNum("44").streetName("Woodroffe").build();
		assertTrue(addressBuilder.getCity() == "Ottawa");
		assertTrue(addressBuilder.getCountry() == "Canada");
		assertTrue(addressBuilder.getStreetNum() == "44");
		assertEquals(addressBuilder.getStreetNum(),"44");
		address = addressBuilder.build();
		assertNotNull(address);
		assertEquals("AddressBuilder [streetNum=44, streetName=Woodroffe, city=Ottawa, province=Ontario, country=Canada]",addressBuilder.toString());
		
	}
	/* STAND-ALONE ENTRY POINT ----------------------------------------- */
	/**
	 * Main line for stand-alone operation.
	 * 
	 * @param args
	 *            Standard string command line parameters.
	 */
	public static void  main(String[] args) {
		System.out.println("Executing Test_AddressBuilder suite");
		junit.textui.TestRunner.run(suite());
		
	}
	
	
	private AddressBuilder addressBuilder;
	private Address address;
	
}
