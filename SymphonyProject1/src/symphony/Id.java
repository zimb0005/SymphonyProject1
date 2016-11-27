package symphony;
/**
 * this class represents an id that children class will inheret from
 * @author Team 2
 *@version 1.0.0	November 2016
 */
public class Id {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public Id(){
		super();
		this.generateId();
		
	}
	
	/* ACCESSORS	-----------------------------------------------------*/
	
	/**
	 * getter for id
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/* MODIFIERS	-----------------------------------------------------*/
	
	/**
	 * setter for id
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 * uses IdGenerator to generate a new id
	 */
	private void generateId(){
		
		id = IdGenerator.generateID();
	}
	
	/**
	 * Override method for toString()
	 */
	@Override
	public String toString() {
		return "Id [id=" + id + "]";
	}
		
	/* ATTRIBUTES--------------------------------------------------------*/
	
	/**
	 * identification number
	 */
	 private int id;
	

}
