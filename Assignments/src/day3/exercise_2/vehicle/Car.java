package day3.exercise_2.vehicle;

import day3.exercise_2.ifaces.Automobile;

public class Car implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Grey-Blue";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "BMW";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 8000000.00;
	}

}
