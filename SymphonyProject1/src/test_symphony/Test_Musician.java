package test_symphony;

import symphony.Address;
import symphony.Id;
import symphony.Musician;
import symphony.Name;
import symphony.PhoneNumber;
import junit.framework.*;

public class Test_Musician extends TestCase{
	public Test_Musician(String name){super(name);}	
	
	public static Test suite(){ return new TestSuite(Test_Musician.class);}
	
	protected void setUp() throws Exception{
		super.setUp();
		System.out.println("Test_Musician begins");
	}
	protected void tearDown() throws Exception{
		super.tearDown();
		System.out.println("Test_Musician ends");
		Musician musician = null;
		assertNull(musician);
	}
	public void testConstructors(){
		System.out.println("\tExecuting Test_Musician.testConstructors");
		Musician musician = new Musician();
		assertNotNull(musician);
	}
	
	public void testAccessors(){
		System.out.println("\tExecuting Test_Musician.testAccessors");
		Name name = new Name("Saran", "Vadlamudi");
		PhoneNumber phoneNumber = new PhoneNumber("613-255-5310");
		assertEquals(name.getFirstName(), "Saran");
		assertEquals(name.getLastName(), "Vadlamudi");
		assertEquals(phoneNumber.getPhoneNum(), "613-255-5310");
	}
	
	public void testMutators(){
		System.out.println("\tExecuting Test_Musician.testMutators");
	    Name name = new Name("Saran", "Vadlamudi");
		PhoneNumber phoneNumber = new PhoneNumber("613-255-5310");
		phoneNumber.setPhoneNum("613-231-7802");
		name.setFirstName("Alain");
		name.setLastName("Trudel");
		assertEquals("Alain", name.getFirstName());
		assertEquals("Trudel", name.getLastName());
		assertEquals("613-231-7802", phoneNumber.getPhoneNum());
	}
	
	public void testBehaviours() {
        System.out.println("\tExecuting Test_Musician.testBehaviours");
         Address address = new Address();
		 address.setCity("Ottawa");
		 address.setCountry("Canada");
		 address.setProvince("Ontario");
		 address.setStreetName("Gracewood");
		 address.setStreetNum("323");
		 Name name = new Name("Saran", "Vadlamudi");
		 
		 PhoneNumber phoneNumber = new PhoneNumber();
		 phoneNumber.setPhoneNum("613-255-5310");
		 Musician musician = new Musician();
		 musician.setName(name);
		 musician.setAddress(address);
		 musician.setPhoneNumber(phoneNumber);
		 musician.setId(1);
		 assertEquals("Musician [name=Name [firstName=Saran, lastName=Vadlamudi], address=Address [streetNum=323, streetName=Gracewood, city=Ottawa, province=Ontario, country=Canada], phoneNumber=PhoneNumber [phoneNum=613-255-5310], id=Id [id=1]]", musician.toString());
    }

}
