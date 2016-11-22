package test_symphony;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import symphony.Id;
import symphony.IdGenerator;

public class IdGeneratorTest extends TestSuite{

	@Override
	public void addTest(junit.framework.Test test) {
		// TODO Auto-generated method stub
		super.addTest(test);
	}

	@Override
	public void addTestSuite(Class<? extends TestCase> testClass) {
		// TODO Auto-generated method stub
		super.addTestSuite(testClass);
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
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
		assertEquals(id.toString(),"Id [id=1]");
	}
	/* ATTRIBUTES	-----------------------------------------------	*/
	private static IdGenerator id = null;

}	/*	End of CLASS:	Test_Address.java				*/