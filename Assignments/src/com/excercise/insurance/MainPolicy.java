package com.excercise.insurance;

public class MainPolicy {
	public static void main(String[] args) {
		Insurance insurance=new HealthInsurance("C15","1 yr& 5 month","Health");
		insurance.policyDetails();
		System.out.println();
		insurance=new  MotorInsurance("Acko","1 yr","BIKE");
		insurance.policyDetails();
	}

}
