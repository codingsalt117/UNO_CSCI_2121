/**
 *  Author Robin Johnson
 * 	Lab 03 JUnit
 */

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;
/**
 * Class created for testing Die.java
 * <p>
 * two private dies created for all the tests to use
 */
public class DieTester{
	private Die defaultDie;
	private Die fiveSidedDie;

/**
 *  Setting up the testing eviorment
 * <p>
 * Testing enviorment needs the creation of two dies: a NORMAL die and a 5-SIDED die
 */
	@Before
	public void setUp(){
		defaultDie = new Die();
		fiveSidedDie = new Die(5);
	}	

/**
 *  Test to check if rolling a normal die will roll 1-6
 */
	@Test
	public void testDefaultRoll(){
		int maxValue = 6;
		int minValue = 1;
		int rollValue = defaultDie.roll();
		assertTrue(rollValue >= minValue && rollValue <= maxValue); // rollvalue should be between min and max value
	}

/**
 * Test to check if rolling a 5-sided die will roll 1-5
 */
	@Test
	public void test5SideRoll(){
		int maxValue = 5;
		int minValue = 1;
		int rollValue = fiveSidedDie.roll();
		assertTrue(rollValue >= minValue && rollValue <= maxValue); // rollvalue should be between min and max value
	}

/**
 * Tests if the die has the amount of sides that is equal to a normal 6-sided die
 */
	@Test
	public void testDefaultNumSides(){
		assertEquals(Die.DEFAULT_SIDES , defaultDie.getNumSides());
	}

/**
 * Tests if the die has the amount of sides that is equal to a custom 5-sided die
 */
	@Test
	public void test5NumSides(){
		assertEquals(5 , fiveSidedDie.getNumSides());
	}

/**
 * Tests if when a normal 6-sided die is rolled the result getter gets a number within number range 1-6
 */
	@Test
	public void testGetDefaultResult(){
		int dieRoll = defaultDie.getResult();
		assertTrue(dieRoll >= 1 && dieRoll <= 6);
	}

/**
 * Tests if when a custom 5-sided die is rolled the result getter gets a number within custom range 1-5
 */
	@Test
	public void testGet5SideResult(){
		int dieRoll2 = defaultDie.getResult();
		assertTrue(dieRoll2 >= 1 && dieRoll2 <= 5);
	}

/**
 * Tests if the equals method can result in a true result
 */
	@Test
	public void testEqualsTrue(){
		Die testDie = new Die();
		Boolean result = testDie.equals(defaultDie);
		assertTrue(result = true);
	}

/**
 * Tests if the equals method can result in a false result
 */
	@Test
	public void testEqualsFalse(){
		Die testDie = new Die();
		Boolean result = testDie.equals(fiveSidedDie);
		assertFalse(result = false);
	}

/**
 * Tests if the toString method is printing in the prescribed formating for a normal 6-Sided die
 */
	@Test
	public void testDefaultToString(){
		assertEquals(defaultDie.toString() , ("Num sides " + defaultDie.getNumSides() + " result " + defaultDie.getResult()));
	}

/**
 * Tests if the toString method is printing in the prescribed formating for a custom 5-Sided die
 */
	@Test
	public void test5SideToString(){
		assertEquals(fiveSidedDie.toString() , ("Num sides " + fiveSidedDie.getNumSides() + " result " + fiveSidedDie.getResult()));
	}
}