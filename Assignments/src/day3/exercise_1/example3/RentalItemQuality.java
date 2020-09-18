package day3.exercise_1.example3;

import day3.exercise_1.ifaces.Rent;

public class RentalItemQuality {
	
	public Rent getItemSelected(int key,int itemId, String itemName, double itemCost, double ratePerDay, int itemQuantity, int noOfDays) 
		{
		switch (key) {
		case 1: return new Computer(itemId, itemName, itemCost, ratePerDay,itemQuantity,noOfDays);
		case 2: return new Furniture(itemId, itemName, itemCost, ratePerDay,itemQuantity,noOfDays);
		default: return null;
			
		}
		
		
	}
	
	public void printTotalCost(Rent item)
	{
		System.out.println("Total cost of selected item is:"+item.calculateTotalCost());
		
	}
	
}
