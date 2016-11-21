package symphony;

import java.util.Date;

/**
 * class represents a performed concert so it will have a past date
 * @author Team 2
 *
 */
public class PerformedConcert extends Concert {
	
	/* CONSTRUCTORS-----------------------------------*/
	
	/**
	 * default constructor
	 */
	public PerformedConcert(){
		super();
	}
	
	/**
	 * overloaded constructor
	 * @param datePerformed
	 * @param venue
	 */
	public PerformedConcert(Date datePerformed, Venue venue){
		super();
		this.datePerformed = datePerformed;
		this.venue = venue;
	}
	
	/* ACCESSORS --------------------------------------------*/
	
	/**
	 * date the concert was performed
	 * @return date of concert
	 */
	public Date getDatePerformed() {
		return datePerformed;
	}

	/**
	 * venue the concert was performed at
	 * @return venue of concert
	 */
	public Venue getVenue() {
		return venue;
	}
	
	/* MODIFIERS --------------------------------------------*/
	
	/**
	 * setter for datePerformed
	 * @param datePerformed
	 */
	public void setDatePerformed(Date datePerformed) {
		this.datePerformed = datePerformed;
	}
	
	/**
	 * setter for venue
	 * @param venue
	 */
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	
	/* NORMAL BEHAVIOUR ------------------------------------*/
	
	/**
	 * override method for toString()
	 */
	@Override
	public String toString() {
		return "PerformedConcert [datePerformed=" + datePerformed + ", venue="
				+ venue + "]";
	}
	
	/* ATTRIBUTES-------------------------------------------*/
	
	/**
	 * date that concert was performed
	 */
	private Date datePerformed;
	
	/**
	 * venue concert was performed at
	 */
	private Venue venue;

}
