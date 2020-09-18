package day2.exercise_1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Product fridge = new Product(1010,"Fridge",700.00,2);
    fridge.setQuantity(30);
    
    //////just checking
    
    ManageProduct mp = new ManageProduct();
     //double discount= mp.calculateDiscount(fridge);
     
     //System.out.println("Discount for fridge is:-"+discount);
     
    
     //mp.showProduct();
   // int tax= mp.calculateTax(fridge);
    
   // System.out.println("Tax is:"+tax);
    
    Product tv = new Product();
    tv.setProductId(123);
    tv.setProductName("TV");
    tv.setRatePerUnit(12000);
    tv.setProductType(3);
    tv.setQuantity(25);
    
  //Product[] productList= {tv,fridge};
    Product[] productList = new Product[2];
    productList[0]=fridge;
    productList[1]=tv;
    
    productList = mp.calculateDiscount(productList);
    for(Product eachProduct: productList )
    {
    	 System.out.println("Product Name:"+eachProduct.getProductName()+" Product Quantity:"+eachProduct.getQuantity()+"Product Cost:"+mp.getCostForEachProduct(eachProduct)+"Product Discount:"+eachProduct.getDiscount());	
    	
    }
   
    System.out.println(mp.toString());
    
    //mp.showProducts(productList);
    //mp.showProductForEach(productList);
    
	}

}
