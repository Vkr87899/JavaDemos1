package com.traaining.basics;

public class Bank {

	
	void  withdraw(int amount)throws Exception
	{
		System.out.println("in bank");
		try
		{
			if(amount<1)
			{
				throw new Exception("Exceeded limit");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
			throw e;
		}
		finally
		{
			System.out.println("close db");
		}
		System.out.println("server completed");
		
	}
}
