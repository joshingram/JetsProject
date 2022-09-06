package com.skilldistillery.jets.entities;

public class CargoJet extends Jet implements CargoCarrier{

	//ctor uses super to refer to superclass's ctor
	public CargoJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	//Overrides the Jet class's abstract fly method
	@Override
	public void fly() {
		double endurance = this.getRange()/this.getSpeed();
		System.out.println(this.getModel() + ", " + this.getSpeed() + "kts, " + this.getRange()
		+ "nm, $" + this.getPrice() +  ", with endurance of " + String.format("%.2f", endurance) + " hours");
	}

	//Overrides the CargoCarrier interface's abstract cargoAction method
	@Override
	public void cargoAction() {
		System.out.println("This is " + this.getModel() + " loading cargo at this time.");
		
	}

}
