package test_symphony;

import symphony.Address;
import symphony.AddressBuilder;
import junit.framework.*;
/**
 * this class tests the Address class in symphony package
 * @author Team 2
 *@version 1.0.0	November 2016
 */

public class Test_Address extends TestCase {
	
		public Test_Address(String name) { super(name);	}

		public static Test suite() { return new TestSuite(Test_Address.class);		}

		protected void setUp() throws Exception { 
			System.out.println("Test_Address Begin");
			address = new Address();
			address2 = new Address(builder);
		}

		protected void tearDown() throws Exception { 
			System.out.println("Test_Address End");
			address = null;
			address2 = null;
		}

		/**
		 * Test the constructors.
		 */
		public void testConstructors() {
			System.out.println("\tExecuting Test_Address.testConstructors");
			assertNotNull("\t\tTest_Address.testConstructors: Address is null", address);
			assertNotNull("\t\tTest_Address.testConstructors: Address is null", address2);
		}

		/**
		 * Test the accessors.
		 */
		public void testAccessors() {
			System.out.println("\tExecuting Test_Address.testAccessors");
			address.setStreetNum("123");
			address.setCity("Ottawa");
			address.setCountry("Canada");
			address.setProvince("Ontario");
			address.setStreetName("Macy Blvd");
			assertEquals("123",address.getStreetNum());
			assertEquals("Ottawa",address.getCity());
			assertEquals("Canada",address.getCountry());
			assertEquals("Ontario",address.getProvince());
			assertEquals("Macy Blvd",address.getStreetName());
		}

		/**
		 * Test the mutators/modifiers.
		 */
		public void testMutators() {
			System.out.println("\tExecuting Test_Address.testMutators");
			address.setStreetNum("123");
			address.setCity("Ottawa");
			address.setCountry("Canada");
			address.setProvince("Ontario");
			address.setStreetName("Macy Blvd");
			assertEquals("123",address.getStreetNum());
			assertEquals("Ottawa",address.getCity());
			assertEquals("Canada",address.getCountry());
			assertEquals("Ontario",address.getProvince());
			assertEquals("Macy Blvd",address.getStreetName());
		}

		/**
		 * Test behaviors.
		 */
		public void testBehaviors() {
			System.out.println("\tExecuting Test_Address.testBehaviors");
			assertEquals(address.toString(),"Address [streetNum=null, streetName=null, city=null, province=null, country=null]");		
			}

		/*	STAND-ALONE ENTRY POINT -----------------------------------------	*/
		/**
		 *	Main line for stand-alone operation.
		 *	@param	args	Standard string command line parameters.
		 */
		public static void main(String[] args) {
			System.out.println("Executing Test_Address suite");
			junit.textui.TestRunner.run(suite());
		}

		/* ATTRIBUTES	-----------------------------------------------	*/
		private Address address = null;
		private Address address2 = null;
		private AddressBuilder builder = new AddressBuilder();

	}	/*	End of CLASS:	Test_Address.java				*/



