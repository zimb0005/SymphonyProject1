package test_symphony;

import symphony.FinancialTransaction;
import junit.framework.*;

public class Test_FinancialTransaction extends TestCase {

	public static Test suite() {
		return new TestSuite(Test_FinancialTransaction.class);
	}

	public void setUp() throws Exception {
		System.out.println("Test_FinancialTransaction Begin");
	}

	public void tearDown() throws Exception {
		System.out.println("Test_FinancialTransaction End");
	}

	/**
	 * Testing the constructors.
	 */
	public void testConstructors() {
		System.out.println("\tExecuting Test_ShannonsModel.testConstructors");
		financialTransaction = new FinancialTransaction();
		assertNotNull(
				"\t\tTest_ShannonsModel.testConstructors: ShannonsModel is null",
				financialTransaction);

		// System.out
		// .println("\tBandwidth: " + shannonsModel.getBandwidth() + "\n\tSignal
		// To Noise has been defaulted to 0"
		// + "\n\tFinished Result: " + shannonsModel.getMaximumDataRate());
	}

	// /**
	// * Testing the ACCESSOR.
	// */
	// public void testAccessors() {
	// System.out.println("\tExecuting Test_ShannonsTheorem.testAccessors");
	// shannonsModel = new ShannonsModel();
	// assertNotNull("\t\tTest_ShannonsTheorem.testAccessors: ShannonsTheorem is
	// null", shannonsModel);
	//
	// shannonsModel.setBandwidth(3000);
	// shannonsModel.setSignalToNoise(30);
	// assertFalse(shannonsModel.getBandwidth() == 110000);
	// assertFalse(shannonsModel.getSignalToNoise() == 45);
	// System.out.println("\tBandwidth = " + shannonsModel.getBandwidth() +
	// "\n\tSignal to Noise = "
	// + shannonsModel.getSignalToNoise());
	// }
	//
	// /**
	// * Testing the mutators/modifiers.
	// */
	// public void testMutators() {
	// System.out.println("\tExecuting Test_ShannonsTheorem.testMutators");
	// shannonsModel = new ShannonsModel();
	// assertNotNull("\t\tTest_ShannonsTheorem.testMutators: ShannonsTheorem is
	// null", shannonsModel);
	//
	// /*
	// * TODO: Add tests for your mutators here.
	// */
	// shannonsModel.setBandwidth(3000);
	// assertFalse(shannonsModel.getBandwidth() == 4000);
	// System.out.println("\tBandwidth: " + shannonsModel.getBandwidth());
	//
	// shannonsModel.setSignalToNoise(30);
	// assertFalse(shannonsModel.getSignalToNoise() == 89);
	// System.out.println("\tSignal To noise: " +
	// shannonsModel.getSignalToNoise());
	//
	// assertFalse(shannonsModel.getMaximumDataRate() == 999999.68);
	// System.out.println("\tMaximum Data Rate: " +
	// shannonsModel.getMaximumDataRate());
	// }
	//
	// /**
	// * Testing behaviors.
	// */
	// public void testBehaviors() {
	// System.out.println("\tExecuting Test_ShannonsTheorem.testBehaviors");
	// shannonsModel = new ShannonsModel();
	// assertNotNull("\t\tTest_ShannonsTheorem.testBehaviors: ShannonsTheorem is
	// null", shannonsModel);
	//
	// /*
	// * TODO: Add tests for you behavior here.
	// */
	// shannonsModel.setBandwidth(5);
	// shannonsModel.setSignalToNoise(5);
	// assertEquals(shannonsModel.toString(), "Maximum Data Rate is " +
	// shannonsModel.getMaximumDataRate());
	// System.out.println("\t" + shannonsModel.toString());
	// }

	/* STAND-ALONE ENTRY POINT ----------------------------------------- */
	/**
	 * Main line for stand alone operation.
	 *
	 * @param args
	 *            Standard string command line parameters.
	 */

	public static void main(String[] args) {
		System.out.println("Executing Test_ShannonsModel suite");
		junit.textui.TestRunner.run(suite());
	}

	/* ATTRIBUTES ----------------------------------------------- */
	private FinancialTransaction financialTransaction = null;

} /* End of CLASS: Test_ShannonsTheorem.java */
