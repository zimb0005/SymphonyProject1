package symphony;

import java.util.ArrayList;

/**
 * this class represents a composition that can be played at a concert
 * @author Team 2
 */
public class Composition {

	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public Composition(){
		super();
	}
	
	public Composition(ArrayList<Movement> movements){
		super();
		this.movements = movements;
	}
	

	/* ACCESSORS	-----------------------------------------------------*/
	
	/**
	 * getter for id
	 * @return Id with an id number
	 */
	public Id getId() {
		return id;
	}
	
	/**
	 * getter for movements
	 * @return ArrayList of movements included in the composition
	 */
	public ArrayList<Movement> getMovements() {
		return movements;
	}
		

	/* MODIFIERS	-----------------------------------------------------*/
	
	/**
	 * Setter for id
	 * @param id
	 */
	public void setId(Id id) {
		this.id = id;
	}
	
	/**
	 * setter for movements 
	 * @param movements
	 */
	public void setMovements(ArrayList<Movement> movements) {
		this.movements = movements;
	}

	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 *Override method for toString() 
	 */
	@Override
	public String toString() {
		return "Composition [id=" + id + ", movements=" + movements + "]";
	}
			
	/* ATTRIBUTES--------------------------------------------------------*/
	/**
	 * unique id for the composition
	 */
	private Id id = new Id();
	
	/**
	 * represents an ArrayList of Movements in the composition
	 */
	private ArrayList<Movement> movements;		
		
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/
}
