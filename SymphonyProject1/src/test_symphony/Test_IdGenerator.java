package test_symphony;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import symphony.IdGenerator;
/**
 * this class tests the IdGenerator class in symphony package
 * @author Team 2
 * @version 1.0.0	November 2016
 */
public class Test_IdGenerator {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
	/**
	 * test Behaviors
	 */
	@Test
	public void test() {
		//test generateId();
		IdGenerator.setNextId(1);
		assertEquals(IdGenerator.generateID(),1);
		assertEquals(IdGenerator.generateID(),2);
		assertEquals(IdGenerator.generateID(),3);
	}
}
