package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;

public class JetsApplication {

	public static void main(String[] args) {
		//instantiate a new instance of the class in order to invoke non static methods
		JetsApplication ja = new JetsApplication();
		ja.run();
	}

	public void run() {
		printMenu();
	}
	//AirField named jetList will equal the return of method readFile();
	AirField jetList = readFile();

	//returns an AirField (which is an Array of Jets)
	public AirField readFile() {
		// Read a .txt file, parse String into correct data Types - store as variables for use in constructor
		AirField jetListRunner = new AirField();
		BufferedReader bufIn = null;
		try {
			bufIn = new BufferedReader(new FileReader("jets.txt"));
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] fromFile = line.split(", ");
				String jType = fromFile[0];
				String jModel = fromFile[1];
				Double jSpeed = Double.parseDouble(fromFile[2]);
				Integer jRange = Integer.parseInt(fromFile[3]);
				Long jPrice = Long.parseLong(fromFile[4]);

				// Instantiate new jets based on type of jet
				if (jType.equals("Cargo")) {
					Jet newCargo = new CargoJet(jModel, jSpeed, jRange, jPrice);
					jetListRunner.addJet(newCargo);
				}
				if (jType.equals("Fighter")) {
					Jet newFighter = new FighterJet(jModel, jSpeed, jRange, jPrice);
					jetListRunner.addJet(newFighter);
				}
				if (jType.equals("Passenger")) {
					Jet newPassenger = new PassengerJet(jModel, jSpeed, jRange, jPrice);
					jetListRunner.addJet(newPassenger);
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		} finally {
			if (bufIn != null) {
				try {
					bufIn.close();
				} catch (IOException e) {
					System.err.println(e);
				}
			}
		}
		return jetListRunner;
	}
	//prints the Menu, then calls the switch method
	public void printMenu() {
		
		while (true) {
			Scanner kb = new Scanner(System.in);

			System.out.println();
			System.out.println("/----=====//// MENU \\\\\\\\=====----\\");
			System.out.println("| 1. List fleet                  |");
			System.out.println("| 2. Fly all jets                |");
			System.out.println("| 3. View fastest jet            |");
			System.out.println("| 4. View jet with longest range |");
			System.out.println("| 5. Load all Cargo Jets         |");
			System.out.println("| 6. Dogfight!                   |");
			System.out.println("| 7. Add a jet to the fleet      |");
			System.out.println("| 8. Remove a jet from the fleet |");
			System.out.println("| 9. Quit                        |");
			System.out.println("\\----========================----/");
			//try catch loop here to account for non-int inputs
			try { 
			int menuChoice = kb.nextInt();
			if (menuChoice == 9) {
				System.out.println("           |      |    ");
				System.out.println("        __ |__/\\__|___");
				System.out.println("----===/// Goodbye! \\\\\\===----");
				System.out.println("       oo     O      oo");
				System.exit(0);
			}
			switchMethod(menuChoice);
			}
			catch (InputMismatchException e) {
				System.out.println("That's not a valid entry, try again");
			}
		}
	}

	public void switchMethod(int menuChoice) {
		//switch cases correspond to the menu choices above, all but #7 call methods contained in the AirField Class.
		switch (menuChoice) {
		case 1:
			jetList.getAllJets();
			break;
		case 2:
			jetList.flyAllJets();
			break;
		case 3:
			jetList.getFastest();
			break;
		case 4:
			jetList.getLongestRange();
			break;
		case 5:
			jetList.loadAllCargo();
			break;
		case 6:
			jetList.dogFight();
			break;
		case 7:
			addAJet();
			break;
		case 8:
			jetList.removeAJet();
			break;
//		case 9:   //This is probably not required because choice 9 exits within the menu, prior to the switch.
//
//			break;
		default:
			System.out.println("Invalid choice, try again");

		}

	}
	//allows a user to build their own jet, starting with type
	public void addAJet() {
		Scanner kb1 = new Scanner(System.in);
		System.out.print("Would you like to add a Cargo, Fighter, or Passenger jet?: ");
		String typeChoice = kb1.next();
		System.out.print("Enter the model name: ");
		String modelChoice = kb1.next();
		System.out.print("Enter the speed in knots: ");
		Double speedChoice = kb1.nextDouble();
		System.out.print("Enter the range in nautical miles: ");
		Integer rangeChoice = kb1.nextInt();
		System.out.print("Enter the price in USD: ");
		Long priceChoice = kb1.nextLong();

		if (typeChoice.equalsIgnoreCase("Cargo")) {
			Jet newCargo = new CargoJet(modelChoice, speedChoice, rangeChoice, priceChoice);
			jetList.addJet(newCargo);
		}
		else if (typeChoice.equalsIgnoreCase("Fighter")) {
			Jet newFighter = new FighterJet(modelChoice, speedChoice, rangeChoice, priceChoice);
			jetList.addJet(newFighter);
		}
		else if (typeChoice.equalsIgnoreCase("Passenger")) {
			Jet newPassenger = new PassengerJet(modelChoice, speedChoice, rangeChoice, priceChoice);
			jetList.addJet(newPassenger);
		}
		else {
			System.out.println();
			System.out.println("We couldn't find the blueprints for a \"" + typeChoice + "\" jet.  Try again.");
		}
	}
}
