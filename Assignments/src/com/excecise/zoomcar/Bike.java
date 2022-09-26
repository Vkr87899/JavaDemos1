package com.excecise.zoomcar;

public class Bike extends Vehicle {

	@Override
	void getMilage() {
		if (this.brand.equalsIgnoreCase("Honda"))
			System.out.println("milage is :  60 km/h");
		else if (this.brand.equalsIgnoreCase("ktm"))
			System.out.println("milage is 45km/h");
		else if (this.brand.equalsIgnoreCase("RoyalEnfield"))
			System.out.println("milage is 45km/h");
		else
			System.out.println("Milage is 15km/h");
	}

	void printAccesroies() {
		if (this.type.equalsIgnoreCase("sport"))
			System.out.println("hindi speed, high sound");
		else if (this.type.equalsIgnoreCase("offroad"))
			System.out.println("normal speed  And Silence");
		else
			System.out.println("normal");
	}

	void sportDetails() {
		System.out.println("this is " + type + " bike with price " + price + ". so enjoy your ride");
	}

	public Bike(String model, String brand, String type, double price) {
		super(model, brand, type, price);

	}

}
