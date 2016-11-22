package test_symphony;

import static org.junit.Assert.* ;

import java.util.Enumeration;

import junit.framework.TestCase;
import junit.framework.TestResult;
import junit.framework.TestSuite;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import symphony.Id;

public class IdTest extends TestSuite{

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
	public static void setUp() throws Exception { 
		System.out.println("idTest Begin");	
		id = new Id();
	
	}
	@AfterClass
	public static void tearDown() throws Exception { 
		System.out.println("idTest End");
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
		assertEquals(id.toString(),"Id [id=1]");
	}
	/* ATTRIBUTES	-----------------------------------------------	*/
	private static Id id = null;

}	/*	End of CLASS:	Test_Address.java				*/