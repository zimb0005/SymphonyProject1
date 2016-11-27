package test_symphony;

import symphony.Id;
import junit.framework.*;

/**
 * Unit test class: exercise all of the constructors and methods
 * for the class Id.
 * @author Team 2
 * @version 1.0.0	November 2016
 */
public class Test_Id extends TestCase {
	
	public Test_Id(String name){ super(name); }
	
	public static Test suite(){ return new TestSuite(Test_Id.class); }
	
	public void setUp() throws Exception { System.out.println("Test_Id Begin"); }
	
	public void tearDown() throws Exception { System.out.println("Test_Id End"); }
	
	/**
	 * Test Constructors: Id().
	 */
	public void testConstructors(){
		System.out.println("\tExecuting Test_Id.testConstructors");
		
		/* Testing default constructors */
		id = new Id();
		assertNotNull("\t\tTest_Id.testConstrutors: Id is null", id);
		
	}
	
	/**
	 * Test Accessors: getId(). Ensure that returned values equal
	 * those set in place.
	 */
	public void testAccessors(){
		System.out.println("\tExecuting Test_Id.testAccessors");
		id = new Id();
		assertNotNull("\t\tTest_Id.testAccessors: Id is null", id);
		
		/* Testing getId() method */
		id.setId(1234);
		assertEquals(1234, id.getId());
	}
	
	/**
	 * Test Mutators: setId().  Ensures values set 
	 * equal value returned in getId().
	 */
	public void testMutators(){
		System.out.println("\tExecuting Test_Id.testMutators");
		id = new Id();
		assertNotNull("\t\tTest_Id.testMutators: Id is null", id);
		
		/* Testing setId(int) method */
		id.setId(1212);
		assertNotNull("\t\tTest_Id.testMutators: Id is null", id);
	}
	
	/**
	 * Test Behaviors: generateId(), toString().
	 * Ensure value returned is not null.
	 */
	public void testBehaviors(){
		System.out.println("\tExecuting Test_Id.testMutators");
		id = new Id();
		assertNotNull("\t\tTest_Id.testMutators: Id is null", id);
		
		/* Testing generateId() method */
		/* NOT TESTED directly cause the method is private; 
		 * tested through instantiating default constructor and
		 * getId() method to test */
		assertNotNull("\t\tTest_Id.testBehaviors.generateId", id.getId());
		
		/* Testing toString() method */
		assertNotNull("\t\tTest_Id.testBehaviors.toString", id.toString());
		
	}
	
	/* STAND-ALONE ENTRY POINT ------------------------------------------ */
	/**
	 * Main line for stand-alone operation.
	 * @param args	Standard String command line parameters
	 */
	public static void main(String[] args) {
		System.out.print("Executing Test_Id suite");
		junit.textui.TestRunner.run(suite());
	}
	
	/* ATTRIBUTES ------------------------------------------------------- */
	private Id id = null;
	
} // end class Test_Id
