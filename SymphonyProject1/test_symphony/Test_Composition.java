package test_symphony;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import symphony.Composition;
import symphony.Movement;

/**
 * JUnit 4 Test Case for the Composition class in the symphony package.
 * @author imcalli
 *
 */
public class Test_Composition {

	@Before	public void setUp() throws Exception { System.out.println("" + TEST_NAME + " Begin"); }
	@After public void tearDown() throws Exception { System.out.println("" + TEST_NAME + " End"); }

	/**
	 * Test the constructors.
	 */
	@Test
	public void testConstructors() {
		String TEST_BLOCK = ".testConstructors";
		System.out.println("\tExecuting " + TEST_NAME + TEST_BLOCK);
		
		// default constructor
		composition = new Composition();
		assertNotNull("\t\t" + TEST_NAME + TEST_BLOCK + ": Composition created", composition);
		
		// constructor with parameters
		ArrayList<Movement> movementList = new ArrayList<Movement>();
		Movement movement = new Movement("TestMovement", 1);
		movementList.add(movement);
		
		composition = new Composition( movementList );
		assertNotNull("\t\t" + TEST_NAME + TEST_BLOCK + ": Composition is null", composition);
	}
	
	/**
	 * Test the accessors.
	 */
	@Test
	public void testAccessors() {
		String TEST_BLOCK = ".testAccessors";
		System.out.println("\tExecuting " + TEST_NAME + TEST_BLOCK);
		
		// constructor with parameters
		ArrayList<Movement> movementList = new ArrayList<Movement>();
		Movement movement = new Movement("TestMovement", 1);
		movementList.add(movement);
		
		composition = new Composition( movementList );
		assertNotNull("\t\t" + TEST_NAME + TEST_BLOCK + ": Composition is null", composition);
		
		// test getMovements accessor
		movementList = composition.getMovements();
		assertNotNull("\t\t" + TEST_NAME + TEST_BLOCK + ": Movement list is null", movementList);
		assertEquals("\t\t" + TEST_NAME + TEST_BLOCK + ": List contains 1 movement", 1, movementList.size());
		assertNotNull("\t\t" + TEST_NAME + TEST_BLOCK + ": Movement exists", movementList.get(0));
		
	}
	
	/**
	 * Test the mutators/modifiers.
	 */
	@Test
	public void testMutators() {
		String TEST_BLOCK = ".testMutators";
		System.out.println("\tExecuting " + TEST_NAME + TEST_BLOCK);
		
		// default constructor
		composition = new Composition();
		assertNotNull("\t\t" + TEST_NAME + TEST_BLOCK + ": Composition created", composition);
		
		// test setMovements mutator
		ArrayList<Movement> movementList = new ArrayList<Movement>();
		Movement movement = new Movement("TestMovement", 1);
		movementList.add(movement);
		composition.setMovements(movementList);
		
		// test that the data was set
		assertNotNull("\t\t" + TEST_NAME + TEST_BLOCK + ": Movement list was set", composition.getMovements());
		assertEquals("\t\t" + TEST_NAME + TEST_BLOCK + ": Movement list contains 1 movement", 1, composition.getMovements().size());
		Movement test = composition.getMovements().get(0);
		assertNotNull("\t\t" + TEST_NAME + TEST_BLOCK + ": Movement obtained", test);
		assertEquals("\t\t" + TEST_NAME + TEST_BLOCK + ": Movement name is correct", "TestMovement", test.getName());
		assertEquals("\t\t" + TEST_NAME + TEST_BLOCK + ": Movement number is correct", 1, test.getNumber());
	}
	
	
	
	/* ATTRIBUTES	-----------------------------------------------	*/
	/** Composition object to use during testing. */
	private Composition composition = null;
	
	/** Extract this test's name for use in console output. */
	private final String TEST_NAME = this.getClass().getSimpleName();
}
