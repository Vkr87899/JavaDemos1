package com.vfislk.training;

import java.util.Scanner;

public class ArrayDemo {
public static void main(String[] args) {
	int [] nums=new int[4];
	System.out.println("enter  the array values");
	Scanner sc= new Scanner(System.in);
	int sum=0;
	for(int i=0;i<nums.length;i++)
	{
		nums[i]=sc.nextInt();
	}
	for(int val:nums)
		sum+=val;
	System.out.println("sum of arraay is :"+sum);
	sc.close();
   }
}
