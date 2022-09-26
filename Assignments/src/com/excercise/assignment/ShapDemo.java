package com.excercise.assignment;

public class ShapDemo {
	public static void main(String[] args) {
		IShape area = (x, y) ->  x * y;
		
		double rectangle = area.calArea(8, 12);
		System.out.println("area of rectangle is " + rectangle);
		area = (x, y) ->  Math.PI * x * y;
		double circle = area.calArea(8, 12);
		System.out.println("area of circle is " + circle);
	}
}
