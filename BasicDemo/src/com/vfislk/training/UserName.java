package com.vfislk.training;

import java.util.Scanner;

public class UserName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the user_name");
		String input = sc.next();
		String[] user = { "jack", "john", "tom", "raj" };
		boolean flag = false;
		for (String name : user) {
			if (name.equalsIgnoreCase(input)) {
				flag = true;
				break;
			}
		}
		if (flag)
		{
			System.out.println("welcomee to vfi :" + input);
		}
		else
		{
			System.err.println(" wrong user");
		}
		sc.close();

	}

}
	