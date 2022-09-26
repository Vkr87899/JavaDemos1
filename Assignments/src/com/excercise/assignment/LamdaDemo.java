package com.excercise.assignment;

public class LamdaDemo {
	public static void main(String[] args) {
		ICasioCalculator casio = (x, y) -> System.out.println("addtion of " + x + " and " + y + " is: " + (x + y));
		casio.calculate(5, 5);
		casio = (x, y) -> System.out.println("Subtraction of " + x + " and " + y + " is: " + (x - y));
		casio.calculate(5, 5);
		casio = (x, y) -> System.out.println("multiplication of " + x + " and " + y + " is: " + (x * y));
		casio.calculate(5, 5);
	}
}
