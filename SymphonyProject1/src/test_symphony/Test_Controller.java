package test_symphony;

import symphony.Concert;
import symphony.ConcertSeason;
import symphony.Controller;
import symphony.SampleData;
import junit.framework.*;
/**
 * this class tests the Address class in symphony package
 * @author Team 2
 *@version 1.0.0	November 2016
 */

public class Test_Controller extends TestCase {
	
		public Test_Controller(String name) { super(name);	}

		public static Test suite() { return new TestSuite(Test_Controller.class);		}

		protected void setUp() throws Exception { 
			System.out.println("Test_Controller Begin");
			controller = new Controller();
			
		}

		protected void tearDown() throws Exception { 
			System.out.println("Test_Controller End");
			controller = null;
			
		}

		/**
		 * Test the constructors.
		 */
		public void testConstructors() {
			System.out.println("\tExecuting Test_Controller.testConstructors");
			assertNotNull(controller);
			
		}

		/**
		 * Test the accessors.
		 */
		public void testAccessors() {
			System.out.println("\tExecuting Test_Controller.testAccessors");
			controller.setConcert(concert);
			controller.setData(data);
			controller.setSeason(season);
			assertNotNull(controller.getConcert());
			assertNotNull(controller.getData());
			assertNotNull(controller.getSeason());
		}

		/**
		 * Test the mutators/modifiers.
		 */
		public void testMutators() {
			System.out.println("\tExecuting Test_Controller.testMutators");
			controller.setConcert(concert);
			controller.setData(data);
			controller.setSeason(season);
			assertNotNull(controller.getConcert());
			assertNotNull(controller.getData());
			assertNotNull(controller.getSeason());
			
		}

		/**
		 * Test behaviors.
		 */
		public void testBehaviors() {
			System.out.println("\tExecuting Test_Controller.testBehaviors");
					
			}

		/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
		/**
		 *	Main line for stand-alone operation.
		 *	@param	args	Standard string command line parameters.
		 */
		public static void main(String[] args) {
			System.out.println("Executing Test_Controller suite");
			junit.textui.TestRunner.run(suite());
		}

		/* ATTRIBUTES	-----------------------------------------------	*/
		private Controller controller;
		private Concert concert = new Concert();
		private SampleData data = new SampleData();
		private ConcertSeason season = new ConcertSeason();

	}	/*	End of CLASS:	Test_Controller.java				*/



