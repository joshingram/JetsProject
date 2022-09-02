package com.skilldistillery.jets.entities;

public class FighterJet extends Jet implements CombatReady{

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fly() {
		System.out.println("Igniting afterburners...sonic boom!");
		
	}

	@Override
	public void fighterAction() {
		System.out.println("Too close for missiles, I'm switching to guns!");
		
	}

}
