package com.skilldistillery.jets.entities;

import java.util.ArrayList;
import java.util.List;

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
	for (int i = 0 ; i <airField.size(); i++) {
		Jet j = airField.get(i);
		System.out.println(j);
	}
}

}