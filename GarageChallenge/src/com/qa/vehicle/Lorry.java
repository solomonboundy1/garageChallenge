package com.qa.vehicle;

public class Lorry extends Vehicle {
	
	
	public Lorry(int id, int size, int wheels, String makeModel, int vehicleCondition, int tankerSize, int weight) {
		super(id, size, wheels, makeModel, vehicleCondition);
		this.tankerSize = tankerSize;
		this.weight = weight;
	}

	private int tankerSize;
	private int weight;
	
	Vehicle lorry1 = new Lorry(5, 90, 8, "Bedford TM Turbo", 10, 50, 70);
	Vehicle lorry2 = new Lorry(6, 120, 12, "DAF 2800 ATI", 70, 30, 60);
	
	

	@Override
	public void calcBill() {
		
		return 200 + (tankerSize * 2) + size * vehicleCondition; 
	}

}
