package symphony;

/**
 * This class is used to implement the builder design pattern to create Address objects
 * @author Team 2
 *
 */

public class AddressBuilder {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	public AddressBuilder(){
		
		super();
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
	
	

		
	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	
	/**
	 * creates an Address object using the builder design
	 * @return Address object instantiated with the overloaded Address constructor using this builder object attribute values
	 */
	public Address build(){
		
		return new Address(this);
	}
	
	/**
	 * defines streetNum with param
	 * @param streetNum
	 * @return this instance of AddressBuilder
	 */
	public AddressBuilder streetNum (String streetNum){
		this.streetNum = streetNum;
		return this;
	}
	
	/**
	 * defines streetName with param
	 * @param streetName
	 * @return this instance of AddressBuilder
	 */
	public AddressBuilder streetName(String streetName){
		this.streetName = streetName;
		return this;
	}
	
	/**
	 * defines city with param
	 * @param city
	 * @return this instance of AddressBuilder
	 */
	public AddressBuilder city(String city){
		this.city = city;
		return this;
	}
	
	/**
	 * defines province with param
	 * @param province
	 * @return this instance of AddressBuilder
	 */
	public AddressBuilder province(String province){
		this.province = province;
		return this;
	}
	
	/**
	 * defines country with param
	 * @param country
	 * @return this instance of AddressBuilder
	 */
	public AddressBuilder country(String country){
		this.country = country;
		return this;
	}
	
	
	/**
	 * override method for toString()
	 */
	@Override
	public String toString() {
		return "AddressBuilder [streetNum=" + streetNum + ", streetName="
				+ streetName + ", city=" + city + ", province=" + province
				+ ", country=" + country + "]";
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
		
		
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/

}
