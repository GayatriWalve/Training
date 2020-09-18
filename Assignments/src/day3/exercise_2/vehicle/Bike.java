package day3.exercise_2.vehicle;

import day3.exercise_2.ifaces.Automobile;

public class Bike implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Blue";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Splendar";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 70000.00;
	}

}
