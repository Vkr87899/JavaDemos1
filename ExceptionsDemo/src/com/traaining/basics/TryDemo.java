package com.traaining.basics;

public class TryDemo {
public static void main(String[] args) {
	try {
	System.out.println("welcome");
	String value=args[0];
	System.out.println("value got");
	int number =Integer.parseInt(value);
	System.out.println("number is "+number);
	int result=100/number;
	System.out.println("Result is "+result);
	}catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("completed");
	
}
}
