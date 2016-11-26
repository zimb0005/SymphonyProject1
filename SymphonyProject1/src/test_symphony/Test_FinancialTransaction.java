package test_symphony;

import java.text.SimpleDateFormat;
import java.util.Date;

import junit.framework.*;
import symphony.FinancialTransaction;
import symphony.Ticket;

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
	}

	public void tearDown() throws Exception {
		System.out.println("Test_FinancialTransaction Ends");
		testfinanceTrans = null;
	}

	/**
	 * Test the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_FinancialTransaction.testConstructors");
		assertNotNull("\t\tTest_FinancialTransaction.testConstructors: FinancialTransaction is null", testfinanceTrans);

		System.out.println("\tAmount: " + testfinanceTrans.getAmount() + "\n\tTransaction Number: "
				+ testfinanceTrans.getTransactionNum() + "\n\tTransaction Type: "
				+ testfinanceTrans.getTransactionType() + "\n\tClass: " + testfinanceTrans.getClass() + "\n\tDate: "
				+ testfinanceTrans.getDate() + "\n\tTicket: " + FinancialTransaction.getTicket()
				+ "\n\tTransaction Method: " + testfinanceTrans.getTransactionMethod());
	}

	/**
	 * Testing ACCESSORS.
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_FinancialTransaction.testAccessors");
		testfinanceTrans = new FinancialTransaction();
		assertNotNull("\t\tTest_FinancialTransaction.testAccessors: Financial Transaction is null", testfinanceTrans);

		// testing Financial Transaction "Amount"
		testfinanceTrans.setAmount(5.00);
		assertTrue(testfinanceTrans.getAmount() == 5.00);
		System.out.println("\t(True)Ammount = " + testfinanceTrans.getAmount());
		testfinanceTrans.setAmount(0.00);
		assertEquals(testfinanceTrans.getAmount(), testfinanceTrans.getAmount());
		System.out.println("\t(Equals)Ammount = " + testfinanceTrans.getAmount());

		// testing Financial Transaction "Date"
		testfinanceTrans.setDate(date);
		assertTrue(testfinanceTrans.getDate() == date);
		System.out.println("\t(True)Date is " + sdf.format(testfinanceTrans.getDate()));
		assertEquals(testfinanceTrans.getDate(), testfinanceTrans.getDate());
		System.out.println("\t(Equals)Date is " + sdf.format(testfinanceTrans.getDate()));

		// testing Financial Transaction "Tickets"
		assertEquals(FinancialTransaction.getTicket(), FinancialTransaction.getTicket());
		System.out.println(
				"\t(Equals)testfinanceTrans.getTicket() is an instance of " + "FinancialTransaction.getTicket()");

		// testing Financial Transaction "Method"
		testfinanceTrans.setTransactionMethod(string1);
		assertTrue(testfinanceTrans.getTransactionMethod() == string1);
		System.out.println("\t(True)Transaction Method is a '" + string1 + "'");
		testfinanceTrans.setTransactionMethod(string3);
		assertEquals(testfinanceTrans.getTransactionMethod(), testfinanceTrans.getTransactionMethod());
		System.out.println("\t(Equals)Transaction Method is '" + testfinanceTrans.getTransactionMethod() + "'");

		// testing Financial Transaction "Method"
		testfinanceTrans.setTransactionNum(54646845);
		assertTrue(testfinanceTrans.getTransactionNum() == 54646845);
		System.out.println("\t(True)Transaction Number is " + testfinanceTrans.getTransactionNum());
		assertEquals(testfinanceTrans.getTransactionNum(), testfinanceTrans.getTransactionNum());
		System.out.println("\t(Equals)Transaction Number equals " + testfinanceTrans.getTransactionNum());

		// testing Financial Transaction " "
		testfinanceTrans.setTransactionType(chequing);
		assertTrue(testfinanceTrans.getTransactionType() == "Chequing");
		System.out.println("\t(True)Transaction Type is '" + testfinanceTrans.getTransactionType() + "'");
		assertEquals(testfinanceTrans.getTransactionType(), testfinanceTrans.getTransactionType());
		System.out.println("\t(Equals)Transaction Type is '" + testfinanceTrans.getTransactionType() + "'");
	}

	/**
	 * Testing MUTATORS/MODIFIERS.
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_FinancialTransaction.testMutators");
		testfinanceTrans = new FinancialTransaction();
		assertNotNull("\t\tTest_FinancialTransaction.testAccessors: Financial Transaction is null", testfinanceTrans);

		// testing Financial Transaction "Amount"
		testfinanceTrans.setAmount(0.00);
		assertFalse(testfinanceTrans.getAmount() == 5.00);
		System.out.println("\t(False)Ammount = " + testfinanceTrans.getAmount());
		testfinanceTrans.setAmount(0.00);
		assertEquals(testfinanceTrans.getAmount(), testfinanceTrans.getAmount());
		System.out.println("\t(Equals)Ammount = " + testfinanceTrans.getAmount());

		// testing Financial Transaction "Date"
		testfinanceTrans.setDate(date);
		assertFalse(testfinanceTrans.getDate() != date);
		System.out.println("\t(False)Date is " + sdf.format(testfinanceTrans.getDate()));
		assertEquals(testfinanceTrans.getDate(), testfinanceTrans.getDate());
		System.out.println("\t(Equals)Date is " + sdf.format(testfinanceTrans.getDate()));

		// testing Financial Transaction "Tickets"
		assertEquals(FinancialTransaction.getTicket(), FinancialTransaction.getTicket());
		System.out.println(
				"\t(Equals)testfinanceTrans.getTicket() is an instance of " + "FinancialTransaction.getTicket()");

		// testing Financial Transaction "Method"
		testfinanceTrans.setTransactionMethod(string2);
		assertFalse(testfinanceTrans.getTransactionMethod() == string1);
		System.out.println("\t(False)Transaction Method is not '" + string1 + "' it's a '" + string2 + "'");
		testfinanceTrans.setTransactionMethod(string3);
		assertEquals(testfinanceTrans.getTransactionMethod(), testfinanceTrans.getTransactionMethod());
		System.out.println("\t(Equals)Transaction Method is '" + testfinanceTrans.getTransactionMethod() + "'");

		// testing Financial Transaction "Method"
		assertFalse(testfinanceTrans.getTransactionNum() == 45686541);
		System.out.println("\t(False)Transaction Number does not equal " + testfinanceTrans.getTransactionNum());
		assertEquals(testfinanceTrans.getTransactionNum(), testfinanceTrans.getTransactionNum());
		System.out.println("\t(Equals)Transaction Number equals " + testfinanceTrans.getTransactionNum());

		// testing Financial Transaction "Type"
		testfinanceTrans.setTransactionType(savings);
		assertFalse(testfinanceTrans.getTransactionType() == "Chequing");
		System.out.println("\t(False)Transaction Type is not '" + testfinanceTrans.getTransactionType() + "'");
		assertEquals(testfinanceTrans.getTransactionType(), testfinanceTrans.getTransactionType());
		System.out.println("\t(Equals)Transaction Type is '" + testfinanceTrans.getTransactionType() + "'");
	}

	/**
	 * Testing BEHAVIOURS.
	 */
	public void testBehaviors() {
		System.out.println("\tExecuting Test_FinancialTransaction.testBehaviors");
		testfinanceTrans = new FinancialTransaction();
		assertNotNull("\t\tTest_FinancialTransaction: FinancialTransaction is null", testfinanceTrans);

		testfinanceTrans.setTransactionNum(456123789);
		testfinanceTrans.setTransactionType(chequing);
		testfinanceTrans.setAmount(2);
		testfinanceTrans.setDate(date);
		FinancialTransaction.setTicket(ticket);
		assertEquals(testfinanceTrans.toString(),
				"FinancialTransaction [transactionNum= " + testfinanceTrans.getTransactionNum() + ", transactionType= "
						+ testfinanceTrans.getTransactionType() + ", amount= " + testfinanceTrans.getAmount()
						+ ", date= " + sdf.format(testfinanceTrans.getDate()) + ", ticket= "
						+ testfinanceTrans.getTicket() + "]");
		System.out.println("\t " + testfinanceTrans.toString());

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
	private static FinancialTransaction testfinanceTrans;
	private static final SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	Ticket ticket = null;
	Date date = new Date();
	String chequing = "Chequing";
	String savings = "Savings";
	String string1 = "Credit Card";
	String string2 = "Debit Card";
	String string3 = "the same thing";
}
