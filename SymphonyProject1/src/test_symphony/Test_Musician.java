package test_symphony;

import symphony.Address;
import symphony.Musician;
import symphony.Name;
import symphony.PhoneNumber;
import junit.framework.*;
/**
 * this class tests Musican class in symphony package
 * @author team 2
 * @version 1.0.0	November 2016
 *
 */
public class Test_Musician extends TestCase{
	public Test_Musician(String name){super(name);}	
	
	public static Test suite(){ return new TestSuite(Test_Musician.class);}
	
	protected void setUp() throws Exception{
		System.out.println("Test_Musician begins");
		musician = new Musician();
	}
	protected void tearDown() throws Exception{
		System.out.println("Test_Musician ends");
		musician = null;
	}
	/**
	 * Test Constructors
	 */
	public void testConstructors(){
		System.out.println("\tExecuting Test_Musician.testConstructors");
		assertNotNull(musician);
	}
	/**
	 * Test Accessors
	 */
	public void testAccessors(){
		System.out.println("\tExecuting Test_Musician.testAccessors");
		musician.setAddress(address);
		musician.setName(name);
		musician.setPhoneNumber(phoneNumber);
		assertEquals(musician.getAddress(), address);
		assertEquals(musician.getName(), name);
		assertEquals(musician.getPhoneNumber(), phoneNumber);
	}
	/**
	 * Test Modifiers
	 */
	public void testMutators(){
		System.out.println("\tExecuting Test_Musician.testMutators");
		musician.setAddress(address);
		musician.setName(name);
		musician.setPhoneNumber(phoneNumber);
		assertEquals(musician.getAddress(), address);
		assertEquals(musician.getName(), name);
		assertEquals(musician.getPhoneNumber(), phoneNumber);
	}
	/**
	 * test Behaviors
	 */
	public void testBehaviours() {
        System.out.println("\tExecuting Test_Musician.testBehaviours");
		assertEquals("Musician [name=null, address=null, phoneNumber=null]", musician.toString());
    }

	private Musician musician;
	private Name name = new Name();
	private PhoneNumber phoneNumber = new PhoneNumber();
	private Address address = new Address();
}
