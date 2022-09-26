package com.excercise.insurance;

public class HealthInsurance extends Insurance{

	public HealthInsurance(String name, String durationn, String type) {
		super(name, durationn, type);
		
	}

	@Override
	void policyDetails() {
		System.out.println("Insurance name is  "+name+"  with duration "+ duration +" and of type :"+type);
	}

}
