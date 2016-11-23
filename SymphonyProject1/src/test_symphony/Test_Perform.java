package test_symphony;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.Address;
import symphony.Composition;
import symphony.Movement;
import symphony.Name;
import symphony.Perform;
import symphony.PhoneNumber;
import symphony.Soloist;

public class Test_Perform extends TestCase{
	public Test_Perform(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Test_Perform.class);
	}
	
	protected void setUp() throws Exception {
		System.out.println("Test_Perform Begin");
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_Perform End");
	}
	
	/**
	 * Test the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Perform.testConstructors");
		Soloist s = new Soloist();
		Composition c = new Composition();
		Perform p = new Perform(s,c);
		assertNotNull("\tTest_Perform.testConstructors: Perform is null", perform);

	}
	/**
	 * Test the accessors.
	 * 
	 * @throws ParseException
	 */
	public void testAccessors() throws ParseException {
		testMutators();
		System.out.println("\tExecuting Test_Perform.testAccessors");
		assertNotNull("\tTest_Perform.testAccessors: Perform is null", perform);
		System.out.println("\tExecuting Results: ...");
		System.out.println("\tCompositionID: "+perform.getCompositionid());
		System.out.println("\tComposition Movements: "+"\n\t"+perform.getCompositionMovements().toString());
		StringBuilder s = new StringBuilder();
		s.append("\tSoloist ID: "+perform.getSoloistid()+"\n")
		.append("\tSoloist Name: "+perform.getSoilistName()+"\n")
		.append("\tSoloist Address: "+perform.getSoloistAddress()+"\n")
		.append("\tSoloist PhoneNumber: "+perform.getSoloistPhone()+"\n")
		.append("\tSoloist Specialty: "+perform.getSoloistSpecialty()+"\n");
		System.out.println(s);
		
	}

	/**
	 * Test the mutators/modifiers.
	 * @throws ParseException 
	 */
	
	public void testMutators() throws ParseException {
		System.out.println("\tExecuting Test_Perform.testMutators");
		assertNotNull("\tTest_Perform.testMutators: Perform is null", perform);
		s.setId(1);
		Name name = new Name();
		name.setFirstName("Omar");
		name.setLastName("Baj");
		s.setName(name);
		PhoneNumber ph = new PhoneNumber();
		ph.setPhoneNum("613-999-9989");
		s.setPhoneNumber(ph);
		s.setSpecialty("anything");
		Address a = new Address();
		a.setCity("Ottawa");
		a.setCountry("Canada");
		a.setProvince("ON");
		a.setStreetName("nameOfStreet");
		a.setStreetNum("77");
		s.setAddress(a);
		c.setId(1);
		Movement movement1 = new Movement();
		Movement movement2 = new Movement();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
		Date d = new Date();
		d = sdf.parse("2016/11/22 10:22:25");
		movement1.setName("Mov1");
		movement1.setNumber(1);
		movement1.setDatePerformed(d);
		d = sdf.parse("2016/11/21 11:2:25");
		movement2.setName("Mov2");
		movement2.setNumber(2);
		movement2.setDatePerformed(d);
		ArrayList<Movement> aMov = new ArrayList<Movement>();
		aMov.add(movement1);
		aMov.add(movement2);
		c.setMovements(aMov);
		perform.setComposition(c);
		perform.setSoloist(s);
	}

	

	/**
	 * Test behaviors.
	 */
	public void testBehaviors() throws ParseException{
		System.out.println("\tExecuting Test_Perform.testBehaviors");
		assertNotNull("\tTest_Perform.testBehaviors: Perform is null", perform);
		s.setId(1);
		Name name = new Name();
		name.setFirstName("Omar");
		name.setLastName("Baj");
		s.setName(name);
		PhoneNumber ph = new PhoneNumber();
		ph.setPhoneNum("613-999-9989");
		s.setPhoneNumber(ph);
		s.setSpecialty("anything");
		Address a = new Address();
		a.setCity("Ottawa");
		a.setCountry("Canada");
		a.setProvince("ON");
		a.setStreetName("nameOfStreet");
		a.setStreetNum("77");
		s.setAddress(a);
		c.setId(1);
		Movement movement1 = new Movement();
		Movement movement2 = new Movement();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
		Date d = new Date();
		d = sdf.parse("2016/11/22 10:22:25");
		movement1.setName("Mov1");
		movement1.setNumber(1);
		movement1.setDatePerformed(d);
		d = sdf.parse("2016/11/21 11:2:25");
		movement2.setName("Mov2");
		movement2.setNumber(2);
		movement2.setDatePerformed(d);
		ArrayList<Movement> aMov = new ArrayList<Movement>();
		aMov.add(movement1);
		aMov.add(movement2);
		c.setMovements(aMov);
		perform.setComposition(c);
		perform.setSoloist(s);
		assertTrue(perform.getSoloistAddress() != null);
		assertTrue(perform.getSoloistSpecialty() == "anything");
		assertEquals(perform.getSoloistPhone() , "613-999-9989");
		assertFalse(perform.getComposition().getId() == 5);
	}

	/* STAND-ALONE ENTRY POINT ----------------------------------------- */
	/**
	 * Main line for stand-alone operation.
	 * 
	 * @param args
	 *            Standard string command line parameters.
	 */
	public static void  main(String[] args) {
		System.out.println("Executing Test_Perform suite");
		junit.textui.TestRunner.run(suite());
		
	}
	private Composition c = new Composition();
	private Soloist s = new Soloist();
	private Perform perform = new Perform();
}
