package com.banking.transactions;

import java.util.Scanner;

public class Deposit extends Account{

	public Deposit(double   amount) {
		super(amount);
	}

	@Override
	void deposit(double amount) {
		System.out.println("your tottal available balance is :"+balance);
		System.out.println("enter the amount you want to deposit");
		Scanner sc=new Scanner(System.in);
	
		
	}
	

}
