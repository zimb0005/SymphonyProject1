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
	public Concert(){
		super();
	}
	
	public Concert(Conductor conductor,ArrayList<Composition> compositions,ArrayList<Perform> performs){
		super();
		this.compositions = compositions;
		this.conductor = conductor;
		this.performs = performs;
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
	public ArrayList<Perform> getPerfoms() {
		return performs;
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
	public void setPerforms(ArrayList<Perform> performs) {
		this.performs = performs;
	}
	
	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 * adds a composition to the concert
	 */
	public void addComposition(){
		
		//*****:TODO********
	}

	/**
	 * removes composition from a concert
	 */
	public void removeComposition(){
		
		//*****:TODO********
	}
	
	/**
	 * adds a conductor to the concert
	 */
	public void addConductor(){
		
		//*****:TODO********
	}

	/**
	 * removes conductor from a concert
	 */
	public void removeConductor(){
		
		//*****:TODO********
	}
	
	/**
	 * adds a performance to the concert
	 */
	public void addPerform(){
		
		//*****:TODO********
	}

	/**
	 * removes performance from a concert
	 */
	public void removePerformance(){
		
		//*****:TODO********
	}
	
	/**
	 * Override method for toString()
	 */
	@Override
	public String toString() {
		return "Concert [conductor=" + conductor 
				+ ", compositions=" + compositions + "]";
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
	private ArrayList<Perform> performs;	
	
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/

}
