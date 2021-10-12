package com.qa.vehicle;

public abstract class Vehicle {
	
	int id;
	int size;
	int wheels;
	String makeModel;
	int vehicleCondition;
	
	public abstract int calcBill();
		
		
	
	// Constructor
	public Vehicle(int id, int size, int wheels, String makeModel, int vehicleCondition) {
		super();
		this.id = id;
		this.size = size;
		this.wheels = wheels;
		this.makeModel = makeModel;
		this.vehicleCondition = vehicleCondition;
	}
	
	
	// getters and setters
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getMakeModel() {
		return makeModel;
	}

	public void setMakeModel(String makeModel) {
		this.makeModel = makeModel;
	}

	
	// toString
	@Override
	public String toString() {
		return "Vehicle [size=" + size + ", wheels=" + wheels + ", makeModel=" + makeModel + "]";
	}
	

}
