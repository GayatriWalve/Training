package day3.exercise_1.example3;

import day3.exercise_1.ifaces.Rent;

public class Furniture implements Rent {
   
	int itemId;
	String itemName;
	double itemCost;
	double ratePerDay;
	int itemQuantity;
	int noOfDays;
	
	
	public Furniture(int itemId, String itemName, double itemCost, double ratePerDay, int itemQuantity, int noOfDays) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.ratePerDay = ratePerDay;
		this.itemQuantity = itemQuantity;
		this.noOfDays = noOfDays;
	}

    

	public int getItemId() {
		return itemId;
	}



	public void setItemId(int itemId) {
		this.itemId = itemId;
	}



	public String getItemName() {
		return itemName;
	}



	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	public double getItemCost() {
		return itemCost;
	}



	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}



	public double getRatePerDay() {
		return ratePerDay;
	}



	public void setRatePerDay(double ratePerDay) {
		this.ratePerDay = ratePerDay;
	}



	public int getItemQuantity() {
		return itemQuantity;
	}



	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}



	public int getNoOfDays() {
		return noOfDays;
	}



	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}



	@Override
	public double calculateTotalCost() {
		// TODO Auto-generated method stub
		return this.ratePerDay*this.itemQuantity*this.noOfDays;
	}

	

	
	

}
