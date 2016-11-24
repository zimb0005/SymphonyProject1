package symphony;

/**
 * this class represents people involved in the symphony
 * @author Team2
 *
 */
public class Musician extends Id {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public Musician(){
		super();
	}
	

	/* ACCESSORS	-----------------------------------------------------*/
	
	/**
	 * getter for name
	 * @return object representing name of musician
	 */
	public Name getName() {
		return name;
	}
	
	/**
	 * getter for address
	 * @return object representing address of musician
	 */
	public Address getAddress() {
		return address;
	}
	
	/**
	 * getter for phoneNumber
	 * @return object representing phone number of musician
	 */
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}
	
	
	/* MODIFIERS	-----------------------------------------------------*/
	
	/**
	 * setter for name
	 * @param name
	 */
	public void setName(Name name) {
		this.name = name;
	}
	
	/**
	 * setter for address
	 * @param address
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	
	/**
	 * setter for phoneNumber
	 * @param phoneNumber
	 */
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	

	/* NORMAL BEHAVIOR -------------------------------------------------*/
	/**
	 * Override method for toString()
	 */
	@Override
	public String toString() {
		return "Musician [name=" + name + ", address=" + address
				+ ", phoneNumber=" + phoneNumber  + "]";
	}	
		
	/* ATTRIBUTES--------------------------------------------------------*/
	
	/**
	 * name of musician	
	 */
	private Name name;
	/**
	 * address of musician
	 */
	private Address address;
	/**
	 * phone number of musician
	 */
	private PhoneNumber phoneNumber;
	
		
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/

}
