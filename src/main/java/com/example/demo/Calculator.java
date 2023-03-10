package com.example.demo;



public class Calculator {
	private double operand1;
	private double operand2;
	public Double result;
	
	public Calculator(double operand1, double operand2) {
		this.operand1 = operand1;
		this.operand2 = operand2;
	}
	
	
	
	public void add() {
		this.result = this.operand1 + this.operand2;
	}
	
	public void subtract() {
		this.result = this.operand1 - this.operand2;
	}
	
	public void multiply() {
		this.result = this.operand1 * this.operand2;
	}
	
	public void divide() {
		this.result = this.operand1 / this.operand2;
	}

}
