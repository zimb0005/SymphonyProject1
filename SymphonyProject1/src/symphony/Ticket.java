package symphony;

import java.util.Date;

/**
 * this class represents a ticket that a venue has for a seat on a certain date
 * @author ron
 *
 */
public class Ticket {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public Ticket(){
		super();
	}
	
	/**
	 * overloaded constructor
	 * @param price
	 * @param seatNum
	 * @param sold
	 * @param date
	 */
	public Ticket(Double price,int seatNum,boolean sold,Date date){
		this.date = date;
		this.price = price;
		this.seatNum = seatNum;
		this.sold = sold;
		}

	/* ACCESSORS	-----------------------------------------------------*/
	
	/**
	 * getter for price
	 * @return price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * getter for seatNum
	 * @return seatNum
	 */
	public int getSeatNum() {
		return seatNum;
	}
	/**
	 * getter for sold
	 * @return sold (true or false)
	 */
	public boolean getSold(){
		return sold;
	}

	/**
	 * getter for date
	 * @return date
	 */
	public Date getDate() {
		return date;
	}

	/* MODIFIERS	-----------------------------------------------------*/
		
	/**
	 * setter for price
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * setter for seatNum
	 * @param seatNum
	 */
	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}
	
	/**
	 * setter for sold
	 * @param boolean value representing if ticket is sold
	 */
	public void setSold(boolean sold) {
		this.sold = sold;
	}
	
	/**
	 * setter for date
	 * @param date that ticket is for
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 * override method for toString()
	 */
	@Override
	public String toString() {
		return "Ticket [price=" + price + ", seatNum=" + seatNum + ", sold="
				+ sold + ", date=" + date + "]";
	}

	/* ATTRIBUTES--------------------------------------------------------*/
	
	/**
	 * price of ticket
	 */
	private double price;
	
	/**
	 * seat number associated with ticket
	 */
	private int seatNum;
	
	/**
	 * boolean if ticket is sold or not
	 */
	private boolean sold;
	
	/**
	 * date that ticket is valid
	 */
	private Date date;
		
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/

}
