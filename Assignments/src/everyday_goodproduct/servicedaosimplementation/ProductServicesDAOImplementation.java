//Author :Gayatri Walve
//implementation of the ProductServiceDAO interface methods..

package everyday_goodproduct.servicedaosimplementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import everyday_goodproduct.entity.Apparel;
import everyday_goodproduct.entity.Electronics;
import everyday_goodproduct.entity.FoodItems;
import everyday_goodproduct.productservicesDAO.ProductServices;

public class ProductServicesDAOImplementation implements ProductServices {

	List<FoodItems> foodList=null;
	List<Apparel> apparaleList = null;
	List<Electronics> electronicsList=null;
		
	
	public ProductServicesDAOImplementation() {
		super();
		this.foodList = new ArrayList<FoodItems>();
		this.apparaleList = new ArrayList<Apparel>();
	    this.electronicsList= new ArrayList<Electronics>();
	}
	
	/*
	public void getCategory(int choice)
	{
		switch (choice) {
		case 1:
			this.showAllFoodItems();
			break;
		case 2:
			this.showAllApparel();
		case 3:
			this.showAllElectronics();
		default:
			break;
		}
	}*/

	@Override
	public boolean addFoodItems(FoodItems item) {
		// TODO Auto-generated method stub
		
		
		return this.foodList.add(item);
		
	    
   }

	@Override
	public boolean deleteFoodItems(FoodItems item) {
		// TODO Auto-generated method stub
		return this.foodList.remove(item);
	}

	@Override
	public boolean addApparels(Apparel cloth) {
		// TODO Auto-generated method stub
		return this.apparaleList.add(cloth);
	}

	@Override
	public boolean deleteApparel(Apparel cloth) {
		// TODO Auto-generated method stub
		return this.apparaleList.remove(cloth);
	}

	@Override
	public boolean addElectronics(Electronics item) {
		// TODO Auto-generated method stub
		return this.electronicsList.add(item);
	}

	@Override
	public boolean deleteElectronics(Electronics item) {
		// TODO Auto-generated method stub
		return this.electronicsList.remove(item);
	}

	
	public void showAllFoodItems() {
		
		System.out.println("FoodList items:");
		Collections.sort(this.foodList);
		for(FoodItems item:this.foodList)
		{
			System.out.println(item);
		}
	}

	
	public void showAllApparel() {
		
		Collections.sort(this.apparaleList);
		for(Apparel entity:this.apparaleList)
		{
			System.out.println(entity);
		}
		
	}

	public void showAllElectronics() {
		
		Collections.sort(this.electronicsList);
		for(Electronics entity:this.electronicsList)
		{
			System.out.println(entity);
		}
	}

	
}
