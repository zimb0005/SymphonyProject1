package test_symphony;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import symphony.Movement;

/**
 * JUnit 4 Test Case for the Movement class in the symphony package.
 * @author imcalli
 *
 */
public class Test_Movement {

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
		movement = new Movement();
		assertNotNull("\t\t" + TEST_NAME + ".testConstructors: Movement is null", movement);
		
		// constructor with parameters
		movement = new Movement("Sonata in C# Minor", 1);
		assertNotNull("\t\t" + TEST_NAME + ".testConstructors: Movement is null", movement);
		
		// test that the data was set
		assertEquals("\t\t" + TEST_NAME + ".testConstructors: Name was set", "Sonata in C# Minor", movement.getName());
		assertEquals("\t\t" + TEST_NAME + ".testConstructors: Number was set", 1, movement.getNumber());
	}
	
	/**
	 * Test the accessors.
	 */
	@Test
	public void testAccessors() {
		String TEST_BLOCK = ".testAccessors";
		System.out.println("\tExecuting " + TEST_NAME + TEST_BLOCK);
		
		// constructor with parameters
		movement = new Movement("Sonata in C# Minor", 1);
		assertNotNull("\t\t" + TEST_NAME + TEST_BLOCK + ": Movement is null", movement);
		
		// test that the data was set
		assertEquals("\t\t" + TEST_NAME + TEST_BLOCK + ": Name was set", "Sonata in C# Minor", movement.getName());
		assertEquals("\t\t" + TEST_NAME + TEST_BLOCK + ": Number was set", 1, movement.getNumber());
	}
	
	/**
	 * Test the mutators/modifiers.
	 */
	@Test
	public void testMutators() {
		String TEST_BLOCK = ".testMutators";
		System.out.println("\tExecuting " + TEST_NAME + TEST_BLOCK);
		
		// constructor with parameters
		movement = new Movement("Sonata in C# Minor", 1);
		assertNotNull("\t\t" + TEST_NAME + TEST_BLOCK + ": Movement is null", movement);
		
		// test that the data was set
		assertEquals("\t\t" + TEST_NAME + TEST_BLOCK + ": Name was set", "Sonata in C# Minor", movement.getName());
		assertEquals("\t\t" + TEST_NAME + TEST_BLOCK + ": Number was set", 1, movement.getNumber());
		
		// modify name
		movement.setName("Minuet in D");
		assertEquals("\t\t" + TEST_NAME + TEST_BLOCK + ": Name was changed", "Minuet in D", movement.getName());
		
		// modify number
		movement.setNumber(2);
		assertEquals("\t\t" + TEST_NAME + TEST_BLOCK + ": Number was changed", 2, movement.getNumber());
		
		// modify date performed
		Calendar cal = Calendar.getInstance();
		cal.set(1990, 7, 28); // using my birthday as a test date :) (7 is august cause months start at 0?) -ian
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		movement.setDatePerformed( cal.getTime() );
		
		assertEquals(
			"\t\t" + TEST_NAME + TEST_BLOCK + ": Date performed was changed",
			"1990-08-28",
			sdf.format(movement.getDatePerformed())
		);
	}
	
	/**
	 * Test behaviours.
	 */
	@Test
	public void testBehaviours() {
		String TEST_BLOCK = ".testBehaviours";
		System.out.println("\tExecuting " + TEST_NAME + TEST_BLOCK);
		
		// constructor with parameters
		movement = new Movement("Sonata in C# Minor", 1);
		assertNotNull("\t\t" + TEST_NAME + TEST_BLOCK + ": Movement is null", movement);
		
		// test toString
		assertEquals(
			"\t\t" + TEST_NAME + TEST_BLOCK + ": ToString output is ok",
			"Movement [number=1, name=Sonata in C# Minor]",
			movement.toString()
		);
	}

	
	
	/* ATTRIBUTES	-----------------------------------------------	*/
	/** Movement object to use during testing. */
	private Movement movement = null;
	
	/** Extract this test's name for use in console output. */
	private final String TEST_NAME = this.getClass().getSimpleName();
}
