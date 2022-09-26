package com.vfislk.training;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number for table");
		int num = sc.nextInt();
		System.out.println("Table---");
		for (int i = 1; i <= 10; i++)
			System.out.println(num + " * " + i + " = " + i * num);
		sc.close();
	}
}
