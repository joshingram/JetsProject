package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		//System.out.println("Igniting afterburners...sonic boom!");
		double endurance = this.getRange()/this.getSpeed();
		System.out.println(this.getModel() + " " + this.getSpeed() + " " + this.getRange() + " " + this.getPrice() + " endurance of " + endurance + " hours");
		
	}

	@Override
	public void fighterAction() {
		System.out.println("This is " + this.getModel() + ", too close for missiles, I'm switching to guns!");
		
	}

}
