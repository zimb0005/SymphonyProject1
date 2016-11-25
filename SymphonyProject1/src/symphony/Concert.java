package symphony;

import java.util.ArrayList;

/**
 * this class represents a concert that can be added to a season
 * @author Team2
 *
 */

public class Concert extends Id {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public Concert() {
	}
	/**
	 * overloaded constructor
	 * @param conductor
	 * @param compositions
	 * @param performs
	 */
	public Concert(Conductor conductor, ArrayList<Composition> compositions, ArrayList<Perform> performs){
		setCompositions( compositions );
		setConductor( conductor );
		setPerformances( performs );
	}
	/* ACCESSORS	-----------------------------------------------------*/
	
	/**
	 * getter for conductor
	 * @return Conductor of concert
	 */
	public Conductor getConductor() {
		return conductor;
	}
	
	/**
	 * getter for compositions
	 * @return list of compositions in concert
	 */
	public ArrayList<Composition> getCompositions() {
		return compositions;
	}

	/**
	 * getter for performs
	 * @return list of performances of compositions by a soloist in a concert
	 */
	public ArrayList<Perform> getPerformances() {
		return performances;
	}
	/* MODIFIERS	-----------------------------------------------------*/
	
	/**
	 * setter for conductor
	 * @param conductor
	 */
	public void setConductor(Conductor conductor) {
		this.conductor = conductor;
	}
	
	
	/**
	 * setter for compositions
	 * @param compositions
	 */
	public void setCompositions(ArrayList<Composition> compositions) {
		this.compositions = compositions;
	}
	
	/**
	 * setter for performs
	 * @param performs
	 */
	public void setPerformances(ArrayList<Perform> performs) {
		this.performances = performs;
	}
	
	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 * adds a composition to the concert
	 */
	public void addComposition(Composition comp){
		// if the composition list doesn't exist, create it
		if (getCompositions() == null) setCompositions(new ArrayList<Composition>());
		
		// add the given composition to the list
		getCompositions().add(comp);
	}

	/**
	 * removes composition from a concert
	 */
	public void removeComposition(Composition comp){
		if (getCompositions() != null) {
			getCompositions().remove(comp);
		}
	}
	
	/**
	 * adds a performance to the concert
	 */
	public void addPerformance(Perform perf){
		// if the performance list doesn't exist, create it
		if (getPerformances() == null) setPerformances(new ArrayList<Perform>());
		
		getPerformances().add(perf);
	}

	/**
	 * removes performance from a concert
	 */
	public void removePerformance(Perform perf){
		if (getPerformances() != null) {
			getPerformances().remove(perf);
		}
	}
	
	/**
	 * Override method for toString()
	 */
	@Override
	public String toString() {
		return "Concert [conductor=" + conductor 
				+ ", compositions=" + compositions 
				+ ", performaces=" + performances + "]";
	}
		
		
	/* ATTRIBUTES--------------------------------------------------------*/
	
	/**
	 * represents a conductor of the concert
	 */
	private Conductor conductor;
	
	/**
	 * represents the list of compositions in the concert
	 */
	private ArrayList<Composition> compositions;
	
	/**
	 * list of compositions to be played by specific soloists
	 */
	private ArrayList<Perform> performances;	
	
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/

}
