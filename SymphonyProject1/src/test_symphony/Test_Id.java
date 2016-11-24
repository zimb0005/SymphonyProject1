package test_symphony;

import org.junit.After;
import org.junit.Before;
import junit.framework.*;
import symphony.Id;
/**
 * JUnit 4 Test Case for the Id class in the symphony package.
 * @author Team 4
 *
 */
public class Test_Id {

	
	@Before
	public void setUp()  { 
		System.out.println("Test_Id Begin");
		id = new Id();
		
	}
	@After
	public void tearDown()  { 
		System.out.println("Test_Id End");
		id = null;
	}

	/**
	 * Test the constructors.
	 */
	@Test
	public void testConstructors() {
		System.out.println("\tExecuting idTest.testConstructors");
		assertNotNull("\t\tIdTest.testConstructors: Address is null", id);
		
	}

	/**
	 * Test the accessors.
	 */
	@Test
	public void testAccessors() {
		System.out.println("\tExecuting idTest.testAccessors");
		assertEquals(id.getId(),1);
		
	}

	/**
	 * Test the mutators/modifiers.
	 */
	@Test
	public void testMutators() {
		System.out.println("\tExecuting idTest.testMutators");
		id.setId(3);
		assertEquals(id.getId(),3);
	}

	/**
	 * Test behaviors.
	 */
	@Test
	public void testBehaviors() {
		System.out.println("\tExecuting idTest.testBehaviors");
		assertEquals(id.toString(),"Id [id=3]");
	}
	/* ATTRIBUTES	-----------------------------------------------	*/
	private static Id id = null;

}	/*	End of CLASS:	Test_Address.java				*/