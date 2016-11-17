package symphony;

import java.util.Date;
import java.util.ArrayList;

/**
 * this class represents a season of concerts
 * @author Team2
 *
 */
public class ConcertSeason {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public ConcertSeason(){
		super();
	}
	
	/**
	 * Overloaded constructor
	 */
	public ConcertSeason(Date openingDate, int lengthInDays){
		super();
		this.openingDate = openingDate;
		this.lengthInDays = lengthInDays;	
	}
	
	/* ACCESSORS	-----------------------------------------------------*/
	/**
	 * getter for openingDate
	 * @return opening date
	 */
	public Date getOpeningDate() {
		return openingDate;
	}
	
	/**
	 * getter for lengthInDays
	 * @return length of season in days
	 */
	public int getLengthInDays() {
		return lengthInDays;
	}
	
	/**
	 * getter for concerts
	 * @return concerts in season
	 */
	public ArrayList<Concert> getConcerts() {
		return concerts;
	}
		
	/* MODIFIERS	-----------------------------------------------------*/
	
	/**
	 * setter for openingDate
	 * @param openingDate
	 */
	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}

	/**
	 * setter for lengthInDays
	 * @param lengthInDays
	 */
	public void setLengthInDays(int lengthInDays) {
		this.lengthInDays = lengthInDays;
	}
	
	/**
	 * setter for concerts
	 * @param concerts
	 */
	public void setConcerts(ArrayList<Concert> concerts) {
		this.concerts = concerts;
	}
		

	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 * adds concert to season
	 */
	public void addConcert(){
		
		//****:TODO*****
	}
	
	/**
	 * removes concert to season
	 */
	public void removeConcert(){
		
		//****:TODO*****
	}
	
	/**
	 * Override method for toString()
	 */
	@Override
	public String toString() {
		return "ConcertSeason [openingDate=" + openingDate + ", lengthInDays="
				+ lengthInDays + ", concerts=" + concerts + "]";
	}

	/* ATTRIBUTES--------------------------------------------------------*/
	/**
	 * represents an opening date for the season
	 */
	private Date openingDate;
	
	/**
	 * represents the length of the season in days
	 */
	private int lengthInDays;
	
	/**
	 * represents concerts in the season
	 */
	private ArrayList<Concert> concerts;	
		
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/

}
