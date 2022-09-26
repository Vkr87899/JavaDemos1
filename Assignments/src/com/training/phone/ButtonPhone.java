package com.training.phone;

public class ButtonPhone implements IbsicPhone {

	@Override
	public void call() {
		System.out.println("make a call");
	}

	@Override
	public void play() {
		System.out.println("Start play snake");
	
	}

}
