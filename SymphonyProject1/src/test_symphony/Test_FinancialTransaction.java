package test_symphony;

import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.*;
import symphony.FinancialTransaction;
import symphony.Ticket;
/**
 * This class tests the FinancialTransaction class in symphony package
 * @author team 3
 *@version 1.0.0	November 2016
 */
public class Test_FinancialTransaction extends TestCase {

	public Test_FinancialTransaction(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Test_FinancialTransaction.class);
	}

	public void setUp() throws Exception {
		System.out.println("Test_FinancialTransaction Begins");
		testfinanceTrans = new FinancialTransaction();
		ticket = new Ticket();
		date = new Date();
	}

	public void tearDown() throws Exception {
		System.out.println("Test_FinancialTransaction Ends");
		testfinanceTrans = null;
		ticket = null;
		date  = null;
	}

	/**
	 * Test the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_FinancialTransaction.testConstructors");
		assertNotNull("\t\tTest_FinancialTransaction.testConstructors: FinancialTransaction is null", testfinanceTrans);

	}

	/**
	 * Testing ACCESSORS.
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_FinancialTransaction.testAccessors");
		// testing Financial Transaction "Amount"
		testfinanceTrans.setAmount(5.00);
		assertTrue(testfinanceTrans.getAmount() == 5.00);
		testfinanceTrans.setAmount(5.00);
		assertEquals(testfinanceTrans.getAmount(), 5.00);
		// testing Financial Transaction "Date"
		testfinanceTrans.setDate(date);
		assertTrue(testfinanceTrans.getDate() == date);
		// testing Financial Transaction "Tickets"
		testfinanceTrans.setTicket(ticket);
		assertEquals(testfinanceTrans.getTicket(), ticket);
		// testing Financial Transaction "Method"
		testfinanceTrans.setTransactionMethod("credit");
		assertTrue(testfinanceTrans.getTransactionMethod() == "credit");
		// testing Financial Transaction "Number"
		testfinanceTrans.setTransactionNum(54646845);
		assertTrue(testfinanceTrans.getTransactionNum() == 54646845);
		// testing Financial Transaction "Type"
		testfinanceTrans.setTransactionType("chequing");
		assertTrue(testfinanceTrans.getTransactionType() == "chequing");
	}
	/**
	 * Testing MUTATORS/MODIFIERS.
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_FinancialTransaction.testMutators");
		// testing Financial Transaction "Amount"
		testfinanceTrans.setAmount(5.00);
		assertTrue(testfinanceTrans.getAmount() == 5.00);
		testfinanceTrans.setAmount(5.00);
		assertEquals(testfinanceTrans.getAmount(), 5.00);
		// testing Financial Transaction "Date"
		testfinanceTrans.setDate(date);
		assertTrue(testfinanceTrans.getDate() == date);
		// testing Financial Transaction "Tickets"
		testfinanceTrans.setTicket(ticket);
		assertEquals(testfinanceTrans.getTicket(), ticket);
		// testing Financial Transaction "Method"
		testfinanceTrans.setTransactionMethod("credit");
		assertTrue(testfinanceTrans.getTransactionMethod() == "credit");
		// testing Financial Transaction "Number"
		testfinanceTrans.setTransactionNum(54646845);
		assertTrue(testfinanceTrans.getTransactionNum() == 54646845);
		// testing Financial Transaction "Type"
		testfinanceTrans.setTransactionType("chequing");
		assertTrue(testfinanceTrans.getTransactionType() == "chequing");
	}
	/**
	 * Testing BEHAVIOURS.
	 */
	public void testBehaviors() {
		// test toString
		System.out.println("\tExecuting Test_FinancialTransaction.testBehaviors");
		assertEquals(testfinanceTrans.toString(),"FinancialTransaction [transactionNum=0, transactionType=null, amount=0.0, date=null, ticket=null]");
	}

	/* STAND-ALONE ENTRY POINT ----------------------------------------- */
	/**
	 * Main line for stand-alone operation.
	 * 
	 * @param args
	 *            Standard string command line parameters.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_FinancialTransaction suite");
		junit.textui.TestRunner.run(suite());
	}

	/* ATTRIBUTES ----------------------------------------------- */
	private FinancialTransaction testfinanceTrans;
	private Ticket ticket;
	private Date date;
	
}
