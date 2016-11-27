package symphony;

import java.util.Date;

/**
 * this class represents movement that are contained in compositions
 * @author Team 2
 *@version 1.0.0	November 2016
 */
public class Movement {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public Movement(){
		super();
	}
	
	/**
	 * overloaded constructor
	 */
	public Movement(String name, int number){
		super();
		this.name = name;
		this.number = number;
	}
	
	/* ACCESSORS	-----------------------------------------------------*/
	
	/**
	 * getter for number
	 * @return number of movement
	 */
	public int getNumber() {
		return number;
	}
	
	/**
	 * getter for name
	 * @return name of movement
	 */
	public String getName() {
		return name;
	}
	
	/* MODIFIERS	-----------------------------------------------------*/
	
	/**
	 * setter for number
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}	
	
	/**
	 * setter for name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 * Override method for toString()
	 */
	@Override
	public String toString() {
		return "Movement [number=" + number + ", name=" + name + "]";
	}
		
	/* ATTRIBUTES--------------------------------------------------------*/
	
	/**
	 * number of movement given by composer
	 */
	private int number;
	
	/**
	 * name of movement given by composer
	 */
	private String name;

}
