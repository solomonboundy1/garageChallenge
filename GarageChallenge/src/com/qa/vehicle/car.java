package com.qa.vehicle;

public class car extends Vehicle {
	


	public car(int id, int size, int wheels, String makeModel, int vehicleCondition, String hatchBackOrConvertible,
			int seats) {
		super(id, size, wheels, makeModel, vehicleCondition);
		this.hatchBackOrConvertible = hatchBackOrConvertible;
		this.seats = seats;
	}


	private String hatchBackOrConvertible;
	private int seats;
	
	
	
	
	


	@Override
	public int calcBill() {
		
		return 200 + (seats * 2) + size * vehicleCondition; 
		
	}
	
	

}
