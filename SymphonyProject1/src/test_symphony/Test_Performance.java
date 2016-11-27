package test_symphony;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import symphony.Address;
import symphony.Composition;
import symphony.Movement;
import symphony.Name;
import symphony.Performance;
import symphony.PhoneNumber;
import symphony.Soloist;
/**
 * this class test the performance class
 * @author team 2
 *
 */
public class Test_Performance extends TestCase{
	public Test_Performance(String name) {
		super(name);
	}

	public static Test suite() {
		return new TestSuite(Test_Performance.class);
	}
	
	protected void setUp() throws Exception {
		System.out.println("Test_Perform Begin");
		c = new Composition();
		s = new Soloist();
		perform = new Performance();
		d = new Date();
	}

	protected void tearDown() throws Exception {
		System.out.println("Test_Perform End"); 
		c = null;
		s = null;
		d = null;
		perform = null;
		
	}
	
	/**
	 * Test the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_Perform.testConstructors");
		assertNotNull("\tTest_Perform.testConstructors: Perform is null", perform);

	}
	/**
	 * Test the accessors.
	 * 
	 * @throws ParseException
	 */
	public void testAccessors() throws ParseException {
		System.out.println("\tExecuting Test_Perform.testAccessors");
		perform.setComposition(c);
		perform.setdatePerformed(d);
		perform.setSoloist(s);
		assertEquals(perform.getSoloist(),s);
		assertEquals(perform.getDatePerformed(),d);
		assertEquals(perform.getComposition(),c);
	}

	/**
	 * Test the mutators/modifiers.
	 * @throws ParseException 
	 */
	
	public void testMutators() throws ParseException {
		System.out.println("\tExecuting Test_Perform.testMutators");
		perform.setComposition(c);
		perform.setdatePerformed(d);
		perform.setSoloist(s);
		assertEquals(perform.getSoloist(),s);
		assertEquals(perform.getDatePerformed(),d);
		assertEquals(perform.getComposition(),c);
	}

	/**
	 * Test behaviors.
	 */
	public void testBehaviors() throws ParseException{
		System.out.println("\tExecuting Test_Perform.testBehaviors");
		assertEquals("Perform [soloist=null, composition=null]",perform.toString());
	}

	/* STAND-ALONE ENTRY POINT ----------------------------------------- */
	/**
	 * Main line for stand-alone operation.
	 * 
	 * @param args
	 *            Standard string command line parameters.
	 */
	public static void  main(String[] args) {
		System.out.println("Executing Test_Perform suite");
		junit.textui.TestRunner.run(suite());
		
	}
	private Composition c;
	private Soloist s;
	private Performance perform;
	private Date d;
}
