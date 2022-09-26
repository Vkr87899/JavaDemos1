package com.vfislk.training;

import java.util.Scanner;

public class Greater {
	public static void main(String[] args) {

		System.out.println("enter the three numbbers");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
		String s=(x>y&&x>z)? x+"  is greater":(y>z)? y+" isgrreaterr ":z+ "  is greater";
		System.out.println(s);
		sc.close();

	}
}
