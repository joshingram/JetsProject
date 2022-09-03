package com.skilldistillery.jets.entities;

public class PassengerJet extends Jet{

	public PassengerJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	@Override
	public void fly() {
		double endurance = this.getRange()/this.getSpeed();
		System.out.println(this.getModel() + ", " + this.getSpeed() + "kts, " + this.getRange()
			+ "nm, $" + this.getPrice() +  ", with endurance of " + String.format("%.2f", endurance) + " hours");

		
	}

}
