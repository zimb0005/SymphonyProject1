package test_symphony;

import java.util.ArrayList;
import java.util.Date;

import junit.framework.*;
import symphony.PerformedConcert;
import symphony.Ticket;
import symphony.Venue;

//robert
public class Test_PerformedConcert extends TestCase{

	public Test_PerformedConcert(String name){
		super(name);
	}
	
	public static Test suite() {
		return new TestSuite(Test_PerformedConcert.class);
	}

	protected void setUp() throws Exception {
		System.out.println("Test_"+ name +" Begin");
		pc = new PerformedConcert();
		ArrayList<Ticket> tick = new ArrayList<Ticket>();
		d = new Date(System.currentTimeMillis()-400590000);
		Ticket t1 = new Ticket(125.20, 44, true, d);
		Ticket t2 = new Ticket(225.20, 2, true, d);
		tick.add(t1);
		tick.add(t2);
		venue = new Venue("TheVenue",950,tick);
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_"+ name +" End");
		pc = null;
	}
	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_"+ name +".testConstructors");
		assertNotNull("\t\tTest_"+ name +".testConstructors: Test_"+ name +" is null", pc);
	}
	/**
	 * Test the accessors.
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_"+ name +".testAccessors");
		testMutators();
		assertNotNull("\t\tTest_"+ name +".testAccessors: Test_"+ name +" is null", pc);
		System.out.println("\t" + pc.toString());
	}

	/**
	 * Test the mutators/modifiers.
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_"+ name +".testMutators");
		assertNotNull("\t\tTest_"+ name +".testMutators: Test_"+ name +" is null", pc);
		Date dp = new Date(System.currentTimeMillis()-60000000);
		pc.setVenue(venue);
		pc.setDatePerformed(dp);
	}

	/**
	 * Test behaviors.
	 */
	public void testBehaviors() {
		System.out.println("\tExecuting Test_"+ name +".testBehaviors");
		assertNotNull("\t\tTest_"+ name +".testBehaviors: "+ name +" is null", pc);
		assertTrue("\t\t" + name + ".toString: toString is blank", (pc.toString() != ""));
		testMutators();
		System.out.println("\t" + pc.toString());
	}
	/* STAND-ALONE ENTRY POINT ----------------------------------------- */
	/**
	 * Main line for stand-alone operation.
	 * 
	 * @param args
	 *            Standard string command line parameters.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_"+ name +" suite");
		junit.textui.TestRunner.run(suite());
	}

	/* ATTRIBUTES ----------------------------------------------- */
	private PerformedConcert pc = null;
	private Date d;
	private Venue venue;
	private static String name = "PeformedConcert";
}
