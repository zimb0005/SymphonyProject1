package test_symphony;

import junit.framework.*;
import java.util.ArrayList;
import java.util.Date;

import symphony.Composition;
import symphony.Concert;
import symphony.Conductor;
import symphony.Movement;
import symphony.Perform;
import symphony.Soloist;


//robert
public class Test_Concert extends TestCase{

	public Test_Concert(String name){
		super(name);
	}
	
	public static Test suite() {
		return new TestSuite(Test_Concert.class);
	}

	protected void setUp() throws Exception {
		System.out.println("Test_" + name + " Begin");
		concert = new Concert();
		conductor = new Conductor();
		performs = new ArrayList<Perform>();
		movements = new ArrayList<Movement>();
		compositions = new ArrayList<Composition>();
		Movement m1 = new Movement("D Major",1);
		Movement m2 = new Movement("C Minor",2);
		movements.add(m1);
		movements.add(m2);
		Date date = new Date();
		Soloist soloist = new Soloist("Flute");
		composition = new Composition(movements);
		compositions.add(composition);
		perform = new Perform(soloist,composition,date);
		performs.add(perform);
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_" + name + " End");
		concert = null;
	}
	/**
 	 * Test the constructors.
 	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_" + name + ".testConstructors");
		assertNotNull("\t\tTest_" + name + ".testConstructors: " + name + " is null", concert);
	}
	/**
	 * Test the accessors.
	 */
	public void testAccessors() {
		testMutators();
		System.out.println("\tExecuting Test_" + name + ".testAccessors");
		concert.getConductor();
		assertNotNull("\t\tTest_" + name + ".testAccessors: " + name + ".getConductor: is null", concert.getConductor());
		concert.getCompositions();
		assertNotNull("\t\tTest_" + name + ".testAccessors: " + name + ".getCompositions is null", concert.getCompositions());
		concert.getPerformances();
		assertNotNull("\t\tTest_" + name + ".testAccessors: " + name + ".getPerformances is null", concert.getPerformances());
		assertNotNull("\t\tTest_" + name + ".testAccessors: " + name + " is null", concert);
		System.out.println("\t" + concert.toString());
	}

	/**
	 * Test the mutators/modifiers.
	 */
	public void testMutators() {
		System.out.println("\tExecuting Test_" + name + ".testMutators");
		concert.setPerformances(performs);
		concert.setConductor(conductor);
		concert.setCompositions(compositions);
		assertNotNull("\t\tTest_" + name + ".testMutators: " + name + " is null", concert);
	}

	/**
	 * Test behaviors.
	 */
	public void testBehaviors() {
		System.out.println("\tExecuting Test_" + name + ".testBehaviors");
		assertNotNull("\t\tTest_" + name + ".testBehaviors: " + name + " is not null", concert);
		
		System.out.println("\tExecuting Test_" + name + ".testBehaviors: " + name + ".toString");
		System.out.println(concert.toString());
		assertTrue("\t\t" + name + ".toString: " + name + ".toString is blank", (concert.toString() != ""));
		
		System.out.println("\tExecuting Test_" + name + ".testBehaviors: " + name + ".addComposition");
		concert.addComposition(composition);
		assertTrue("\t\t" + name + ".addComposition: " + name + ".addComposition is not null", concert.getCompositions() != null);
		
		System.out.println("\tExecuting Test_" + name + ".testBehaviors: " + name + ".removeComposition");
		concert.removeComposition(composition);
		assertTrue("\t\t" + name + ".removeComposition: " + name + ".removeComposition is not null", concert.getCompositions() != null);
		
		System.out.println("\tExecuting Test_" + name + ".testBehaviors: " + name + ".addPerformance");
		concert.addPerformance(perform);
		assertTrue("\t\t" + name + ".addPerformance: " + name + ".addPerformance is not null", concert.getPerformances() != null);
		
		System.out.println("\tExecuting Test_" + name + ".testBehaviors: " + name + ".removePerformance");
		concert.removePerformance(perform);
		assertTrue("\t\t" + name + ".removePerformance: " + name + ".removePerformance is not null", concert.getPerformances() != null);
	}
	/* STAND-ALONE ENTRY POINT ----------------------------------------- */
	/**
	 * Main line for stand-alone operation.
	 * 
	 * @param args
	 *            Standard string command line parameters.
	 */
	public static void main(String[] args) {
		System.out.println("Executing Test_Concert suite");
		junit.textui.TestRunner.run(suite());
	}

	/* ATTRIBUTES ----------------------------------------------- */
	private Concert concert = null;
	private Conductor conductor = null;
	private Composition composition = null;
	private Perform perform = null;
	private ArrayList<Perform> performs = null;
	private ArrayList<Movement> movements = null;
	private ArrayList<Composition> compositions = null;
	private static String name = "Concert";
}
