package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoCarrier{

	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}

	@Override
	public void fly() {
		//System.out.println("Just building flight time to pad the logbook");
		double endurance = this.getRange()/this.getSpeed();
		System.out.println(this.getModel() + " " + this.getSpeed() + " " + this.getRange() + " " + this.getPrice() +  " endurance of " + endurance + " hours");

		
	}

	@Override
	public void cargoAction() {
		System.out.println("This is " + this.getModel() + " loading cargo at this time.");
		
	}

}
