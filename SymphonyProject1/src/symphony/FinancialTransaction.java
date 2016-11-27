package symphony;

import java.util.Date;

/**
 * this class represents a financial transaction ie. venue selling a ticket for a concert
 * @author Team 2
 *@version 1.0.0	November 2016
 */
public class FinancialTransaction {
	/**
	 * default constructor
	 */
	public FinancialTransaction(){
		super();
	}
	/**
	 * overloaded constructor
	 * @param transactionNum
	 * @param transactionType
	 * @param transactionMethod
	 * @param amount
	 * @param date
	 * @param ticket
	 */
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
	/**
	 * getter for transactionNum
	 * @return transactionNum
	 */
	public int getTransactionNum() {
		return transactionNum;
	}
	/**
	 * getter for transactionType
	 * @return transactionType ie sell or refund
	 */
	public String getTransactionType() {
		return transactionType;
	}
	/**
	 * getter for amount
	 * @return amount ie price of ticket
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * getter for date
	 * @return date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * getter for ticket
	 * @return ticket
	 */
	public Ticket getTicket() {
		return ticket;
	}
	/**
	 * getter for transactionMethod
	 * @return tranasctionMethod ie cash, debit or credit
	 */
	public String getTransactionMethod(){
		return transactionMethod;
	}
	
	
	/* MODIFIER ----------------------------------------------------------*/
	
	/**
	 * setter for transactionNUm
	 * @param transactionNum
	 */
	public void setTransactionNum(int transactionNum) {
		this.transactionNum = transactionNum;
	}
	/**
	 * setter for transactionType
	 * @param transactionType
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	/**
	 * setter for amount
	 * @param amount
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * setter for date
	 * @param date
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * setter for ticket
	 * @param ticket
	 */
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	/**
	 * setter for transactionMethod
	 * @param transactionMethod
	 */
	public void setTransactionMethod(String transactionMethod){
		this.transactionMethod = transactionMethod;
	}
	
	/* NORMAL BEHAVIOR -------------------------------------------------*/
	/**
	 * override method for toString
	 */
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
		/**
		 * date of transaction
		 */
		private Date date;
		/**
		 * ticket that transaction is for
		 */
		private Ticket ticket;
	

}
