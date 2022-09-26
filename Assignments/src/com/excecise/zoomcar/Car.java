package com.excecise.zoomcar;

public class Car extends Vehicle {

	public Car(String model, String brand, String type, double price) {
		super(model, brand, type, price);
	}

	void getMilage() {
		if (this.type.equalsIgnoreCase("SUV"))
			System.out.println("milage is :  20 km/h");
		else if (this.type.equalsIgnoreCase("Sedan"))
			System.out.println("milage is 25km/h");
		else if (this.type.equalsIgnoreCase("HastchBack"))
			System.out.println("milage is 30km/h");
		else
			System.out.println("Milage is 15km/h");
	}

	void printAccesroies() {
		if (this.brand.equalsIgnoreCase("Audi"))
			System.out.println("this car got......1)Sunroof,2)Five seats,3)Six AirBags");
		else if (this.brand.equalsIgnoreCase("BMW"))
			System.out.println("this car got......1)Semiconductor feature ,2)Airbags");
		else if (this.brand.equalsIgnoreCase("Toyota"))
			System.out.println("this car got......1)Semiconductor feature ,2)Airbags");
		else
			System.out.println("Gear with four door");
	}

	@Override
	void getDetails() {
		System.out.println("overall you are getting " + type + "model " + model + "witth price " + price
				+ ". Happy journey ahead");
	}

}
