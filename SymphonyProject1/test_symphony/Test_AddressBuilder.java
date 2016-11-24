package test_symphony;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.AddressBuilder;

//Omar
public class Test_AddressBuilder extends TestCase{
	public Test_AddressBuilder(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Test_AddressBuilder.class);
	}
	
	protected void setUp() throws Exception {
		System.out.println("Test_AddressBuilder Begin");
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_AddressBuilder End");
	}
	/**
	 * Test the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_AddressBuilder.testConstructors");
		assertNotNull("\t\tTest_AddressBuilder.testConstructors: Test_AddressBuilder is null", AB);
		AddressBuilder ab = new AddressBuilder();
	}
	/**
	 * Test the accessors.
	 */
	public void testAccessors(){
		System.out.println("\tExecuting Test_AddressBuilder.testAccessors");
		testMutators();
		assertNotNull("\t\tTest_AddressBuilder.testAccessors: Test_AddressBuilder is null", AB);
		System.out.println(AB.toString());
	}
	/**
	 * Test the mutators/modifiers.
	 */
	public void testMutators(){
		System.out.println("\tExecuting Test_AddressBuilder.testMutators");
		assertNotNull("\t\tTest_AddressBuilder.testMutators: Test_AddressBuilder is null", AB);
		AB.city("Ottawa").country("Canada").province("Ontario").streetNum("44").streetName("Woodroffe").build();
		
	}
	/**
	 * Test behaviors.
	 */
	public void testBehaviors(){
		System.out.println("\tExecuting Test_AddressBuilder.testBehaviors");
		assertNotNull("\t\tTest_AddressBuilder.testBehaviors: Test_AddressBuilder is null", AB);
		AddressBuilder AB = new AddressBuilder();
		AB.city("Ottawa").country("Canada").province("Ontario").streetNum("44").streetName("Woodroffe").build();
		assertTrue(AB.getCity() == "Ottawa");
		assertTrue(AB.getCountry() == "Canada");
		assertTrue(AB.getStreetNum() == "44");
		assertEquals(AB.getStreetNum(),"44");
		
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
	
	
	private AddressBuilder AB = new AddressBuilder();
}
