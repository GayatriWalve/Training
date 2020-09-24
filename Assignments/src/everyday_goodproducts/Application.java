//Author:Gayatri Nandkishorv Walve
//this is the main method where we r creating arraylist for each product and performing operations on it 
package everyday_goodproducts;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import everyday_goodproduct.entity.Apparel;
import everyday_goodproduct.entity.Electronics;
import everyday_goodproduct.entity.FoodItems;
import everyday_goodproduct.servicedaosimplementation.ProductServicesDAOImplementation;

public class Application {

	public static void main(String[] args) {
		
		FoodItems milk=new FoodItems(111, "Milk", 25.50, "24/09/2020", "26/09/2020", "Yes", 40);
		FoodItems curd=new FoodItems(112, "Curd", 20.00, "22/09/2020", "30/09/2020", "Yes", 35);
		FoodItems cake=new FoodItems(101, "Cake", 250.00, "23/09/2020", "26/09/2020", "No", 50);
		
		Apparel tshirt=new Apparel(222, "T-shirt",550.00, "Large", "Cotton", 138);
		Apparel jeans=new Apparel(243, "Jeans",850.00, "Extra Large", "Cotton", 200);
		Apparel sweater=new Apparel(122, "Sweater",1550.00, "Small", "Woolen", 178);
		
		Electronics tv = new Electronics(1013, "TV", 45000.00, 12, 120);
		Electronics mobile = new Electronics(1045, "Mobile", 25000.00, 18, 200);
		Electronics wifi = new Electronics(1213, "Wi-Fi Dongal", 4000.00, 24, 50);
		
		ProductServicesDAOImplementation psDAO =new ProductServicesDAOImplementation();
		// created the object of class where all methods have been overriden
		
		psDAO.addFoodItems(milk);
		psDAO.addFoodItems(curd);//just adding fooditems in the list
		psDAO.addFoodItems(cake);
		
		psDAO.addApparels(tshirt);
		psDAO.addApparels(jeans);
		psDAO.addApparels(sweater);
		
		psDAO.addElectronics(mobile);
		psDAO.addElectronics(wifi);
		psDAO.addElectronics(tv);
		
		System.out.println("\n 1.FoodItems\n 2.Apparels\n 3.Electronics");
		System.out.println("Enter the choice among above 3:");//asking for user choice
		int choice=0;
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			psDAO.showAllFoodItems();
			break;
		case 2:
			psDAO.showAllApparel();
			break;
		case 3:
			psDAO.showAllElectronics();
			break;
		default:
			break;
		}
	}

}
