package com.data;

import com.fuel.Fuel;
import com.userDetails.UserData;
import com.userDetails.UserDetails;
/* This class extend from fuel and overrides its calculate method and display final data to end user*/

public class CalculateData extends Fuel {
	FuelData fd;

//This method will do calculation and return total cost
	public FuelData calculate(UserData user) {
		System.out.println("Inside Petrol");
		fd = user.getUserInfo();
		totalCost = fd.getCost() * fd.getNoOfLiters();
		fd.setTotalCost(totalCost);
		return fd;
	}

	//This method will give the final data 
	public void displayFinalData() {
		fd = calculate(new UserDetails());
		System.out.println(
				"UserName:" + fd.getName() + "\n" + "FuelName: " + fd.getFuelName() + "\n" + "No of Liters Entered:"
						+ fd.getNoOfLiters() + "\n" + "State:" + fd.getState() + "\n" + "Cost:" + fd.getTotalCost());
	}

}
