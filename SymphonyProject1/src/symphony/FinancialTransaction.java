package symphony;

import java.text.SimpleDateFormat;
import java.util.Date;

//:TODO ALL THE JAVADOC COMMENTS

public class FinancialTransaction {

	public FinancialTransaction() {
		super();
	}

	public FinancialTransaction(int transactionNum, String transactionType, String transactionMethod, Double amount,
			Date date, Ticket ticket) {
		super();
		FinancialTransaction.ticket = ticket;
		this.amount = amount;
		this.date = date;
		FinancialTransaction.transactionMethod = transactionMethod;
		this.transactionNum = transactionNum;
		this.transactionType = transactionType;
	}

	/* ACCESSOR --------------------------------------------------------- */

	public int getTransactionNum() {
		return transactionNum;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public Date getDate() {
		return date;
	}

	public static Ticket getTicket() {
		return ticket;
	}

	public String getTransactionMethod() {
		return transactionMethod;
	}

	/* MODIFIER ---------------------------------------------------------- */

	public void setTransactionNum(int transactionNum) {
		this.transactionNum = transactionNum;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public static void setTicket(Ticket ticket) {
		FinancialTransaction.ticket = ticket;
	}

	public void setTransactionMethod(String transactionMethod) {
		FinancialTransaction.transactionMethod = transactionMethod;
	}

	/* NORMAL BEHAVIOR ------------------------------------------------- */

	@Override
	public String toString() {
		return "FinancialTransaction [transactionNum= " + transactionNum + ", transactionType= " + transactionType
				+ ", amount= " + amount + ", date= " + sdf.format(date) + ", ticket= " + ticket + "]";
	}

	/* ATTRIBUTES ------------------------------------------------------- */

	/**
	 * transaction number for ledger
	 */
	private int transactionNum;
	/**
	 * transaction type 'refund' or 'sale'
	 */
	private String transactionType;
	/**
	 * transaction method 'debit', 'credit' or 'cash'
	 */
	private static String transactionMethod;
	/**
	 * dollar amount of transaction
	 */
	private double amount;
	SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
	private Date date;
	private static Ticket ticket;
	/* ENTRY POINT for STAND-ALONE OPERATION --------------------------- */

}
