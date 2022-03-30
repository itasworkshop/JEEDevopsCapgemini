package com.mysite.hello;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestCalculator {
	
	Calculator calc = new Calculator();
	
	@Test
	public void testAddition() {
		assertEquals(this.calc.addition(20,20),4);
	}

}
