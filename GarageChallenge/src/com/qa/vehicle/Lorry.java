package com.qa.vehicle;

public class Lorry extends Vehicle {
	
	
	public Lorry(int id, int size, int wheels, String makeModel, int vehicleCondition, int tankerSize, int weight) {
		super(id, size, wheels, makeModel, vehicleCondition);
		this.tankerSize = tankerSize;
		this.weight = weight;
	}

	private int tankerSize;
	private int weight;
	
	
	
	

	
	@Override
	public int calcBill() {
		
		return 200 + (tankerSize * 2) + size * vehicleCondition; 
	}

}
