package symphony;

/**
 * ID System using Java Generics
 * @author imcalli
 *
 * @param <T> ID value to set.
 */
public class NewID<T> {
	
	
	
	/* CONSTRUCTORS	--------------------------------------------------	*/
	/**
	 * New ID Constructor.
	 * @param t ID to set.
	 */
	public NewID(T t) {
		setID(t);
	}
	
	
	
	/* ACCESSORS	-----------------------------------------------------	*/
	/**
	 * Method to get the ID value.
	 * @return ID value.
	 */
	public T getID() { return id; }
	
	
	
	/* MODIFIERS	-----------------------------------------------------	*/
	/**
	 * Method to set the ID value.
	 * @param t Value to set.
	 */
	public void setID(T t) { id = t; }
	
	
	/*	NORMAL BEHAVIOR -------------------------------------------------	*/
	/**
	 * Override method for toString()
	 */
	@Override
	public String toString() {
		return "Id [id=" + getID() + "]";
	}
	
	
	
	/* HELPER METHODS	--------------------------------------------------	*/
	
	
	
	/* ATTRIBUTES	-----------------------------------------------------	*/
	private T id;
	
	
	
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/
	 
	//THIS IS ONLY FOR DEVELOPMENT PURPOSES TO TEST THE CLASS IT IS NOT TO BE INCLUDED IN PROJECT
	public static void main(String[] args){
		NewID<Integer> id1 = new NewID<Integer>(1);
		NewID<String> id2 = new NewID<String>("Two");
		NewID<Boolean> id3 = new NewID<Boolean>(true);
		
		System.out.println("Testing NewID:");
		System.out.println("\tThis should equal 1: " + id1.getID());
		System.out.println("\tThis should say \"Two\": " + id2.getID());
		System.out.println("\tThis should be true: " + id3.getID());
	}
	
	
	
}	/*	End of CLASS:	NewID.java			*/
