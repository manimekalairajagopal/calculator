package com.calc.arithmetic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calc.arithmetic.entity.Calculator;
import com.calc.arithmetic.service.CalculatorService;

@RestController
@RequestMapping("/calc/arithmetic")
public class CalculatorController {
	@Autowired
	private CalculatorService calcService;
	
	@PostMapping("/add")
	Calculator addCalculator(@RequestParam int a,@RequestParam int b) {
		return calcService.add(a, b);
	}
	@PostMapping("/sub")
	Calculator subCalculator(@RequestParam int a,@RequestParam int b) {
		return calcService.sub(a, b);
	}
	@PostMapping("/mul")
	Calculator mulCalculator(@RequestParam int a,@RequestParam int b) {
		return calcService.mul(a, b);
	}
	@PostMapping("/div")
	Calculator divCalculator(@RequestParam int a,@RequestParam int b) {
		return calcService.div(a, b);
	}
	@PostMapping("/mod")
	Calculator modCalculator(@RequestParam int a,@RequestParam int b) {
		return calcService.mod(a, b);
	}

}
