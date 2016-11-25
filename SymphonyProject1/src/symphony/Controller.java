package symphony;
/**
 * this class acts as the controller for the system implementing all the use cases
 * @author Team 2
 *
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
		

	/* MODIFIERS	-----------------------------------------------------*/
		

	/* NORMAL BEHAVIOR -------------------------------------------------*/
	/**
	 * method to add a concert to a season
	 */
	public void addConcert(){
	season.addConcert(concert);
	}
	
	public static void removeConcert(){};
		
	/* ATTRIBUTES--------------------------------------------------------*/
		private SampleData data = new SampleData();
		private ConcertSeason season = new ConcertSeason();
		private Concert concert = data.makeConcert();
		
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/
	
	public static void main(String[] args){
		
		SampleData data = new SampleData();
		
		Concert concert = data.makeConcert();
		
		System.out.println(concert.toString());
		
		System.out.println(concert.getId());
	}

}
