package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet{

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		//System.out.println("If you look out your window, you can see the Grand Canyon");
		double endurance = this.getRange()/this.getSpeed();
		System.out.println(this.getModel() + " " + this.getSpeed() + " " + this.getRange() + " " + this.getPrice() +  " endurance of " + endurance + " hours");

		
	}

}
