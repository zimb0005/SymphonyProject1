package symphony;

/**this class is of singleton design used by the Id class to generate a unique id
 * @author Team 2
 *@version 1.0.0	November 2016
 */
public class IdGenerator {
	
	/* CONSTRUCTORS	-----------------------------------------------------*/
	
	/**
	 * private constructor used for singleton design
	 */
	private IdGenerator(){
		super();
		nextId = 1;
	}
	
	/* NORMAL BEHAVIOR -------------------------------------------------*/
	
	/**
	 * static method used to return an incrementing id integer to Id class
	 * @return integer used as id
	 */
	public static int generateID(){
		
		 return instance.nextId++;
	}
		
	/* ATTRIBUTES--------------------------------------------------------*/
	
	/**
	 * instance of idGenerator used in singleton design pattern
	 */
	private static IdGenerator instance = new IdGenerator();
	
	/**
	 * id number that is incremented by one each time it is returned to the Id class
	 */
	private int nextId;
	

}
