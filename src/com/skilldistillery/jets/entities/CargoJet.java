package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoCarrier{

	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}

	@Override
	public void fly() {
		System.out.println("Just building flight time to pad the logbook");
		
	}

	@Override
	public void cargoAction() {
		System.out.println("loading cargo");
		
	}

}
