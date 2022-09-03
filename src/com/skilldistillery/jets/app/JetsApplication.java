package com.skilldistillery.jets.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import com.skilldistillery.jets.entities.AirField;
import com.skilldistillery.jets.entities.CargoJet;
import com.skilldistillery.jets.entities.FighterJet;
import com.skilldistillery.jets.entities.Jet;
import com.skilldistillery.jets.entities.PassengerJet;

public class JetsApplication {

	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.run();
	}

	public void run() {
		readFile();
		printMenu();
		
	}
	
	AirField jetList = new AirField();
	
	public void readFile() {
		//Read a .txt file
		BufferedReader bufIn = null;
		try {
			bufIn = new BufferedReader(new FileReader("jets.txt"));
			String line;
			while ((line = bufIn.readLine()) != null) {
				String [] fromFile = line.split(", ");
				String jType = fromFile[0];
				String jModel = fromFile[1];
				Double jSpeed = Double.parseDouble(fromFile[2]);
				Integer jRange = Integer.parseInt(fromFile[3]);
				Long jPrice = Long.parseLong(fromFile[4]);
				
				//Instantiate new jets
				if (jType.equals("Cargo")){
					Jet newCargo = new CargoJet(jModel, jSpeed, jRange, jPrice);
					jetList.addJet(newCargo);
				}
				if (jType.equals("Fighter")) {
					Jet newFighter = new FighterJet(jModel, jSpeed, jRange, jPrice);
					jetList.addJet(newFighter);
				}
				if (jType.equals("Passenger")) {
					Jet newPassenger = new PassengerJet(jModel, jSpeed, jRange, jPrice);
					jetList.addJet(newPassenger);
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
	}

	public void printMenu() {
		while (true) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println();
		System.out.println("----========= MENU =========----");
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to the fleet");
		System.out.println("8. Remove a jet from the fleet");
		System.out.println("9. Quit");
		int menuChoice = kb.nextInt();
		if (menuChoice == 9) {
			System.exit(0);
		}
		switchMethod(menuChoice);
	}
	}
	public void switchMethod(int menuChoice) {
		
		switch (menuChoice) {
		//List fleet
		case 1:
			jetList.getAllJets();
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;
		case 7:
			
			break;
		case 8:
			
			break;
		case 9:
			
			break;
		default:
			System.out.println("Invalid choice");
			
		}
		
	}
}
