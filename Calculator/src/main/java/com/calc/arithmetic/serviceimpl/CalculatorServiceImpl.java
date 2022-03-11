package com.calc.arithmetic.serviceimpl;

import org.springframework.stereotype.Service;

import com.calc.arithmetic.entity.Calculator;
import com.calc.arithmetic.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public Calculator add(int a, int b) {
		int sum=a+b;
		return new Calculator(sum);
	}

	@Override
	public Calculator sub(int a, int b) {
		int sum=a-b;
		return new Calculator(sum);
	}

	@Override
	public Calculator mul(int a, int b) {
		int sum=a*b;
		return new Calculator(sum);
	}

	@Override
	public Calculator div(int a, int b) {
		int sum=a/b;
		return new Calculator(sum);
	}

	@Override
	public Calculator mod(int a, int b) {
		int sum=a%b;
		return new Calculator(sum);
	}
}
