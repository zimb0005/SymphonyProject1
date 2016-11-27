package symphony;
/**
 * this class acts as the controller for the system implementing all the use cases
 * @author Team 2
 *@version 1.0.0	November 2016
 */
public class Controller {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public Controller(){
		super();
	}

	/* ACCESSORS	-----------------------------------------------------*/
	/**
	 * getter for data
	 * @return data
	 */
	public SampleData getData() {
		return data;
	}
	/**
	 * getter for season
	 * @return season
	 */
	public ConcertSeason getSeason() {
		return season;
	}
	/**
	 * getter for concert
	 * @return concert
	 */
	public Concert getConcert() {
		return concert;
	}

	/* MODIFIERS	-----------------------------------------------------*/
	/**
	 * setter for data
	 * @param data
	 */
	public void setData(SampleData data) {
		this.data = data;
	}
	/**
	 * setter for season
	 * @param season
	 */
	public void setSeason(ConcertSeason season) {
		this.season = season;
	}
	/**
	 * setter for concert
	 * @param concert
	 */
	public void setConcert(Concert concert) {
		this.concert = concert;
	}	

	/* NORMAL BEHAVIOR -------------------------------------------------*/
	/**
	 * method to add a concert to a season
	 */
	public void addConcert(){
	season.addConcert(concert);
	}
	/**
	 * method to remove a concert form a season
	 */
	public static void removeConcert(){};
	/**
	 * schedule a concert with a date and venue
	 */
	public static void scheduleConcert(){};
	/**
	 * Unschedule a concert
	 */
	public static void unScheduleConcert(){};
	/**
	 * print a concert season
	 */
	public static void printConcertSeason(){};
	/* ATTRIBUTES--------------------------------------------------------*/
	/**
	 * instance of class used to generate a concert
	 */
	private SampleData data;
	/**
	 * concert season
	 */
	private ConcertSeason season;
	/**
	 * concert 
	 */
	private Concert concert;
		

}
