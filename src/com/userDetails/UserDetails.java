package com.userDetails;

import java.util.Scanner;

import com.data.FuelData;
import com.stub.Main;

public class UserDetails implements UserData {
	FuelData fd = new FuelData();
	Scanner sc = new Scanner(System.in);
	int noOfLiters;
	String name;

	@Override
	public FuelData getUserInfo() {
		Main m = new Main();
		FuelData f = m.getCost();
		System.out.println("Please Enter your name");
		name = sc.next();
		System.out.println("Please enter the number of Liters");
		noOfLiters = sc.nextInt();
		fd.setName(name);
		fd.setNoOfLiters(noOfLiters);
		fd.setCost(f.getCost());
		fd.setFuelName(f.getFuelName());
		fd.setState(f.getState());
		return fd;

	}

}
