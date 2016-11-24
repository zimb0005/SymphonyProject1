package test_symphony;

import java.util.ArrayList;
import java.util.Date;

import junit.framework.*;
import symphony.ScheduledConcert;
import symphony.Ticket;
import symphony.Venue;

//rob
public class Test_ScheduledConcert extends TestCase{

	public Test_ScheduledConcert(String name){
		super(name);
	}
	
	public static Test suite() {
		return new TestSuite(Test_ScheduledConcert.class);
	}

	protected void setUp() throws Exception {
		System.out.println("Test_"+ name +" Begin");
		sc = new ScheduledConcert();
		ArrayList<Ticket> tick = new ArrayList<Ticket>();
		d = new Date();
		Ticket t1 = new Ticket(125.20, 44, true, d);
		Ticket t2 = new Ticket(225.20, 2, true, d);
		tick.add(t1);
		tick.add(t2);
		venue = new Venue("TheVenue",950,tick);
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_"+ name +" End");
		sc = null;
	}
	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_"+ name +".testConstructors");
		assertNotNull("\t\tTest_"+ name +".testConstructors: Test_"+ name +" is null", sc);
	}
	/**
	 * Test the accessors.
	 */
	public void testAccessors() {
		testMutators();
		System.out.println("\tExecuting Test_"+ name +".testAccessors");
		assertNotNull("\t\tTest_"+ name +".testAccessors: Test_"+ name +" is null", sc);
		System.out.println("\t" + sc.getVenue());
		System.out.println("\t" + sc.getDateScheduled());
	}

	/**
	 * Test the mutators/modifiers.
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_"+ name +".testMutators");
		assertNotNull("\t\tTest_"+ name +".testMutators: Test_"+ name +" is null", sc);
		sc.setVenue(venue);
		sc.setDateScheduled(d);
	}

	/**
	 * Test behaviors.
	 */
	public void testBehaviors() {
		System.out.println("\tExecuting Test_"+ name +".testBehaviors");
		assertNotNull("\t\tTest_"+ name +".testBehaviors: Test_"+ name +" is null", sc);
		assertTrue("\t\tTest_"+ name +".toString: toString is blank", (sc.toString() != ""));
		testMutators();
		System.out.println("\t" + sc.toString());
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
	private ScheduledConcert sc = null;
	private Date d = null;
	private Venue venue = null;
	private static String name = "ScheduledConcert";
}
