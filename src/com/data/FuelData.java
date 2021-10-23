package com.data;

public class FuelData {

	private String fuelName;// PETROL OR DIESEL
	private String state;// TAMILNADU OR KERALA
	private int cost;// 95 OR 97
	private int totalCost;
	private int noOfLiters;
	private String name;

	public String getFuelName() {
		return fuelName;
	}

	public void setFuelName(String fuelName) {
		this.fuelName = fuelName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(int totalCost) {
		this.totalCost = totalCost;
	}

	public int getNoOfLiters() {
		return noOfLiters;
	}

	public void setNoOfLiters(int noOfLiters) {
		this.noOfLiters = noOfLiters;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
