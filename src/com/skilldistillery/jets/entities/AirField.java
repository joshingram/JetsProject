package com.skilldistillery.jets.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirField {
	private List<Jet> airField;

	public AirField() {
		//instantiate a new AirField (List of Jets)
		airField = new ArrayList<>();
	}

	//adds a jet to the airField
	public void addJet(Jet j) {
		airField.add(j);
	}

	//The methods below are called from JetsApplication.  JetsApplication calls on AirField (via the methods below)
	//in order to search, calculate, and invoke methods on the jets contained within the AirField). The method names
	//are self-evident.
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
		//finds the highest value in the speed field
		double highest = 0;
		for (int i = 0; i < airField.size(); i++) {
			double high = airField.get(i).getSpeed();
			if (high > highest) {
				highest = high;
			}
		}
		int tieCounter = 0;
		//search for jets that match the highest speed
		for (int i = 0; i < airField.size(); i++) {
			if (airField.get(i).getSpeed() == highest) {
				Jet j = airField.get(i);
				System.out.println("The fastest jet is:" + j);
				tieCounter++;
			}
		}
		//prints if there's a tie for fastest
		if (tieCounter >1) {
			System.out.println("Looks like a tie on paper, gonna come down to pilot skill");
		}
	}

	public void getLongestRange() {
		//finds the highest value in the range field
		double longest = 0;
		for (int i = 0; i < airField.size(); i++) {
			double dist = airField.get(i).getRange();
			if (dist > longest) {
				longest = dist;
			}
		}
		int tieCounter = 0;
		//searches for jets that match the highest value in range
		for (int i = 0; i < airField.size(); i++) {
			if (airField.get(i).getRange() == longest) {
				Jet j = airField.get(i);
				System.out.println("The jet with the longest range is:" + j);
				tieCounter++;
			}
		}
		//prints if there's a tie for longest range
		if (tieCounter >1) {
			System.out.println("Looks like a tie on paper, gonna come down to pilot skill");
		}
	}
	//iterates through the list of jets, determines if a jet is an instance of the CargoJet subclass, and if so
	//calls the implementation of the CargoCarrier interface
	public void loadAllCargo() {
		for (int i = 0; i < airField.size(); i++) {
			Jet j = airField.get(i);
			if (j instanceof CargoJet) {
				((CargoJet) j).cargoAction();
			}
		}
	}
	//iterates through the list of jets, determines if a jet is an instance of the FighetJet subclass, and if so
	//calls the implementation of the CombatReady interface
	public void dogFight() {
		for (int i = 0; i < airField.size(); i++) {
			Jet j = airField.get(i);
			if (j instanceof FighterJet) {
				((FighterJet) j).fighterAction();
			}
		}
	}
	
	//Allows the user to remove a jet by selecting the jet's number from a list of all jets
	public void removeAJet() {
		Scanner kb2 = new Scanner(System.in);
		System.out.println("Select the number of the Jet to remove.");
		getAllJets();
		int removeChoice = kb2.nextInt();
		//This is " - 1 " because the jet's index will be one less than it's number in a printed list
		airField.remove((removeChoice - 1));
		
		
	}
}