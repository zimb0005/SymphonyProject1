package symphony;

import java.util.Date;

//:TODO ALL THE JAVADOC COMMENTS

public class FinancialTransaction {
	
	public FinancialTransaction(){
		super();
	}
	
	public FinancialTransaction(int transactionNum, String transactionType, String transactionMethod, Double amount, Date date, Ticket ticket){
		super();
		this.ticket = ticket;
		this.amount = amount;
		this.date = date;
		this.transactionMethod = transactionMethod;
		this.transactionNum = transactionNum;
		this.transactionType = transactionType;
	}
	
	
	/* ACCESSOR ---------------------------------------------------------*/

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
	
	public Ticket getTicket() {
		return ticket;
	}
	
	
	/* MODIFIER ----------------------------------------------------------*/
	
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
	
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	@Override
	public String toString() {
		return "FinancialTransaction [transactionNum=" + transactionNum
				+ ", transactionType=" + transactionType + ", amount=" + amount
				+ ", date=" + date + ", ticket=" + ticket + "]";
	}
	
	/* ATTRIBUTES -------------------------------------------------------*/
	
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
		private String transactionMethod;
		/**
		 * dollar amount of transaction
		 */
		private double amount;
		private Date date;
		private Ticket ticket;
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/
	

}
