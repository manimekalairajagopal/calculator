package com.calc.arithmetic.service;

import org.springframework.stereotype.Service;

import com.calc.arithmetic.entity.Calculator;

@Service
public interface CalculatorService {
	Calculator add(int a, int b);
	Calculator sub(int a, int b);
	Calculator mul(int a, int b);
	Calculator div(int a, int b);
	Calculator mod(int a, int b);
}
