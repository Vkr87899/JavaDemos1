package com.vfislk.training;

import java.util.Scanner;

public class CountName {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] user = { "jack", "raj", "tom", "tom", "john", "tom", "raj" };
		for (String name : user) {
			System.out.println(name + "---" + count(name, user));
		}
		sc.close();
	}

	public static int count(String s, String[] ss) {
		int count = 1;
		for (String name : ss) {
			if (s.equals(name))
				count++;
		}
		return count;

	}
	
}
