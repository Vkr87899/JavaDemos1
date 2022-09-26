package com.traaining.basics;

public class ThrowsDemo {
public static void main(String[] args) {
	Bank withdraw=new Bank();
	System.out.println("in ATm");
	try
	{
		withdraw.withdraw(6000);
		
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	System.out.println("amount withdrwan");
	
	
	
}
}
