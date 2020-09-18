package day3.exercise_2.vehicle;

import day3.exercise_2.ifaces.Automobile;
import java.util.*;
public class Application {

	public static void main(String[] args) {
	
		//here we can have
	  // ShowRoom saiCars= new NewShowRoom(); instead of new class as this is extended class
		
		String msg = " ";
		do
		{
		NewShowRoom rajCars = new NewShowRoom();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values :");
		int choice = sc.nextInt();
		
		Automobile selected = rajCars.getProduct(choice);
		
		if(selected!=null )
		{
			rajCars.printEstimate(selected);
		}
		else
		{
			System.out.println("Wrong choice...please select right value..1,2 or 3");
	
		}
				
		 msg = sc.next();
		}while(msg.equals("y"));
		
		
		
		//System.out.println(ch);
	//	sc.close();
		
		
	}

}
