package symphony;

import java.util.ArrayList;
import java.util.Date;

/**
 * this class associates a soloist, with a composition and a date performed to record a performance
 * @author Team 2
 *
 */
public class Perform {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * default constructor
	 */
	public Perform(){
		super();
	}
	
	/**
	 * overloaded constructor
	 */
	public Perform(Soloist soloist,Composition composition){
		this.soloist = soloist;
		this.composition = composition;
//		this.datePerformed = datePerformed;
	}
	/* ACCESSORS	-----------------------------------------------------*/
	
	/**
	 * getter for soloist
	 * @return soloist
	 */
	public Soloist getSoloist() {
		return soloist;
	}
	
	/**
	 * getter for soloist name
	 * @return the name of the soloist
	 */
	public Name getSoilistName(){
		return soloist.getName();
	}
	/**
	 * getter for the soloist address
	 * @return the address of the soloist as a string
	 */
	public String getSoloistAddress(){
		return soloist.getAddress().toString();
	}
	
	/**
	 * getter for the soloist phone number
	 * @return soloist phone number
	 */
	public String getSoloistPhone(){
		return soloist.getPhoneNumber().getPhoneNum();
	}
	
	/**
	 * getter for the soloist specialty
	 * @return soloist specialty
	 */
	public String getSoloistSpecialty(){
		return soloist.getSpecialty();
	}
	
	public int getSoloistid(){
		return soloist.getId();
	}
	
	/**
	 * getter for composition
	 * @return composition
	 */
	public Composition getComposition() {
		return composition;
	}
	/**
	 * getter to get the movements from the composition
	 * @return movements
	 */
	public ArrayList<Movement> getCompositionMovements(){
		return composition.getMovements();
	}
	/**
	 * getter to get the composition ID
	 * @return composition id
	 */
	public int getCompositionid(){
		return composition.getId();
	}
	
	

//	/**
//	 * getter for datePerformed
//	 * @return datePerformed
//	 */
//	public Date getDatePerformed() {
//		return datePerformed;
//	}

	/* MODIFIERS	-----------------------------------------------------*/
	
	/**
	 * setter for composition
	 * @param composition
	 */
	public void setComposition(Composition composition) {
		this.composition = composition;
	}
	
	/**
	 * setter for soloist
	 * @param soloist
	 */
	public void setSoloist(Soloist soloist) {
		this.soloist = soloist;
	}
	
//	/**
//	 * setter for datePerformed
//	 * @param datePerformed
//	 */
//	public void setDatePerformed(Date datePerformed) {
//		this.datePerformed = datePerformed;
//	}
	
	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 * Override method for toString
	 */
	@Override
	public String toString() {
		return "Perform [soloist=" + soloist + ", composition=" + composition
				+ "]";
	}
		
	/* ATTRIBUTES--------------------------------------------------------*/
	
	/**
	 * soloist associated with the performance
	 */
	private Soloist soloist;
	
	/**
	 * composition performed by soloist
	 */
	private Composition composition;
	
//	/**
//	 * date that soloist last performed the composition
//	 */
//	private Date datePerformed;
		
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/

}
