package com.GradleWithGuice.type3;

import com.google.inject.Inject;

public class CalculatorService {
	@Inject
	private CalculatorInterface calculator;
	
	private int calculator(int a, int b, String oper)
	{
		if(oper.equalsIgnoreCase("add")) {
			return calculator.Addition(a,b);
		}if(oper.equalsIgnoreCase("add")) {
			return calculator.Subtraction(a,b);
		}if(oper.equalsIgnoreCase("add")) {
			return calculator.Multiply(a,b);
		}if(oper.equalsIgnoreCase("add")) {
			return calculator.Divide(a,b);
		}
		return 0;
	}

}
