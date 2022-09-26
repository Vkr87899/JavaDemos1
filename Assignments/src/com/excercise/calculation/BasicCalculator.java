package com.excercise.calculation;

public class BasicCalculator implements Icalcuator {

	@Override
	public void add(int x, int y) {
		System.out.println("addition is :"+(x+y));

	}
	public void product(int x, int y)
	{
		System.out.println("product "+(x*y));
	}

}
