package test_symphony;

import symphony.Address;
import junit.framework.*;

public class Test_Address extends TestCase {

	public Test_Address(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Test_Address.class);
	}

	protected void setUp() throws Exception {
		System.out.println("Test_Address Begin");
		address = new Address();
		// :TODO*************
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_Address End");
		address = null;
	}

	/**
	 * Test the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Address.testConstructors");
		assertNotNull("\t\tTest_Address.testConstructors: Address is null", address);
		// :TODO***************
	}

	/**
	 * Test the accessors.
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_Address.testAccessors");
		// :TODO****************

	}

	/**
	 * Test the mutators/modifiers.
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_Address.testMutators");
		// :TODO********************
	}

	/**
	 * Test behaviors.
	 */
	public void testBehaviors() {
		System.out.println("\tExecuting Test_Address.testBehaviors");
		// :TODO*******************
	}

	/* STAND-ALONE ENTRY POINT ----------------------------------------- */
	/**
	 * Main line for stand-alone operation.
	 * 
	 * @param args
	 *            Standard string command line parameters.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_Address suite");
		junit.textui.TestRunner.run(suite());
	}

	/* ATTRIBUTES ----------------------------------------------- */
	private Address address = null;

} /* End of CLASS: Test_Address.java */
