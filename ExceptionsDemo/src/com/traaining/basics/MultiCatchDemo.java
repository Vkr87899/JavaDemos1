package com.traaining.basics;

public class MultiCatchDemo {
	public static void main(String[] args) {
		try {
			System.out.println("welcome");
			String value=args[0];
			System.out.println("value got");
			int number =Integer.parseInt(value);
			System.out.println("number is "+number);
			int result=100/number;
			System.out.println("Result is "+result);
			int[] marks=null;
			System.out.println(marks[0]);
			}catch(ArithmeticException|ArrayIndexOutOfBoundsException|NumberFormatException e)
			{
				System.out.println("plaes enter a number greater than zero");
			}
		catch(RuntimeException e)
		{
			System.out.println("enemies are ahead");
		}
		catch(Exception e)
		{
			System.out.println("please enter a number");
		}
		
		System.out.println("completed");
			
		}
	}


