package com.mysite;

class Calculator{
	
	public int addition(int a,int b) {
		return a+b;
	}
	public int substraction(int a,int b) {
		return a-b;
	}
	
}

public class CalculatorApp {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.addition(20,25));

	}

}
