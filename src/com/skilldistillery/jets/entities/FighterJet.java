package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady{

	//ctor uses super to reference the super class "Jet" ctor
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	//Overrides the super class Jet's abstract fly method
	@Override
	public void fly() {
		double endurance = this.getRange()/this.getSpeed();
		System.out.println(this.getModel() + ", " + this.getSpeed() + "kts, " + this.getRange()
		+ "nm, $" + this.getPrice() +  ", with endurance of " + String.format("%.2f", endurance) + " hours");
	}

	//Overrides the CombatReady interface's abstract fighterAction method
	@Override
	public void fighterAction() {
		System.out.println("This is " + this.getModel() + ", too close for missiles, I'm switching to guns!");
		
	}

}
