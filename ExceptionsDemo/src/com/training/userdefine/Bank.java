package com.training.userdefine;

public class Bank {
	double balance;
	void deposit(double amount) {
		
		balance=balance+amount;
	}
    void withdraw(int amount) throws InsufficientBalanceException, ExceedingLimitsException
    {
    	try
    	{
    		if(amount>balance)
    	
    	{
    		System.out.println("transaction failure");
    		throw  new  InsufficientBalanceException("amount>  balance");
    	}
    	else if(amount>10000) {
    		System.out.println("transaction failure");
    		throw new ExceedingLimitsException("Exceeding daily limits");
    	}
    	else
    	{
    		balance=balance-amount;
    		System.out.println("Amount withdraw");
    		System.out.println("Balance is "+balance);
    	}
    	}
    		catch (Exception e)
    		{
    			System.out.println("exceptin "+e);
    		
    		}
    	finally
    	{
    		System.out.println("close");
    	}
    	System.out.println("completed");
    }
}
