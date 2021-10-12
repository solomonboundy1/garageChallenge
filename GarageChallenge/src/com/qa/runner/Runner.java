package com.qa.runner;

import com.qa.manager.Manager;
import com.qa.vehicle.Lorry;
import com.qa.vehicle.Vehicle;
import com.qa.vehicle.car;
import com.qa.vehicle.motorbike;

public class Runner {
	
	public static void main(String[] args) {
		
		Vehicle car1 = new car(1, 50, 4, "Audi TT", 100, "Hatchback", 5);
		Vehicle car2 = new car(2, 60, 4, "Lambourghini Gallardo", 50, "Convertable", 2);
		Vehicle motorbike1 = new motorbike(3, 20, 2, "Kawasaki Ninja", 85, true, 50);
		Vehicle motorbike2 = new motorbike(4, 35, 2, "Vincent Black Shadow", 20, false, 30);
		Vehicle lorry1 = new Lorry(5, 90, 8, "Bedford TM Turbo", 10, 50, 70);
		Vehicle lorry2 = new Lorry(6, 120, 12, "DAF 2800 ATI", 70, 30, 60);
		
		Manager newManager = new Manager();
		
		newManager.addVehicle(car2);
		newManager.addVehicle(lorry2);
		newManager.clearGarage();
		newManager.fixVehicle(lorry2);
		
	}
		
}
