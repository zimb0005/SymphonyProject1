package symphony;

/**
 * this class is used to store the name of objects representing people
 * @author Team 2
 *
 */
public class Name {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public Name(){
		super();
	}
	
	/**
	 * overloaded constructor
	 * @param fname
	 * @param lname
	 */
	public Name(String fname, String lname){
		super();
		firstName  = fname;
		lastName = lname;
	}

	/* ACCESSORS	-----------------------------------------------------*/
		
	/**
	 * getter for firstName
	 * @return first name
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * getter for lastName
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}

	/* MODIFIERS	-----------------------------------------------------*/
	
	/**
	 * setter for firstName
	 * @param fName
	 */
	public void setFirstName(String fName) {
		firstName = fName;
	}
	
	/**
	 * setter for lastName
	 * @param lName
	 */
	public void setLastName(String lName) {
		lastName = lName;
	}

	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 * Override method for toString()
	 */
	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	/* ATTRIBUTES--------------------------------------------------------*/
	
	/**
	 * first name
	 */
	private String firstName;
	
	/**
	 * last name
	 */
	private String lastName;
		
		
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/

}
