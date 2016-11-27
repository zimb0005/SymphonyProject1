package test_symphony;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.Address;
import symphony.Conductor;
import symphony.Name;
import symphony.PhoneNumber;
/**
 * this class tests Conductor class from symphony package
 * @author Team 2
 *@version 1.0.0	November 2016
 */
public class Test_Conductor extends TestCase{
	
	public static Test suite(){ return new TestSuite(Test_Conductor.class);}
	
	protected void setUp() throws Exception{
		super.setUp();
		System.out.println("Test_Conductor Begin");
	}
	
	protected void tearDown() throws Exception{
		super.tearDown();
		System.out.println("Test_Conductor End");
		Conductor conductor = new Conductor();
		conductor = null;
		assertNull(conductor);
	}
	/**
	 * test constructors
	 */
	public void testConstructors(){
		System.out.println("\tExecuting Test_Conductor.testConstructors");
		Conductor conductor = new Conductor();
		assertNotNull(conductor);
	}
	/**
	 * test behaviors
	 */
	public void testBehaviors(){
		System.out.println("\tExecuting Test_Conductor.testBehaviors");
		Conductor conductor = new Conductor();
		assertEquals("Musician [name=null, address=null, phoneNumber=null]",conductor.toString());
	}
	
}
