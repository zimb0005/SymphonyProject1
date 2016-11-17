package symphony;

/**
 * this class represents a soloist in a symphony
 * @author Team 2
 *
 */
public class Soloist {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public Soloist(){
		super();
	}
	
	/**
	 * overloaded constructor
	 * @param speciality
	 */
	public Soloist(String speciality){
		super();
		this.specialty = speciality;
	}
	
	/* ACCESSORS	-----------------------------------------------------*/
	
	/**
	 * getter for specialty
	 * @return specialty
	 */
	public String getSpecialty() {
		return specialty;
	}

	/* MODIFIERS	-----------------------------------------------------*/
	
	/**
	 * setter for specialty
	 * @param specialty
	 */
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 * override method for toString()
	 */
	@Override
	public String toString() {
		return "Soloist [specialty=" + specialty + "]";
	}
		
	/* ATTRIBUTES--------------------------------------------------------*/
		
	/**
	 * musical specialty of the soloist
	 */
	private String specialty;
	
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/

}
