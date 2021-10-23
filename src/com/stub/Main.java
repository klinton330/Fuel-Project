package com.stub;

import java.util.Scanner;

import com.data.CalculateData;
import com.data.FuelData;
import com.fuel.Diesel;

import com.fuel.Fuel;
import com.fuel.Kerosene;
import com.fuel.LPG;
import com.fuel.Petrol;

public class Main {
	FuelData f = new FuelData();
	Scanner sc = new Scanner(System.in);

	// Method Returns a cost
	public int getCostDetails(Fuel f, String stateName) {
		if (stateName.equalsIgnoreCase("TamilNadu"))
			return f.tamilNadu;
		else if (stateName.equalsIgnoreCase("Kerala"))
			return f.kerala;
		return f.karnataka;
	}

	// state ,fuel, cost per liter
	public FuelData getCost() {

		int cost = 0;
		String fuelName = null;
		String state = null;
		System.out.println("Press 1 for TamilNadu  Press 2 for Kerala  Press 3 for Karnataka");
		String s = sc.next();
		if (s.equalsIgnoreCase("1"))
			state = "TamilNadu";
		if (s.equalsIgnoreCase("2"))
			state = "Kerala";
		if (s.equalsIgnoreCase("3"))
			state = "Karnataka";
		f.setState(state);
		System.out.println("Press 1 for Petrol  Press 2 for Diesel Press 3 for Kerosene 4 for LPG");
		String i = sc.next();
		if (i.equalsIgnoreCase("1"))
			fuelName = "Petrol";
		if (i.equalsIgnoreCase("2"))
			fuelName = "Diesel";
		if (i.equalsIgnoreCase("3"))
			fuelName = "Kerosene";
		if (i.equalsIgnoreCase("4"))
			fuelName = "LPG";
		f.setFuelName(fuelName);

		if (fuelName.equalsIgnoreCase("Petrol")) {
			cost = getCostDetails(new Petrol(), state);
		}
		if (fuelName.equalsIgnoreCase("Diesel")) {
			cost = getCostDetails(new Diesel(), state);
		}
		if (fuelName.equalsIgnoreCase("Kerosene")) {
			cost = getCostDetails(new Kerosene(), state);
		}
		if (fuelName.equalsIgnoreCase("LPG")) {
			cost = getCostDetails(new LPG(), state);
		}
		f.setCost(cost);

		return f;
	}

	public static void main(String[] args) {
		//Achieving Runtime  polymorphism
		Fuel fuel = new CalculateData();
		fuel.displayFinalData();
	}

}
