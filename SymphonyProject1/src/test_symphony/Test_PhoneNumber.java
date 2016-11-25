package test_symphony;

import symphony.PhoneNumber;
import junit.framework.*;
import junit.framework.Test;

/**
 * Unit test class.  Exercises all of the constructors and methods for the
 * class PhoneNumber.
 * 
 * @author Emma Jilesen
 * @version	1.0.0	November 2016
 */
public class Test_PhoneNumber extends TestCase {

	public Test_PhoneNumber(String name) { super(name); }

	public static Test suite() { return new TestSuite(Test_PhoneNumber.class); }

	protected void setUp() throws Exception { System.out.println("Test_PhoneNumber Begin"); }

	protected void tearDown() throws Exception { System.out.println("Test_PhoneNumber End"); }

	/**
	 * Test the Constructors: PhoneNumber() and PhoneNumber(String ph).
	 */
	public void testConstructors() {
System.out.print("\tExecuting Test_PhoneNumber.testConstructors");
		
		/* Testing Default Constructor */
		phoneNumber = new PhoneNumber();
		assertNotNull("\t\tTest_PhoneNumber.testConstructors: PhoneNumber is null", phoneNumber);
		
		/* Testing Overloaded Constructor */
		phoneNumber = new PhoneNumber("999-999-9999");
		assertEquals("999-999-9999", phoneNumber.getPhoneNum());
	}

	/**
	 * Test Accessors: getPhoneNumber(). Ensure that returned values equal
	 * those set in place.
	 */
	public void testAccessors(){
		System.out.println("\tExecuting Test_PhoneNumber.testAccessors");
		phoneNumber = new PhoneNumber();
		assertNotNull("\t\tTest_PhoneNumber.testAccessors: PhoneNumber is null", phoneNumber);

		/* Testing getPhoneNum() method */
		phoneNumber.setPhoneNum("613-990-5889");
		assertEquals("613-990-5889", phoneNumber.getPhoneNum());
	}

	/**
	 * Test Mutators: setPhoneNumber(String s). Ensures values set 
	 * equal value returned in getPhoneNumber().
	 */
	public void testMutators(){
		System.out.println("\tExecuting Test_PhoneNumber.testMutators");
		phoneNumber = new PhoneNumber();
		assertNotNull("\t\tTest_PhoneNumber.testMutators: PhoneNumber is null", phoneNumber);

		/* Testing setPhoneNum(s) method */
		phoneNumber.setPhoneNum("950-985-1516");
		assertNotNull("\t\tTest_PhoneNumber.testMutators: PhoneNumber.setPhoneNum",
				phoneNumber.getPhoneNum());
		assertEquals("950-985-1516", phoneNumber.getPhoneNum());
	}

	/**
	 * Test Behaviors: toString(). Ensures that the String returned is equal
	 * to what was set using setPhoneNumber().
	 */
	public void testBehaviors() {
		System.out.println("\tExecuting Test_PhoneNumber.testBehaviors");
		phoneNumber = new PhoneNumber();
		assertNotNull("\t\tTest_PhoneNumber.testBehaviors: PhoneNumber is null", phoneNumber);

		/* Testing toString() method */
		phoneNumber.setPhoneNum("123-456-7890");
		assertNotNull("\t\tTest_PhoneNumber.testBehaviors: PhoneNumber.toString", 
				phoneNumber.toString());
		assertEquals("PhoneNumber [phoneNum=123-456-7890]", phoneNumber.toString());
		
	}


	/* STAND-ALONE ENTRY POINT ------------------------------------------ */
	/**
	 * Main line for stand-alone operations.
	 * @param args	Standard String command line parameters
	 */
	public static void main(String[] args) {
		System.out.print("Executing Test_PhoneNumber suite");
		junit.textui.TestRunner.run(suite());
	}

	/* ATTRIBUTES ------------------------------------------------------- */
	PhoneNumber phoneNumber;

}
