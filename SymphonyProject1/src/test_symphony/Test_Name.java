package test_symphony;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.framework.Test;
import symphony.Name;

import org.junit.After;
import org.junit.Before;

/**
 * Unit test class. Exercise all of the constructors and methods for
 * the class Name.
 * @author Team 2
 * @version	1.0.0	November 2016
 */
public class Test_Name extends TestCase {

	public Test_Name(String name){ super(name); }
	
	public static Test suite() { 
		return new TestSuite(Test_Name.class); }

	@Before
	public void setUp() throws Exception { System.out.println("Test_Name Begin");}

	@After
	public void tearDown() throws Exception { System.out.println("Test_Name End");}

	/**
	 * Test the Constructors: Name() and Name(String fname, String lname).
	 */
	public void testConstructors() {
		System.out.print("\tExecuting Test_Name.testConstructors");
				
		/* Testing default constructor: Name() */
		name = new Name();
		assertNotNull("\t\tTest_Name.testConstructors: Name is null", name);
		
		/* Testing overloaded constructor: Name(String fname, String lname) */
		name = new Name("Emma", "Jilesen");
		assertNotNull("\t\tTest_Name.testConstructors: FirstName: ", name.getFirstName());
		assertNotNull("\t\tTest_Name.testConstructors: LastName : ", name.getLastName());
	}
	
	/**
	 * Test Accessors: getFirstName(), getLastName(). Ensure that returned values equal
	 * those set in place.
	 */
	public void testAccessors(){
		System.out.print("\tExecuting Test_Name.testAccessors");
		name = new Name();
		assertNotNull("\t\tTest_Name.testAccessors: Name is null");
		
		/* Testing getFirstName() method */
		name.setFirstName("Emma");
		assertEquals("Emma", name.getFirstName());
		
		/* Testing getLastName() method */
		name.setLastName("Jile");
		assertEquals("Jile", name.getLastName());
	}

	/**
	 * Test Mutators: setFirstName(first), setLastName(last).  
	 * Ensures values set equal value returned in getFirstName() 
	 * and getLastName().
	 */
	public void testMutators(){
		System.out.println("\tExecuting Test_Name.testMutators");
		name = new Name();
		assertNotNull("\t\tTest_Name.testMutators: Name is null", name);
		
		/* Testing setFirstName(f) method */
		name.setFirstName("People");
		assertEquals("People", name.getFirstName());
		
		/* Testing setLastName(l) method */
		name.setLastName("Names");
		assertEquals("Names", name.getLastName());
		
	}
	
	/**
	 * Test Behaviors: toString().  Ensures that method is not null.
	 */
	public void testBehaviors(){
		System.out.println("\tExecuting Test_Name.testBehaviors");
		name = new Name("Angelina", "Jolie");
		assertNotNull("\t\tTest_Name.testBehaviors: Name is null", name);
		
		/* Testing toString() method */
		assertNotNull("\t\tTest_Name.testBehaviors.toString", name.toString());
	}
	
	/* STAND-ALONE ENTRY POINT ------------------------------------------ */
	/**
	 * Main line for stand-alone operation.
	 * @param args	Standard String command line parameters
	 */
	public static void main(String[] args) {
		System.out.print("Executing Test_Name suite");
		junit.textui.TestRunner.run(suite());
	}
	
	/* ATTRIBUTES ------------------------------------------------------- */
	private Name name = null;
}
