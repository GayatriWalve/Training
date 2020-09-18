package day3.exercise_2.vehicle;

import day3.exercise_2.ifaces.Automobile;

public class Tractor implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Red";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Captain";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 40000.00;
	}

}
