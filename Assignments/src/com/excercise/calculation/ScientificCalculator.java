package com.excercise.calculation;

public class ScientificCalculator extends BasicCalculator implements ScientificCal {

	@Override
	public void square(int x) {
		System.out.println("square of "+x+" is"+x*x);
	}

	@Override
	public void cube(int x) {
		System.out.println("cube of "+x+" is"+x*x);

	}

}
