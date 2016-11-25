package symphony;

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
	
	/* ENTRY POINT for STAND-ALONE OPERATION ---------------------------*/
	 
		//THIS IS ONLY FOR DEVELOPMENT PURPOSES TO TEST THE CLASS IT IS NOT TO BE INCLUDED IN PROJECT
		public static void main(String[] args){
			
			for(int i =0; i<5;i++){
				Id id = new Id();
				System.out.println(id.toString());
			}
			
			
		}

}
