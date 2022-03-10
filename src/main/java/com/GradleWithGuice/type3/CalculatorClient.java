package com.GradleWithGuice.type3;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CalculatorClient {

	public static void main(String[] args) {
		
		Injector injector =Guice.createInjector(new CalculatorModule());
		CalculatorImpl calculator = injector.getInstance(CalculatorImpl.class);
		System.out.println("Addition "+ calculator.Addition(100,200));
		System.out.println("Subtraction " + calculator.Subtraction(400, 200));
		System.out.println("Multiply " + calculator.Multiply(400, 200));
		System.out.println("Subtraction " + calculator.Divide(400, 200));
	
		CalculatorImpl calculator2 = injector.getInstance(CalculatorImpl.class);
		System.out.println(calculator2);
		
		CalculatorImpl calculator3 = injector.getInstance(CalculatorImpl.class);
		System.out.println(calculator3);
	}

}
