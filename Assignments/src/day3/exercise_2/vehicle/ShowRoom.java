package day3.exercise_2.vehicle;

import day3.exercise_2.ifaces.Automobile;

public class ShowRoom {

	public Automobile getProduct(int key) {
		
		//factory method - based on the key passed
		// returns the object o type Automobile 
		
		switch (key) {
		case 1:
			return new Bike();			
		case 2:
			return new Car();			
		default:
			return null;
		}
		
	}
	
	public void printEstimate(Automobile polyAuto)
	{
		System.out.println(polyAuto.APPNAME);
		
		System.out.println(polyAuto.getColor());
		System.out.println(polyAuto.getModel());
		System.out.println(polyAuto.getPrice());
	}
}
