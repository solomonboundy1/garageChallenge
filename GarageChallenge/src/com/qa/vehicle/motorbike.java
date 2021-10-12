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
	
	Vehicle motorbike1 = new motorbike(3, 20, 2, "Kawasaki Ninja", 85, true, 50);
	Vehicle motorbike2 = new motorbike(4, 35, 2, "Vincent Black Shadow", 20, false, 30);

	@Override
	public void calcBill() {
		
		return 200 + (engineSize * 2) + size * vehicleCondition; 
		
	}
	

}
