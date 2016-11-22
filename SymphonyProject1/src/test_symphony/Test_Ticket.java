package test_symphony;

import symphony.Ticket;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

//Omar
public class Test_Ticket extends TestCase {
	public Test_Ticket(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Test_Ticket.class);
	}
	
	protected void setUp() throws Exception {
		System.out.println("Test_Ticket Begin");
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_Ticket End");
	}

	/**
	 * Test the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Ticket.testConstructors");

		Ticket testTicket = new Ticket(25.20, 5, true, date);

		assertNotNull("\tTest_Ticket.testConstructors: Ticket is null", testTicket);

	}
	/**
	 * Test the accessors.
	 * 
	 * @throws ParseException
	 */
	public void testAccessors() throws ParseException {
		testMutators();
		System.out.println("\tExecuting Test_Ticket.testAccessors");
		assertNotNull("\tTest_Ticket.testAccessors: Ticket is null", testTicket);
		// :TODO****************
		System.out.println("\tSeat Number: " + testTicket.getSeatNum() + "\n\tPrice: " + testTicket.getPrice()
				+ "\n\tDate: " + dateformat.format(date) + "\n\tSold: " + testTicket.getSold());
	}

	/**
	 * Test the mutators/modifiers.
	 * @throws ParseException for using the date
	 */
	
	public void testMutators() throws ParseException{
		
		System.out.println("\tExecuting Test_Ticket.testMutators");
		assertNotNull("\tTest_Ticket.testMutators: Ticket is null", testTicket);
		testTicket.setPrice(24.99);
		testTicket.setSeatNum(16);
		testTicket.setSold(true);
		date = dateformat.parse("2016/11/30");
		testTicket.setDate(date);
		// :TODO********************

	}

	

	/**
	 * Test behaviors.
	 */
	public void testBehaviors() throws ParseException{
		System.out.println("\tExecuting Test_Ticket.testBehaviors");
		assertNotNull("\tTest_Ticket.testBehaviors: Ticket is null", testTicket);
		// :TODO*******************
		assertTrue(testTicket.getSold() == false);
		assertFalse(dateformat.format(date).equals("2016/11/31"));
		System.out.println("Done!");
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

	private SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/mm/dd");
	private Date date = new Date();
	private Ticket testTicket = new Ticket();
}
