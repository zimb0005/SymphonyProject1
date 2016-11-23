package test_symphony;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import junit.framework.*;
import symphony.Id;

public class Test_Id extends TestCase{

	public Test_Id(String name) { super(name);	}

	public static Test suite() { return new TestSuite(Test_Id.class);		}
	@BeforeClass
	protected void setUp() throws Exception { 
		System.out.println("Test_Id Begin");
		id = new Id();
		
	}
	@AfterClass
	protected void tearDown() throws Exception { 
		System.out.println("Test_Id End");
		id = null;
	}

	/**
	 * Test the constructors.
	 */
	
	public void testConstructors() {
		System.out.println("\tExecuting idTest.testConstructors");
		assertNotNull("\t\tIdTest.testConstructors: Address is null", id);
		
	}

	/**
	 * Test the accessors.
	 */
	
	public void testAccessors() {
		System.out.println("\tExecuting idTest.testAccessors");
		assertEquals(id.getId(),1);
		
	}

	/**
	 * Test the mutators/modifiers.
	 */
	
	public void testMutators() {
		System.out.println("\tExecuting idTest.testMutators");
		id.setId(3);
		assertEquals(id.getId(),3);
	}

	/**
	 * Test behaviors.
	 */
	
	public void testBehaviors() {
		System.out.println("\tExecuting idTest.testBehaviors");
		assertEquals(id.toString(),"Id [id=3]");
	}
	/* ATTRIBUTES	-----------------------------------------------	*/
	private static Id id = null;

}	/*	End of CLASS:	Test_Address.java				*/