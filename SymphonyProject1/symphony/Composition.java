package symphony;

import java.util.ArrayList;

/**
 * this class represents a composition that can be played at a concert
 * @author Team 2
 */
public class Composition extends Id {

	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public Composition(){
		super();
		setMovements( new ArrayList<Movement>() ); // set empty array if none is given in constructor
	}
	
	public Composition(ArrayList<Movement> movements){
		super();
		setMovements(movements); // set array given in constructor
	}
	

	/* ACCESSORS	-----------------------------------------------------*/
	
	/**
	 * getter for movements
	 * @return ArrayList of movements included in the composition
	 */
	public ArrayList<Movement> getMovements() {
		return movements;
	}
		
	/* MODIFIERS	-----------------------------------------------------*/
	
	
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
		return "Composition [movements=" + movements + "]";
	}
			
	/* ATTRIBUTES--------------------------------------------------------*/
	
	/**
	 * represents an ArrayList of Movements in the composition
	 */
	private ArrayList<Movement> movements;		
		
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/
}
