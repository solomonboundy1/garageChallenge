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
	
	Vehicle car1 = new car(1, 50, 4, "Audi TT", 100, "Hatchback", 5);
	Vehicle car2 = new car(2, 60, 4, "Lambourghini Gallardo", 50, "Convertable", 2);
	
	
	@Override
	public void calcBill() {
		return 200 + (seats * 2) + size * vehicleCondition; 
		
	}
	
	

}
