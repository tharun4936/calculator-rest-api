package com.example.demo;


import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Exp {
	private String expressionString;
	private double result;
	
	public void evaluateExpression() {
		Expression exp = new ExpressionBuilder(this.expressionString).build();
		this.result = exp.evaluate();
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public String getExpressionString() {
		return expressionString;
	}

	public void setExpressionString(String expressionString) {
		this.expressionString = expressionString;
	}

}
