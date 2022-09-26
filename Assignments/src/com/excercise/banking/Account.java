package com.excercise.banking;

public class Account {
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public void withDraw(double amount) {
		balance = balance - amount;
		System.out.println("amount" + amount + "  has  been withdrawn");
	}

	public void depositAmount(double amount) {
		balance = balance + amount;
		System.out.println("amount " + amount + " successfully deposited to  your account");
	}

	public double getBalance() {
		return balance;
	}
}
