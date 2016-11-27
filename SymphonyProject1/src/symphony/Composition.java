package symphony;

import java.util.ArrayList;

/**
 * this class represents a composition that can be played at a concert
 * @author Team 2
 * @version 1.0.0	November 2016
 */
public class Composition extends Id {

	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public Composition(){
		setMovements( new ArrayList<Movement>() ); // set empty array if none is given in constructor
	}
	/**
	 * overloaded constructor
	 * @param movements
	 */
	public Composition(ArrayList<Movement> movements){
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
	/**
	 * add a movement to the arraylist
	 * @param movement
	 */
	public void addMovement(Movement movement){
		movements.add(movement);
	}
	/**
	 * removes movement from array with specified movement number
	 * @param number
	 */
	public void removeMovement(int number){
		for(Movement m:movements){
			if(m.getNumber() == number ){
				movements.remove(m);
			}
			break;
		}
	}
			
	/* ATTRIBUTES--------------------------------------------------------*/
	
	/**
	 * represents an ArrayList of Movements in the composition
	 */
	private ArrayList<Movement> movements;		
		
}
