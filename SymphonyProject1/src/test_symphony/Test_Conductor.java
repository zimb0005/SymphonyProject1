package test_symphony;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.Address;
import symphony.Conductor;
import symphony.Id;
import symphony.Name;
import symphony.PhoneNumber;

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
	
	public void testConstructors(){
		System.out.println("\tExecuting Test_Conductor.testConstructors");
		Conductor conductor = new Conductor();
		assertNotNull(conductor);
	}
	
	public void testBehaviours(){
		System.out.println("\tExecuting Test_Musician.testBehaviours");
		
		Name name = new Name("Alain", "Trudel");
		Address adr = new Address();
		adr.setStreetNum("400");
		adr.setStreetName("Albert St");
		adr.setCity("Ottawa");
		adr.setProvince("Ontario");
		adr.setCountry("Canada");
		PhoneNumber pn = new PhoneNumber("613-434-2345");
		Conductor cond = new Conductor();
		cond.setName(name);
		cond.setAddress(adr);
		cond.setPhoneNumber(pn);
		cond.setId(34);
		
		assertEquals("Musician [name=Name [firstName=Alain, lastName=Trudel], address=Address [streetNum=400, streetName=Albert St, city=Ottawa, province=Ontario, country=Canada], phoneNumber=PhoneNumber [phoneNum=613-434-2345], id=Id [id=34]]", cond.toString());
	}
	
}
