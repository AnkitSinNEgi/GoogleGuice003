package com.GradleWithGuice.type1;

//import com.GradleWithGuice.type1.CalculatorImpl;
import com.google.inject.AbstractModule;
//import com.google.inject.Scopes;
//import com.google.inject.Singleton;

public class CalculatorModule extends AbstractModule {
	
	protected void configure(){
		bind(CalculatorInterface.class).to(CalculatorImpl.class);
		//bind(CalculatorInterface.class).to(CalculatorImpl.class).in(Singleton.class);
		//bind(CalculatorInterface.class).to(CalculatorImpl.class).in(Scopes.SINGLETON);
		//bind(CalculatorInterface.class).toInstance(new CalculatorImpl());
	}
	

}
