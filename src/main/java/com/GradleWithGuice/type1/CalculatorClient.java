package com.GradleWithGuice.type1;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class CalculatorClient {

	public static void main(String[] args) {
		
		Injector injector =Guice.createInjector(new CalculatorModule());
		Calculator calculator = injector.getInstance(Calculator.class);
		System.out.println("Addition "+ calculator.Addition(100,200));
		System.out.println("Subtraction " + calculator.Subtraction(400, 200));
	}

}
