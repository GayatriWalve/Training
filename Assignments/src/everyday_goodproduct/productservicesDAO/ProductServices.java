//author:Gayatri Nandkishor Walve
//here we are just creating interfaces and providing methods to be implemented... 

package everyday_goodproduct.productservicesDAO;

import java.util.Collection;

import everyday_goodproduct.entity.Apparel;
import everyday_goodproduct.entity.Electronics;
import everyday_goodproduct.entity.FoodItems;

public interface ProductServices {
	
	
	
	//Collection<FoodItems> showAllFoodItems();
	boolean addFoodItems(FoodItems item);
	boolean deleteFoodItems(FoodItems item);
	
	//Collection<Apparel> showAllApparel();
	boolean addApparels(Apparel cloth);
	boolean deleteApparel(Apparel cloth);
	
	
	//Collection<Electronics> showAllElectronics();
	boolean addElectronics(Electronics item);
	boolean deleteElectronics(Electronics item);
	
	

}
