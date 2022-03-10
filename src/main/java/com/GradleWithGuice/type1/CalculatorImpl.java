package com.GradleWithGuice.type1;

public class CalculatorImpl implements CalculatorInterface {
		@Override
		public int Addition(int a, int b)
		{
			return a+b;
		}
		@Override
		public int Subtraction(int a, int b)
		{
			return a-b;
		}
		@Override
		public int Multiply(int a, int b)
		{
			return a*b;
		}
		@Override
		public int Divide(int a, int b)
		{
			return a/b;
		}

	
}
