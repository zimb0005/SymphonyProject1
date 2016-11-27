package test_symphony;

import java.util.ArrayList;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.Ticket;
import symphony.Venue;


/**
 * this class test the Venue class in symphony package
 * @author Team 2
 * @version 1.0.0	November 2016
 *
 */
public class Test_Venue extends TestCase{
	public Test_Venue(String name) {
		super(name);
	}
	public static Test suite() {
		return new TestSuite(Test_Venue.class);
	}
	protected void setUp() throws Exception {
		System.out.println("Test_Venue Begin");
		d= new Date();
		v = new Venue();
		t = new ArrayList<Ticket>();
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_Venue End");
		d = null;
		v = null;
		t = null;
	}
	/**
	 * Test the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Venue.testConstructors");
		assertNotNull("\t\tTest_Venue.testConstructors: Test_Venue is null", v);
		Venue v2 = new Venue("name",536,t);
		assertNotNull("\t\tTest_Venue.testConstructors: Test_Venue is null", v2);
	}
	
	/**
	 * Test the accessors.
	 */
	public void testAccessors(){
		System.out.println("\tExecuting Test_Venue.testAccessors");
		v.setTickets(t);
		v.setVenueName("Name");
		v.setCapacity(300);
		assertEquals(v.getCapacity(),300);
		assertEquals(v.getVenueName(),"Name");
		assertEquals(v.getTickets(),t);
		
		
	}
	/**
	 * Test the mutators/modifiers.
	 */
	
	public void testMutators(){
		System.out.println("\tExecuting Test_Venue.testMutators");
		v.setTickets(t);
		v.setVenueName("Name");
		v.setCapacity(300);
		assertEquals(v.getCapacity(),300);
		assertEquals(v.getVenueName(),"Name");
		assertEquals(v.getTickets(),t);

	}
	/**
	 * Test behaviors.
	 */
	public void testBehaviors(){
		assertEquals("Venue [transaction=null, venueName=null, capacity=0, tickets=null]",v.toString());
		
	}
	/* STAND-ALONE ENTRY POINT ----------------------------------------- */
	/**
	 * Main line for stand-alone operation.
	 * 
	 * @param args
	 *            Standard string command line parameters.
	 */
	public static void  main(String[] args) {
		System.out.println("Executing Test_Venue suite");
		junit.textui.TestRunner.run(suite());
		
	}
	private ArrayList<Ticket> t;
	private Date d;
	private Venue v;
}
