package symphony;

import java.util.Date;

/**
 * class representing a concert that is scheduled for the future
 * @author Team 2
 *
 */
public class ScheduledConcert extends Concert{
	
	/* CONSTRUCTORS --------------------------------------*/
	
	/**
	 * default constructor
	 */
	public ScheduledConcert(){
		super();
	}
	
	/**
	 * overloaded constructor
	 * @param dateScheduled
	 * @param venue
	 */
	public ScheduledConcert(Date dateScheduled,Venue venue){
		super();
		this.dateScheduled = dateScheduled;
		this.venue = venue;
	
	}
	
	/* MODIFIER --------------------------------------*/
	
	/**
	 * getter for dateScheduled
	 * @return date that concert is scheduled for
	 */
	public Date getDateScheduled() {
		return dateScheduled;
	}

	/**
	 * getter for venue
	 * @return venue concert is being hosted at
	 */
	public Venue getVenue() {
		return venue;
	}

	/* ACCESSOR --------------------------------------*/
	
	/**
	 * setter for dateScheduled
	 * @param dateScheduled
	 */
	public void setDateScheduled(Date dateScheduled) {
		this.dateScheduled = dateScheduled;
	}
	
	/**
	 * setter for venue
	 * @param venue
	 */
	public void setVenue(Venue venue) {
		this.venue = venue;
	}
	
	/* NORMAL BEHAVIOUR ------------------------------*/
	
	/**
	 * override method for toString()
	 */
	@Override
	public String toString() {
		return "ScheduledConcert [dateScheduled=" + dateScheduled + ", venue="
				+ venue + "]";
	}
	
	/* ATTRIBUTES ------------------------------------*/
	
	/**
	 * date for future concert
	 */
	private Date dateScheduled;

	/**
	 * Venue concert will be hosted at
	 */
	private Venue venue;
}
