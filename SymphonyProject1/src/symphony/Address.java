package symphony;

/**
 * This class represents the full address of an object
 * @author Team 2
 *
 */

public class Address {
	
/* CONSTRUCTORS	-----------------------------------------------------*/
	/**
	 * default constructor
	 */
	public Address(){
		super();
	}
	/**
	 * overloaded constructor accepts a AddressBuilder Object to use a builder design
	 * @param builder
	 */
	public Address(AddressBuilder builder){
		super();
		this.city = builder.getCity();
		this.country = builder.getCountry();
		this.province = builder.getProvince();
		this.streetName = builder.getStreetName();
		this.streetNum = builder.getStreetNum();
	}

/* ACCESSORS	-----------------------------------------------------*/
	
	/**
	 * getter for streetNum
	 * @return string representing street number
	 */
	public String getStreetNum() {
		return streetNum;
	}
	/**
	 * getter for streetName
	 * @return String representing the name of the street
	 */
	public String getStreetName() {
		return streetName;
	}
	/**
	 * getter for city
	 * @return string representing the name of city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * getter for province
	 * @return string representing name of province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * getter for country
	 * @return string representing name of country
	 */
	public String getCountry() {
		return country;
	}
	

/* MODIFIERS	-----------------------------------------------------*/
	
	/**
	 * setter for streetNum
	 * @param streetNum
	 */
	public void setStreetNum(String streetNum) {
		this.streetNum = streetNum;
	}
	/**
	 * setter for streetName
	 * @param streetName
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	/**
	 * setter for city
	 * @param city
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * setter for province
	 * @param province
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	
	/**
	 * setter for country
	 * @param country
	 */
	public void setCountry(String country) {
		this.country = country;
	}

/*	NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 * override method for toString()
	 */
	@Override
	public String toString() {
		return "Address [streetNum=" + streetNum + ", streetName=" + streetName
				+ ", city=" + city + ", province=" + province + ", country="
				+ country + "]";
	}
	
	
	
/* ATTRIBUTES--------------------------------------------------------*/
	/**
	 * street number
	 */
	private String streetNum;
	/**
	 * street name
	 */
	private String streetName;
	/**
	 * city
	 */
	private String city;
	/**
	 * province
	 */
	private String province;
	/**
	 * country
	 */
	private String country;
	
	
/*	ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/
	

}
