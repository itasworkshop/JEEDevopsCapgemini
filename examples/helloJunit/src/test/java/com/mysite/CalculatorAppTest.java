package com.mysite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorAppTest {
	
	Calculator calc = new Calculator();
	
	@Test
	public void testAddition() {
		assertEquals(this.calc.addition(20,20),40);
	}

	@Test
	public void testSubtraction() {
		assertEquals(this.calc.substraction(25,20),50);
	}
}
