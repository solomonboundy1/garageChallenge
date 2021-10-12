package com.qa.vehicle;

public class motorbike extends Vehicle {
	


	public motorbike(int id, int size, int wheels, String makeModel, int vehicleCondition, boolean sportsBike,
			int engineSize) {
		super(id, size, wheels, makeModel, vehicleCondition);
		this.sportsBike = sportsBike;
		this.engineSize = engineSize;
	}

	private boolean sportsBike;
	private int engineSize;
	
	
	

	


	@Override
	public int calcBill() {
		
		return 200 + (engineSize * 2) + size * vehicleCondition; 
		
	}
	

}
