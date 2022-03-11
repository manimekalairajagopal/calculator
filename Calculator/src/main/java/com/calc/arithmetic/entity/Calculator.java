package com.calc.arithmetic.entity;

import lombok.Data;

@Data
public class Calculator {

	public Calculator(int sum) {
		this.result=sum;
	}

	private Integer result;
	
}

