package com.mysite.hello;

class Calculator{
	
	public int addition(int a,int b) {
		return a+b;
	}
	
}

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.addition(20,25));

	}

}
