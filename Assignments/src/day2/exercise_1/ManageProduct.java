package day2.exercise_1;

public class ManageProduct {

	public Product[] calculateDiscount(Product[] productList)
	{
		double discount=0.0; 
		
		//example for if-else
		
		//for(int i=0;i<product.length;i++)
			
	    for(Product product:productList)
		{
		     if(product.getRatePerUnit()>500 && product.getRatePerUnit()<=1000)
		     {
		    	 discount = 0.10;
		     }else if (product.getRatePerUnit()>1000)
		     {
		    	 discount = 0.15;
		     }
		     product.setDiscount(discount);
		}
		
		return productList;
		
	}
	
	public int calculateTax(Product product)
	{		
		
		switch(product.getProductType())
		{
		
		case 1: return 5;
		case 2: return 10;
		case 3: return 15;
		default: return 28;
		}		
		
	}
	
	public void showProducts(Product[] productList)
	{
		for(int i=0;i<productList.length;i++)
		{
			
			//System.out.println("Product"+i+"=>"+productList[i].getProductName());
		   System.out.println(productList[i]);
		}
	}
	
	public void showProductForEach(Product[] productList)
	{
		
		for(Product eachProduct:productList)
		{
			System.out.println(eachProduct.getProductName()+"-"+eachProduct.getRatePerUnit());
		}
	}
	
	public double getCostForEachProduct(Product product)
	{
		double cost=0.0;
		 cost = (product.getQuantity() * product.getRatePerUnit()) - (product.getQuantity() * product.getRatePerUnit() * product.getDiscount());
		
		return cost;
	}
	
}
