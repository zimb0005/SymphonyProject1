package test_symphony;

import junit.framework.*;
import symphony.Concert;

//rob
public class Test_Concert extends TestCase{

	public Test_Concert(String name){
		super(name);
	}
	
	public static Test suite() {
		return new TestSuite(Test_Concert.class);
	}

	protected void setUp() throws Exception {
		System.out.println("Test_" + name + " Begin");
		concert = new Concert();
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_" + name + " End");
		concert = null;
	}
	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_" + name + ".testConstructors");
		assertNotNull("\t\tTest_" + name + ".testConstructors: " + name + " is null", concert);
	}
	/**
	 * Test the accessors.
	 */
	public void testAccessors() {
		testMutators();
		System.out.println("\tExecuting Test_" + name + ".testAccessors");
		assertNotNull("\t\tTest_" + name + ".testAccessors: " + name + " is null", concert);
		System.out.println("\t" + concert.toString());
	}

	/**
	 * Test the mutators/modifiers.
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_" + name + ".testMutators");
		assertNotNull("\t\tTest_" + name + ".testMutators: " + name + " is null", concert);
		
	}

	/**
	 * Test behaviors.
	 */
	public void testBehaviors() {
		System.out.println("\tExecuting Test_" + name + ".testBehaviors");
		assertNotNull("\t\tTest_" + name + ".testBehaviors: " + name + " is null", concert);
		assertTrue("\t\t" + name + ".toString: " + name + ".toString is blank", (concert.toString() != ""));
	}
	/* STAND-ALONE ENTRY POINT ----------------------------------------- */
	/**
	 * Main line for stand-alone operation.
	 * 
	 * @param args
	 *            Standard string command line parameters.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_Concert suite");
		junit.textui.TestRunner.run(suite());
	}

	/* ATTRIBUTES ----------------------------------------------- */
	private Concert concert = null;
	private static String name = "Concert";
}
