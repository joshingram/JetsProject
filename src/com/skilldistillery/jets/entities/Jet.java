package com.skilldistillery.jets.entities;

public abstract class Jet {
	
	//encapsulated fields
	private String model;
	private double speed;
	private int range;
	private long price;
	
	//4 argument constructor
	public Jet(String model, double speed, int range, long price) {
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}
	//abstract method with no method body
	public abstract void fly();
	
	
	//getters and setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}
	//Overriding the default toString to provide better formatting and readability
	@Override
	public String toString() {
		return " model: " + model + ", speed: " + speed + "kts, range: " + range + "nm, price: $" + price;
	}
}
