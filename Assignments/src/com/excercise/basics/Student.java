package com.excercise.basics;

public class Student {
	String name;
	String department;

	String getGrades(int[] marks) {
		int sum = 0;
		int count = 1;
		for (int sub : marks) {
			sum += sub;
			count++;
		}
		int avg = sum / count;
		if (avg > 90)
			return "Grade is A";
		else if (avg > 75 && avg < 90)
			return "Grade is B";
		else if (avg > 60 && avg < 75)
			return "Grad is C";
		else
			return "fail";

	}

	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	void printDetails() {
		System.out.println("name :" + name);
		System.out.println("departmen :" + department);
	}
}
