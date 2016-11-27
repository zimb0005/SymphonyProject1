package test_symphony;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.Conductor;
/**
 * this class tests Conductor class from symphony package
 * @author Team 2
 *@version 1.0.0	November 2016
 */
public class Test_Conductor extends TestCase{
	
	public static Test suite(){ return new TestSuite(Test_Conductor.class);}
	
	protected void setUp() throws Exception{
		System.out.println("Test_Conductor Begin");
		conductor = new Conductor();
	}
	
	protected void tearDown() throws Exception{
		System.out.println("Test_Conductor End");
		conductor = null;

	}
	/**
	 * test constructors
	 */
	public void testConstructors(){
		System.out.println("\tExecuting Test_Conductor.testConstructors");
		assertNotNull(conductor);
	}
	/**
	 * test behaviors
	 */
	public void testBehaviors(){
		System.out.println("\tExecuting Test_Conductor.testBehaviors");	
		assertEquals("Musician [name=null, address=null, phoneNumber=null]",conductor.toString());
	}
	
	private Conductor conductor;
	
}
