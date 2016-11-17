package symphony;

/**
 * class represents a phone number 
 * @author Team 2
 *
 */
public class PhoneNumber {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public PhoneNumber(){
		super();
	}
	
	/**
	 * overloaded constructor
	 */
	public PhoneNumber(String phoneNum){
		super();
		this.phoneNum = phoneNum;
	}

	/* ACCESSORS	-----------------------------------------------------*/
	
	/**
	 * getter for phoneNum
	 * @return phone number
	 */ 
	public String getPhoneNum() {
		return phoneNum;
	}

	/* MODIFIERS	-----------------------------------------------------*/
	
	/**
	 * setter for phoneNum
	 * @param phoneNum
	 */
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	/* NORMAL BEHAVIOR -------------------------------------------------*/
		
	/**
	 * override method for toString()
	 */
	@Override
	public String toString() {
		return "PhoneNumber [phoneNum=" + phoneNum + "]";
	}
		
	/* ATTRIBUTES--------------------------------------------------------*/
	
	/**
	 * phone number
	 */
	private String phoneNum;

	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/

}
