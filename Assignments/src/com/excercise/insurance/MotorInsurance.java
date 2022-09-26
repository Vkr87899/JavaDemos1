package com.excercise.insurance;

public class MotorInsurance extends Insurance {

	@Override
	void policyDetails() {
		System.out.println("Insurance name is "+name+"  with duration "+ duration +" and of type"+type);
	}

	public MotorInsurance(String name,String duration,String type) {
		super(name,duration,type);
		
	}

}
