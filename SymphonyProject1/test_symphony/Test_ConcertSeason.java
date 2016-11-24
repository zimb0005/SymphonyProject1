package test_symphony;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import symphony.Concert;
import symphony.ConcertSeason;

/**
 * JUnit 4 Test Case for the ConcertSeason class in the symphony package.
 * @author imcalli
 *
 */
public class Test_ConcertSeason {

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
		concertSeason = new ConcertSeason();
		assertNotNull("\t\t" + TEST_NAME + TEST_BLOCK + ": ConcertSeason created", concertSeason);
		
		// constructor with parameters
		Calendar cal = Calendar.getInstance();
		cal.set(1990, 7, 28); // using my birthday as a test date :) (7 is august cause months start at 0?) -ian
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		concertSeason = new ConcertSeason( cal.getTime(), 1 );
		assertNotNull("\t\t" + TEST_NAME + TEST_BLOCK + ": ConcertSeason created", concertSeason);
	}
	
	/**
	 * Test the accessors.
	 */
	@Test
	public void testAccessors() {
		String TEST_BLOCK = ".testAccessors";
		System.out.println("\tExecuting " + TEST_NAME + TEST_BLOCK);
		
		// constructor with parameters
		Calendar cal = Calendar.getInstance();
		cal.set(1990, 7, 28); // using my birthday as a test date :) (7 is august cause months start at 0?) -ian
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		concertSeason = new ConcertSeason( cal.getTime(), 1 );
		assertNotNull("\t\t" + TEST_NAME + TEST_BLOCK + ": ConcertSeason created", concertSeason);
		
		// test getOpeningDate()
		assertEquals(
			"\t\t" + TEST_NAME + TEST_BLOCK + ": Opening date retrieved",
			"1990-08-28",
			sdf.format(concertSeason.getOpeningDate())
		);
		
		// test getLengthInDays()
		assertEquals("\t\t" + TEST_NAME + TEST_BLOCK + ": Opening date retrieved", 1, concertSeason.getLengthInDays());
		
		// add concert list for the next test
		concertSeason.setConcerts( new ArrayList<Concert>() );
		
		// test getConcerts()
		assertNotNull("\t\t" + TEST_NAME + TEST_BLOCK + ": Concert list acquired", concertSeason.getConcerts());
		
	}
	
	/**
	 * Test the mutators/modifiers.
	 */
	@Test
	public void testMutators() {
		String TEST_BLOCK = ".testMutators";
		System.out.println("\tExecuting " + TEST_NAME + TEST_BLOCK);
		
		//
	}
	
	/* ATTRIBUTES	-----------------------------------------------	*/
	/** ConcertSeason object to use during testing. */
	private ConcertSeason concertSeason = null;
	
	/** Extract this test's name for use in console output. */
	private final String TEST_NAME = this.getClass().getSimpleName();
}
