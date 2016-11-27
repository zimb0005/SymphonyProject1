package test_symphony;

import symphony.Ticket;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * this class is designed to test the Ticket class in the symphony package
 * @author team 2
 * @version 1.0.0	November 2016
 *
 */
public class Test_Ticket extends TestCase {
	public Test_Ticket(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Test_Ticket.class);
	}
	
	protected void setUp() throws Exception {
		System.out.println("Test_Ticket Begin");
		ticket = new Ticket();
		date = new Date();
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_Ticket End");
		ticket = null;
		date = null;
	}

	/**
	 * Test the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Ticket.testConstructors");
		assertNotNull("\tTest_Ticket.testConstructors: Ticket is null", ticket);

	}
	/**
	 * Test the accessors.
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_Ticket.testAccessors");
		ticket.setDate(date);
		ticket.setPrice(55.00);
		ticket.setSeatNum(10);
		ticket.setSold(true);
		assertEquals(ticket.getPrice(),55.00);
		assertEquals(ticket.getDate(),date);
		assertEquals(ticket.getSeatNum(),10);
		assertEquals(ticket.getSold(),true);
	}

	/**
	 * Test the mutators/modifiers.
	 * @throws ParseException for using the date
	 */
	
	public void testMutators() throws ParseException{
		
		System.out.println("\tExecuting Test_Ticket.testMutators");
		ticket.setDate(date);
		ticket.setPrice(55.00);
		ticket.setSeatNum(10);
		ticket.setSold(true);
		assertEquals(ticket.getPrice(),55.00);
		assertEquals(ticket.getDate(),date);
		assertEquals(ticket.getSeatNum(),10);
		assertEquals(ticket.getSold(),true);
	}
	/**
	 * Test behaviors.
	 */
	public void testBehaviors() throws ParseException{
		System.out.println("\tExecuting Test_Ticket.testBehaviors");
		assertEquals("Ticket [price=0.0, seatNum=0, sold=false, date=null]",ticket.toString());
	}

	/* STAND-ALONE ENTRY POINT ----------------------------------------- */
	/**
	 * Main line for stand-alone operation.
	 * 
	 * @param args
	 *            Standard string command line parameters.
	 */
	public static void  main(String[] args) {
		System.out.println("Executing Test_Ticket suite");
		junit.textui.TestRunner.run(suite());
		
	}

	private Date date;
	private Ticket ticket;
}
