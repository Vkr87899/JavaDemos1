package com.excercise.basics;

public class MainClass {
public static void main(String[] args) {
	Student student1=new Student("sadik"," Science");
	int [] marks1= { 90,80,75,95};
	student1.printDetails();
	System.out.println(student1.getGrades(marks1));
	System.out.println();
	Student student2=new Student("naveen","Arts");
	int [] marks= {39,20,25};
	student2.printDetails();
	System.out.println(student2.getGrades(marks));
}
}
