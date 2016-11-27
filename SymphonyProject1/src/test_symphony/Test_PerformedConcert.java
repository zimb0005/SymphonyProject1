package test_symphony;


import java.util.Date;
import junit.framework.*;
import symphony.PerformedConcert;
import symphony.Venue;

/**
 * this class test the PerformedConcert class in the symphony package
 * @author team 2
 * @version	1.0.0	November 2016
 *
 */
public class Test_PerformedConcert extends TestCase{

	public Test_PerformedConcert(String name){
		super(name);
	}
	
	public static Test suite() {
		return new TestSuite(Test_PerformedConcert.class);
	}

	protected void setUp() throws Exception {
		System.out.println("Test_PerformedConcert Begin");
		p = new PerformedConcert();
		d = new Date();
		p2 = new PerformedConcert(d,v);
		v = new Venue();
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_PerformedConcert End");
		p = null;
		p2 = null;
		d = null;
		v = null;
	}
	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_PerformedConcert.testConstructors");
		assertNotNull(p);
		assertNotNull(p2);
	}
	/**
	 * Test the accessors.
	 */
	public void testAccessors() {
		System.out.println("\tExecuting Test_PerformedConcert.testAccessors");
		p.setDatePerformed(d);
		p.setVenue(v);
		assertEquals(p.getDatePerformed(),d);
		assertEquals(p.getVenue(),v);
	}

	/**
	 * Test the mutators/modifiers.
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_PerformedConcert.testMutators");
		p.setDatePerformed(d);
		p.setVenue(v);
		assertEquals(p.getDatePerformed(),d);
		assertEquals(p.getVenue(),v);
	}

	/**
	 * Test behaviors.
	 */
	public void testBehaviors() {
		System.out.println("\tExecuting Test_PerformedConcert.testBehaviors");
		assertEquals("PerformedConcert [datePerformed=null, venue=null]",p.toString());
	}
	/* STAND-ALONE ENTRY POINT ----------------------------------------- */
	/**
	 * Main line for stand-alone operation.
	 * 
	 * @param args
	 *            Standard string command line parameters.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_PerformedConcert suite");
		junit.textui.TestRunner.run(suite());
	}

	/* ATTRIBUTES ----------------------------------------------- */
	private PerformedConcert p;
	private PerformedConcert p2;
	private Date d;
	private Venue v;
	
}
