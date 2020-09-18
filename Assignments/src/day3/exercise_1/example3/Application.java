package day3.exercise_1.example3; 

import java.util.Scanner;
import day3.exercise_1.ifaces.Rent;


public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//rgjhnjk
		
      Scanner sc = new Scanner(System.in);
      String msg = " ";
      do {
		
		System.out.println("Enter the Item you want on rent:- 1.Computer  or 2.Furniture");		
        int key = sc.nextInt();
        RentalItemQuality riq = new RentalItemQuality();        
        
           System.out.println("Enter Item id:");
           int itemid = sc.nextInt();
           System.out.println("Enter Item name:");
           String itemname = sc.next();
           System.out.println("Enter Item cost:");
           double itemcost = sc.nextDouble();
           System.out.println("Enter rate per day:");
           double rate = sc.nextDouble();
           System.out.println("Enter item quantity:");
           int quantity = sc.nextInt();
           System.out.println("Enter the no of days for you want the item on rent:");
           int days = sc.nextInt();
           
           Rent choice = riq.getItemSelected(key,itemid, itemname, itemcost, rate,quantity,days);
        
          if(choice==null)
          {
        	  System.out.println("Sorry..you have selected wrong choice...plz select 1.Computer or 2.Furniture");
        	  
          }
          else
          {
        	  riq.printTotalCost(choice);
        	  
          }          
       
     
		System.out.println("Do you want to continue...?");
		msg = sc.next();
		
		
      }while(msg.equals("y"));
      
      sc.close();    //scanner closed...
	}

}
