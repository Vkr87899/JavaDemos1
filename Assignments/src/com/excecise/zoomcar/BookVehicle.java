package com.excecise.zoomcar;

import java.util.Scanner;

public class BookVehicle {

	public static void main(String[] args) {
		String model;
		double price;
		System.out.println("enter the type of vehicle value as....[1]Car  [2]Bike");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input == 1) {
			System.out.println("select the  type....SUV  Sedan  Hatchback");
			String type = sc.next();
			System.out.println("now slect branch....[Audi]   [Toyota]  [BMD]");

			String brand = sc.next();
			if (brand.equalsIgnoreCase("Audi")) {
				System.out.println("enter the Audi model");
				System.out.println("[A4] [S7] ");
				model = sc.next();
				System.out.println("select price  [650000]  [250000]");
				price = sc.nextDouble();
			} else if (brand.equalsIgnoreCase("BMW")) {
				System.out.println("enter the BMW model");
				System.out.println("[E220] [X5] [X6]");
				model = sc.next();
				System.out.println("select price  [80000]   [650000]  [250000]");
				price = sc.nextDouble();
			} else {
				System.out.println("enter the Toyota model");
				System.out.println("[Fortunar] [Cruiser] ");
				model = sc.next();
				System.out.println("select price   [650000]  [250000]");
				price = sc.nextDouble();
			}

			Vehicle vehicle = new Car(model, brand, type, price);
			vehicle.getMilage();
			vehicle.printAccesroies();
			vehicle.getDetails();
			

		} else {
			System.out.println("select the  type....[sports]  [offroad]");
			String type = sc.next();
			System.out.println("now slect brand....[Honda]   [Royalenfiled]  [Ktm]");
			String brand = sc.next();
			if (brand.equalsIgnoreCase("Honda")) {
				System.out.println("enter the model");
				System.out.println("[splendour] [Hunk] ");
				model = sc.next();
			} else if (brand.equalsIgnoreCase("royalEnfild")) {
				System.out.println("enter the model");
				System.out.println("[classic350]  [Himalay] ");
				model = sc.next();
			} else {
				System.out.println("enter the model");
				System.out.println("[Ktm250]  [KTM390] ");
				model = sc.next();
			}

			System.out.println("select price    [650000]  [250000]");
			price = sc.nextDouble();
			Vehicle vehicle = new Bike(model, brand, type, price);
			vehicle.getMilage();
			vehicle.printAccesroies();
			vehicle.getDetails();
		}
		sc.close();

	}
}
