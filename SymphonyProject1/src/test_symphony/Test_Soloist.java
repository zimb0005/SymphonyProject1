package test_symphony;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.Soloist;

public class Test_Soloist extends TestCase{
	
	public static Test suite(){ return new TestSuite(Test_Soloist.class);}
	
	protected void setUp() throws Exception{
		super.setUp();
		System.out.println("Test_Soloist Begin");
	}
	
	protected void tearDown() throws Exception{
		super.tearDown();
		System.out.print("Test_Soloist End");
	}
	
	public void testConstructors(){
		System.out.println("\tExecuting Test_Soloist.testConstructors");
		soloist = new Soloist();
		assertNotNull(soloist);
	}
	
	public void testAccessors(){
		System.out.println("\tExecuting Test_Soloist.testAccessors");
		soloist = new Soloist("Cello");
		
		assertEquals(soloist.getSpecialty(), "Cello");
	}
	
	public void testMutators(){
		System.out.println("\tExecuting Test_Soloist.testMutators");
		soloist = new Soloist("Cello");
		soloist.setSpecialty("Violin");
		assertEquals(soloist.getSpecialty(), "Violin");
	}
	
	public void testBehaviours(){
		System.out.println("\tExecuting Test_Soloist.testBehaviours");
		Soloist soloist = new Soloist("Violin");
		assertTrue(soloist.toString().contains("Soloist [specialty=Violin]"));
	}
	
	private Soloist soloist;
}
 