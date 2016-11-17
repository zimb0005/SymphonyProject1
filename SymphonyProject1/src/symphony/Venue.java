package symphony;

import java.util.ArrayList;

/**
 * class representing a venue that will host a concert
 * @author Team 2
 *
 */
public class Venue {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public Venue(){
		super();
	}

	/**
	 * overloaded constructor
	 * @param venueName
	 * @param capacity
	 * @param tickets
	 */
	public Venue(String venueName,int capacity,ArrayList<Ticket> tickets){
		this.venueName = venueName;
		this.capacity = capacity;
		this.tickets = tickets;
	}

	/* ACCESSORS	-----------------------------------------------------*/
	
	/**
	 * getter for venueName
	 * @return venue name
	 */
	public String getVenueName() {
		return venueName;
	}

	/**
	 * getter for capacity
	 * @return capacity of venue
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * getter for tickets
	 * @return list of tickets venue has for a concert
	 */
	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	/* MODIFIERS	-----------------------------------------------------*/
		
	/**
	 * setter for venueName
	 * @param venueName
	 */
	public void setVenueName(String venueName) {
		this.venueName = venueName;
	}
	
	/**
	 * setter for capacity
	 * @param capacity
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	/**
	 * setter for tickets
	 * @param tickets
	 */
	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}

	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 * method to initiate a financial transaction to sell a ticket
	 */
	public void sellTicket(){
		
		//********:TODO****************
	}
	
	/**
	 * method to initiate a financial transaction to refund a ticket
	 */
	public void refundTicket(){
		
		//*********:TODO****************
	}
	
	/**
	 * override method for toString()
	 */
	@Override
	public String toString() {
		return "Venue [venueName=" + venueName + ", capacity=" + capacity
				+ ", tickets=" + tickets + "]";
	}
	
	/* ATTRIBUTES--------------------------------------------------------*/
	
	/**
	 * name of the venue
	 */
	private String venueName;
	
	/**
	 * capacity of the venue 
	 */
	private int capacity;
	
	/**
	 * ticket list of seats in the venue
	 */
	private ArrayList<Ticket> tickets;
		
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/

}
