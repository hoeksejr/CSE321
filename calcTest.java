import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.*;
import java.lang.*;

public class calcTest {
	// Test Fixtures
	int a, b, result;

	@Before
	public void setup() {
		a = 1;
		b = 5;
	}

	////////////////// subtract test set
	/**
	 * This test checks that when a smaller integer is subtracted from a larger
	 * integer, the correct positive integer is returned
	 */
	@Test
	public void subtractPositive() {
		assertTrue(Calc.subtract(b, a) == (b - a));
	}

	/**
	 * This test checks that when a larger integer is subtracted from a smaller
	 * integer, the correct negative integer is returned
	 */
	@Test
	public void subtractNegative() {
		assertTrue(Calc.subtract(a, b) == (a - b));
	}

	/**
	 * This is a test that checks when a integer is subtracted from itself, 0 is
	 * returned
	 */
	@Test
	public void subtractSame() {
		assertTrue(Calc.subtract(a, a) == 0);
	}

	/**
	 * This is a test that checks that the subtract method is not reflexive, so
	 * a - b is not the same as b - a
	 */
	@Test
	public void subtractNotReflexive() {
		assertFalse(Calc.subtract(a, b) == Calc.subtract(b, a));
	}

	/**
	 * This is a test that checks that when a negative integer is subtracted,
	 * then it is correctly added
	 */
	@Test
	public void subtractNegativeValue() {
		assertTrue(Calc.subtract(a, -b) == (a - (-b)));
	}

	/**
	 * This is a test that checks when a positive integer is subtracted from a
	 * negative integer, the result is the correct negative integer
	 */
	@Test
	public void subtractfromNegative() {
		assertTrue(Calc.subtract(-a, b) == (-a - b));
	}

	/**
	 * This is a test that checks that when a negative integer is subtracted
	 * from a negative integer, the integer is added and nears 0
	 */
	@Test
	public void subtractNegFromNeg() {
		assertTrue(Calc.subtract(-a, -b) == (-a - (-b)));
	}

	////////////////// multiply test set
	/**
	 * This is a test that checks that multiply is reflexive, a * b is the same
	 * as b * a
	 */
	@Test
	public void multiplyReflexive() {
		assertTrue(Calc.multiply(a, b) == Calc.multiply(b, a));
	}

	/**
	 * This is a test that checks when only the first argument is negative, the
	 * correct negative integer is returned
	 */
	@Test
	public void multiplyFirstNegative() {
		assertTrue(Calc.multiply(-a, b) == ((-a)*b));
	}

	/**
	 * This is a test that checks when only the second argument is negative, the
	 * correct negative integer is returned
	 */
	@Test
	public void multiplySecondNegative() {
		assertTrue(Calc.multiply(a, -b) == (a*(-b)));
	}

	/**
	 * This is a test that checks when both arguments are negative, the correct positive
	 * integer is returned
	 */
	@Test
	public void multiplyTwoNegative() {
		assertTrue(Calc.multiply(-a, -b) == ((-a)*(-b)));
	}

	/**
	 * This is a test that checks when the first argument is 0, 0 is returned
	 */
	@Test
	public void multiplyFirstZero() {
		assertTrue(Calc.multiply(0, a) == 0);
	}

	/**
	 * This is a test that checks when the second argument is 0, 0 is returned
	 */
	@Test
	public void multiplySecondZero() {
		assertTrue(Calc.multiply(a, 0) == 0);
	}

	/**
	 * This is a test that checks when both arguments are 0, 0 is returned
	 */
	@Test
	public void multiplyTwoZero() {
		assertTrue(Calc.multiply(0, 0) == 0);
	}

	////////////////// division test set
	/**
	 * This is a test that checks when two positive integers are divided, the correct
	 * positive float is returned
	 */
	@Test
	public void divideTwoPositives() {
		assertTrue(Calc.divide(b, a) == ((float)b/(float)a));
	}

	/**
	 * This is a test that checks when 0 is divided by a positive integer, 0.0 is
	 * returned
	 */
	@Test
	public void dividePositiveZero() {
		assertTrue(Calc.divide(0, b) == 0.0);
	}

	/**
	 * This is a test that checks when 0 is divided by a negative integer, 0.0 is
	 * returned
	 */
	@Test
	public void divideNegativeZero() {
		assertTrue(Calc.divide(0, -b) == 0.0);
	}

	/**
	 * This is a test that checks when a negative integer is divided by a
	 * positive integer, the result is the correct positive float
	 */
	@Test
	public void divideNegativeByPositive() {
		assertTrue(Calc.divide(-a, b) == ((float)(-a)/(float)b));
	}

	/**
	 * This is a test that checks when a positive integer is divided by a
	 * negative integer, the result is the correct negative float
	 */
	@Test
	public void dividePositiveByNegative() {
		assertTrue(Calc.divide(a, -b) == ((float)a/(float)(-b)));
	}

	/**
	 * This is a test that checks when a positive integer is divided by zero, an
	 * ArithmeticException is thrown
	 */
	@Test(expected = ArithmeticException.class)
	public void dividePositiveByZero() {
		Calc.divide(a, 0);
	}

	/**
	 * This is a test that checks when a negative integer is divided by zero, an
	 * ArithmeticException is thrown
	 */
	@Test(expected = ArithmeticException.class)
	public void divideNegativeByZero() {
		Calc.divide(-a, 0);
	}

}
