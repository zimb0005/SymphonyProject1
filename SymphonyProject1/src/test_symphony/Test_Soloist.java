package test_symphony;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.Soloist;
/**
 * this class tests the Soloist class in the Symphony package
 * @author team 2
 * @version	1.0.0	November 2016
 */
public class Test_Soloist extends TestCase{
	
	public static Test suite(){ return new TestSuite(Test_Soloist.class);}
	
	protected void setUp() throws Exception{
		System.out.println("Test_Soloist Begin");
		soloist = new Soloist();
		soloist2 = new Soloist("Cello");
	}
	
	protected void tearDown() throws Exception{
		System.out.print("Test_Soloist End");
		soloist = null;
		soloist2 = null;
	}
	/**
	 * Test Constructors
	 */
	public void testConstructors(){
		System.out.println("\tExecuting Test_Soloist.testConstructors");
		assertNotNull(soloist);
	}
	/**
	 * Test Accessors
	 */
	public void testAccessors(){
		System.out.println("\tExecuting Test_Soloist.testAccessors");
		assertEquals(soloist2.getSpecialty(), "Cello");
	}
	/**
	 * Test Mutators
	 */
	public void testMutators(){
		System.out.println("\tExecuting Test_Soloist.testMutators");
		soloist.setSpecialty("Violin");
		assertEquals(soloist.getSpecialty(), "Violin");
	}
	/**
	 * Test Behaviors
	 */
	public void testBehaviours(){
		System.out.println("\tExecuting Test_Soloist.testBehaviours");
		Soloist soloist = new Soloist("Violin");
		assertTrue(soloist.toString().contains("Soloist [specialty=Violin]"));
	}
	
	private Soloist soloist;
	private Soloist soloist2;
}
 