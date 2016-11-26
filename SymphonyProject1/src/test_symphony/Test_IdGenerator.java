package test_symphony;

import junit.framework.*;
import symphony.IdGenerator;;

public class Test_IdGenerator extends TestCase {

	public Test_IdGenerator(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Test_IdGenerator.class);
	}

	public void setUp() throws Exception {
		System.out.println("Test_IdGenerator Begins");
		testIdGen = new IdGenerator();
	}

	public void tearDown() throws Exception {
		System.out.println("Test_IdGenerator Ends");
		testIdGen = null;
	}

	/**
	 * Test the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_IdGenerator.testConstructors");
		assertNotNull("\t\tTest_IdGenerator.testConstructors: Test_IdGenerator is null", testIdGen);

		System.out.println("\tNextId: " + testIdGen.getNextId() + "\n\tClass: " + testIdGen.getClass()
				+ "\n\tInstance: " + IdGenerator.getInstance() + "\n\tGenerated Id: " + IdGenerator.generateID());

	}

	/**
	 * Testing ACCESSORS.
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_IdGenerator.testAccessors");
		testIdGen = new IdGenerator();
		assertNotNull("\t\tTest_IdGenerator.testAccessors: IdGenerator is null", testIdGen);

		testIdGen.setNextId(5);
		assertTrue(testIdGen.getNextId() == 5);
		System.out.println("\tNextId = " + testIdGen.getNextId());

		testIdGen.setNextId(4);
		assertFalse(testIdGen.getNextId() == 2);
		System.out.println("\tNextId = " + testIdGen.getNextId());

		testIdGen.setNextId(3);
		assertNotNull(testIdGen.getNextId() != 0);
		System.out.println("\tNextId = " + testIdGen.getNextId());

		assertEquals(IdGenerator.class, testIdGen.getClass());
		System.out.println("\ttestIdGen is an instance of " + testIdGen.getClass());

	}

	/**
	 * Testing MUTATORS/MODIFIERS.
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_IdGenerator.testMutators");
		testIdGen = new IdGenerator();
		assertNotNull("\t\tTest_IdGenerator.testAccessors: IdGenerator is null", testIdGen);

		testIdGen.setNextId(5);
		assertTrue(testIdGen.getNextId() == 5);
		System.out.println("\tNextId = " + testIdGen.getNextId());

		testIdGen.setNextId(4);
		assertFalse(testIdGen.getNextId() == 2);
		System.out.println("\tNextId = " + testIdGen.getNextId());

		testIdGen.setNextId(3);
		assertNotNull(testIdGen.getNextId() != 0);
		System.out.println("\tNextId = " + testIdGen.getNextId());

		assertEquals(IdGenerator.class, testIdGen.getClass());
		System.out.println("\ttestIdGen is an instance of " + testIdGen.getClass());

	}

	/**
	 * Testing BEHAVIOURS.
	 */
	public void testBehaviors() {
		System.out.println("\tExecuting Test_IdGenerator.testBehaviors");
		testIdGen = new IdGenerator();
		assertNotNull("\t\tTest_IdGenerator.testAccessors: IdGenerator is null", testIdGen);

		int i = 1;
		assertTrue(i <= IdGenerator.generateID());
		System.out.println("\t" + i + " is less than " + IdGenerator.generateID());

		int j = 2;
		assertFalse(j == IdGenerator.generateID());
		System.out.println("\t" + j + " does not equals " + IdGenerator.generateID());

		assertEquals(IdGenerator.generateID(), IdGenerator.generateID() - 1);
		System.out.println("\t" + IdGenerator.generateID() + " equals " + (IdGenerator.generateID() - 1));

	}

	/* STAND-ALONE ENTRY POINT ----------------------------------------- */
	/**
	 * Main line for stand-alone operation.
	 * 
	 * @param args
	 *            Standard string command line parameters.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_IdGenerator suite");
		junit.textui.TestRunner.run(suite());
	}

	/* ATTRIBUTES ----------------------------------------------- */
	private IdGenerator testIdGen;
}
