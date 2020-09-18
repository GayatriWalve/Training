package day3.exercise_2.vehicle;

import day3.exercise_2.ifaces.Automobile;

public class NewShowRoom extends ShowRoom {

	@Override
	public Automobile getProduct(int key) {
		// TODO Auto-generated method stub
		/*super.getProduct(key);
		switch (key) {
		case 3:
			return new Tractor();	
		default:
			return null;
		*/
		// or we can have if else also
		if(key == 3)
		 {
		   return new Tractor();
		 }
		 else
		 {
		  return super.getProduct(key);
		 }
		 
		
	}
	
	

}
