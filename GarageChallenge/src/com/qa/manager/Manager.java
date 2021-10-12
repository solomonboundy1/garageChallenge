package com.qa.manager;

import java.util.ArrayList;

import com.qa.vehicle.Lorry;
import com.qa.vehicle.Vehicle;
import com.qa.vehicle.car;
import com.qa.vehicle.motorbike;

public class Manager {
	
	ArrayList<Vehicle> garage = new ArrayList<>();
	
	
	
	
	public void addVehicle(Vehicle vehicle) {
		
		garage.add(vehicle);
		System.out.println("Vehicles in garage: " + garage);
		
	}
	
	public void removeVehicle(Vehicle vehicle) {
		
		garage.remove(vehicle);
		System.out.println("Vehicles in garage: " + garage);
		
	}
	
	public void fixVehicle(Vehicle vehicle) {
		
		vehicle.calcBill();
		
	}
	
	public void clearGarage() {
		
		garage.clear();
		
		System.out.println("Vehicles in garage: " + garage);
		
	}
	
}
