package com.excecise.zoomcar;

public abstract class Vehicle {
	String model, brand, type;
	double price;

	public Vehicle(String model, String brand, String type, double price) {
		super();
		this.model = model;
		this.brand = brand;
		this.type = type;
		this.price = price;

	}

	abstract void getMilage();
	abstract void printAccesroies();
	void getDetails()
	{
		
	}
	
}
