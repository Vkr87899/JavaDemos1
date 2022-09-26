package com.training.userdefine;

public class AtmKiosk {
	public static void main(String[] args) {
		Bank bank=new Bank();
		System.out.println("in atm");
		bank.deposit(50000);
		try {
			bank.withdraw(11000);
		}
		catch(ExceedingLimitsException|InsufficientBalanceException e)
		{
			System.out.println("Bank " +e.getMessage());
			
		}
		
				
	}

}
