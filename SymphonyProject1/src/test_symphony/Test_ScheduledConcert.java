package test_symphony;

import java.util.ArrayList;
import java.util.Date;

import junit.framework.*;
import symphony.ScheduledConcert;
import symphony.Ticket;
import symphony.Venue;

/**
 * this class rests the ScheduledConcert class in symphony package
 * @author team 2
 * @version	1.0.0	November 2016
 *
 */
public class Test_ScheduledConcert extends TestCase{

	public Test_ScheduledConcert(String name){
		super(name);
	}
	
	public static Test suite() {
		return new TestSuite(Test_ScheduledConcert.class);
	}

	protected void setUp() throws Exception {
		System.out.println("Test_"+ name +" Begin");
		s = new ScheduledConcert();
		d = new Date();
		v = new Venue();
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_"+ name +" End");
		s = null;
		d = null;
		v = null;
	}
	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_"+ name +".testConstructors");
		assertNotNull("\t\tTest_"+ name +".testConstructors: Test_"+ name +" is null", s);
	}
	/**
	 * Test the accessors.
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_"+ name +".testAccessors");
		s.setDateScheduled(d);
		s.setVenue(v);
		assertEquals(s.getVenue(),v);
		assertEquals(s.getVenue(),v);
	}

	/**
	 * Test the mutators/modifiers.
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_"+ name +".testMutators");
		s.setDateScheduled(d);
		s.setVenue(v);
		assertEquals(s.getVenue(),v);
		assertEquals(s.getVenue(),v);
	}

	/**
	 * Test behaviors.
	 */
	public void testBehaviors() {
		System.out.println("\tExecuting Test_"+ name +".testBehaviors");
		assertEquals("ScheduledConcert [dateScheduled=null, venue=null]",s.toString());
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
	private ScheduledConcert s;
	private Date d;
	private Venue v;
	private static String name = "ScheduledConcert";
}

    

