package day3.exercise_2.ifaces;

public interface Automobile {
	
	//public static final variable by default
	String APPNAME = "Quatation Generation System";

	public abstract String getColor();
	public String getModel();
	double getPrice();
	
	//all methods are public and abstract by default...
	//its just for understanding....we have 3 types of defining
	
}
