package symphony;

/**
 * this class is of singleton design used by the Id class to generate a unique
 * id
 * 
 * @author Team 2
 *
 */
public class IdGenerator {

	/* CONSTRUCTORS ----------------------------------------------------- */

	/**
	 * private constructor used for singleton design
	 */
	public IdGenerator() {
		super();
		nextId = 1;
	}

	/* ACCESSOR --------------------------------------------------------- */
	public static IdGenerator getInstance() {
		return instance;
	}

	public int getNextId() {
		return nextId;
	}

	/* MODIFIER ---------------------------------------------------------- */
	public static void setInstance(IdGenerator instance) {
		IdGenerator.instance = instance;
	}

	public void setNextId(int nextId) {
		this.nextId = nextId;
	}
	/* NORMAL BEHAVIOR ------------------------------------------------- */

	/**
	 * static method used to return an incrementing id integer to Id class
	 * 
	 * @return integer used as id
	 */
	public static int generateID() {

		return instance.nextId++;
	}

	/* ENTRY POINT for STAND-ALONE OPERATION --------------------------- */
	// THIS IS ONLY FOR DEVELOPMENT PURPOSES TO TEST THE CLASS IT IS NOT TO BE
	// INCLUDED IN THE PROJECT
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			int id = IdGenerator.generateID();
			System.out.println(id);
		}

	}
	/* ATTRIBUTES-------------------------------------------------------- */

	/**
	 * instance of idGenerator used in singleton design pattern
	 */
	private static IdGenerator instance = new IdGenerator();

	/**
	 * id number that is incremented by one each time it is returned to the Id
	 * class
	 */
	private int nextId;

}
