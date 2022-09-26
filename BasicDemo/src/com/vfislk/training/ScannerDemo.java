package com.vfislk.training;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
Scanner sc=  new Scanner(System.in);
System.out.println("enter the name");
String name=sc.nextLine();

System.out.println("welcome "+name);
System.out.println("Good now enter the salary");
double salary=sc.nextDouble();
System.out.println();
System.out.println("Good now salary is :"+salary);
System.out.println();
System.out.println("Excellent now enter city");
sc.nextLine();
String city=sc.nextLine();
System.out.println("city :"+city);
System.out.println("Excellent now enter state");
String state=sc.nextLine();
System.out.println("state :"+state);
sc.close();
}
}