package com.skilldistillery.jets.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	private List<Jet> airField;

	public AirField() {
		airField = new ArrayList<>();
	}

//	has the collection of jets, menu asks the airfield to tell the jets to display themselves, fly themselves
//	need a lot (3-5) more methods than just a ctor
	public void addJet(Jet j) {
		airField.add(j);

	}

	public void getAllJets() {
		for (int i = 0; i < airField.size(); i++) {
			Jet j = airField.get(i);
			System.out.println("#" + (i+1) + " " + j);
		}
	}

	public void flyAllJets() {
		for (int i = 0; i < airField.size(); i++) {
			airField.get(i).fly();
		}
	}

	public void getFastest() {
		double highest = 0;
		for (int i = 0; i < airField.size(); i++) {
			double high = airField.get(i).getSpeed();
			if (high > highest) {
				highest = high;
			}
		}
		for (int i = 0; i < airField.size(); i++) {
			if (airField.get(i).getSpeed() == highest) {
				Jet j = airField.get(i);
				System.out.println("The fastest jet is:" + j);
			}
		}
	}

	public void getLongestRange() {
		double longest = 0;
		for (int i = 0; i < airField.size(); i++) {
			double dist = airField.get(i).getRange();
			if (dist > longest) {
				longest = dist;
			}
		}
		for (int i = 0; i < airField.size(); i++) {
			if (airField.get(i).getRange() == longest) {
				Jet j = airField.get(i);
				System.out.println("The jet with the longest range is:" + j);
			}
		}
	}

	public void loadAllCargo() {
		for (int i = 0; i < airField.size(); i++) {
			Jet j = airField.get(i);
			if (j instanceof CargoJet) {
				((CargoJet) j).cargoAction();
			}
		}
	}
	
	public void dogFight() {
		for (int i = 0; i < airField.size(); i++) {
			Jet j = airField.get(i);
			if (j instanceof FighterJet) {
				((FighterJet) j).fighterAction();
			}
		}
	}
	
	public void removeAJet() {
		Scanner kb2 = new Scanner(System.in);
		System.out.println("Select the number of the Jet to remove.");
		getAllJets();
		int removeChoice = kb2.nextInt();
		airField.remove((removeChoice - 1));
		
		
	}
}