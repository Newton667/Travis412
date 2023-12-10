package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
	}
	
	@Test
	public void testSubtract() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.subtract(5, 3), 2);
	}
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(2, 3), 6);
	}

	//@Test
	//public void testDivide() {
	//	SimpleCalculator calc = new SimpleCalculator();
	//	assertEquals(0.0001, calc.divide(4, 2), 2);
	//}

	@Test
	public void testDivideByZero() {
		SimpleCalculator calc = new SimpleCalculator();
		calc.divide(4, 0);
	}

}
