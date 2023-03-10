package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CalculatorController {
	
	@GetMapping("/add")
	public Calculator addition(@RequestParam(name = "operand1") double operand1, @RequestParam(name = "operand2") double operand2) {
		
		Calculator calculator = new Calculator(operand1, operand2);
		calculator.add();
		return calculator;
	}
	
	@GetMapping("/subtract")
	public Calculator subtraction(@RequestParam(name = "operand1") double operand1, @RequestParam(name = "operand2") double operand2) {
		Calculator calculator = new Calculator(operand1, operand2);
		calculator.subtract();
		return calculator;
	}
	
	@GetMapping("/multiply")
	public Calculator multiplication(@RequestParam(name = "operand1") double operand1, @RequestParam(name = "operand2") double operand2) {
		Calculator calculator = new Calculator(operand1, operand2);
		calculator.multiply();
		return calculator;
	}
	
	@GetMapping("/divide")
	public Calculator division(@RequestParam(name = "operand1") double operand1, @RequestParam(name = "operand2") double operand2) {
		Calculator calculator = new Calculator(operand1, operand2);
		calculator.divide();
		return calculator;
	}
	
	@GetMapping("/evaluate")
	public ResponseEntity<Exp> evaluateExpression(@RequestBody Exp expression) {
		expression.evaluateExpression();
		return new ResponseEntity<Exp>(expression, HttpStatus.OK);
		
	}
	
	

}
