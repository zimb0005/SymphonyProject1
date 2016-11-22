package test_symphony;

import java.awt.List;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.Ticket;
import symphony.Venue;


//Omar
public class Test_Venue extends TestCase{
	public Test_Venue(String name) {
		super(name);
	}
	public static Test suite() {
		return new TestSuite(Test_Venue.class);
	}
	protected void setUp() throws Exception {
		System.out.println("Test_Venue Begin");
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_Venue End");
	}
	/**
	 * Test the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Venue.testConstructors");
		assertNotNull("\t\tTest_Venue.testConstructors: Test_Venue is null", venue);
		System.out.println("\tCreating 5 tickets, using Ticket class...");
		
		Ticket t1 = new Ticket(125.20, 44, true, d);
		Ticket t2 = new Ticket(225.20, 2, true, d);
		Ticket t3 = new Ticket(125.20, 11, false, d);
		Ticket t4 = new Ticket(225.20, 6, true, d);
		Ticket t5 = new Ticket(225.20, 4, false, d);
		
		ArrayList<Ticket> tickets = new ArrayList<Ticket>();
		
		for(Ticket tic : tickets){
			tickets.add(tic);
		}
		
		Venue v = new Venue("name",536,tickets);
	}
	
	/**
	 * Test the accessors.
	 */
	public void testAccessors(){
		testMutators();
		System.out.println("\tExecuting Test_Venue.testAccessors");
		assertNotNull("\t\tTest_Venue.testAccessors: Test_Venue is null", venue);
		System.out.println("\tResult: ");
		
		System.out.println("\tVenue Name: "+venue.getVenueName() + "\n\tCapacity: "+venue.getCapacity()
		+ "\n\tTickets: ");
		
		
			for (int i = 0; i < 5; i++) {
				System.out.println("\t\t"+tick.get(i).toString());
			}
		
		
	}
	/**
	 * Test the mutators/modifiers.
	 */
	
	public void testMutators(){
		System.out.println("\tExecuting Test_Venue.testMutators");
		assertNotNull("\t\tTest_Venue.testMutators: Test_Venue is null", venue);
		System.out.println("\tLoading data...");
		venue.setCapacity(986);
		venue.setVenueName("THENAME");
		Ticket t1 = new Ticket(125.20, 44, true, d);
		Ticket t2 = new Ticket(225.20, 2, true, d);
		Ticket t3 = new Ticket(125.20, 11, false, d);
		Ticket t4 = new Ticket(225.20, 6, true, d);
		Ticket t5 = new Ticket(225.20, 4, false, d);
		
		
	
		tick.add(t1);
		tick.add(t2);
		tick.add(t3);
		tick.add(t4);
		tick.add(t5);
	
	
		venue.setTickets(tick);

	}
	/**
	 * Test behaviors.
	 */
	public void testBehaviors(){
		venue.setCapacity(986);
		venue.setVenueName("THENAME");
		Ticket t1 = new Ticket(125.20, 44, true, d);
		Ticket t2 = new Ticket(225.20, 2, true, d);
		Ticket t3 = new Ticket(125.20, 11, false, d);
		Ticket t4 = new Ticket(225.20, 6, true, d);
		Ticket t5 = new Ticket(225.20, 4, false, d);
		
		
	
		tick.add(t1);
		tick.add(t2);
		tick.add(t3);
		tick.add(t4);
		tick.add(t5);
	
	
		venue.setTickets(tick);
		System.out.println("\tExecuting Test_Venue.testBehaviors");
		assertNotNull("\t\tTest_Venue.testBehaviors: Test_Venue is null", venue);
		assertFalse(venue.getCapacity() == 987);
		assertEquals(venue.getVenueName() , "THENAME");
		
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
	private ArrayList<Ticket> tick = new ArrayList<Ticket>();
	private Date d = new Date();
	private Venue venue = new Venue();
}
