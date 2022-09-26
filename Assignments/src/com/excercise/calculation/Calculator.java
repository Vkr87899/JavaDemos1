package com.excercise.calculation;

public class Calculator {
public static void main(String[] args) {
	ScientificCal ref=new ScientificCalculator();
	ref.add(5, 5);
	ref.product(5, 5);
	ref.square(5);
	ref.cube(5);
}
}