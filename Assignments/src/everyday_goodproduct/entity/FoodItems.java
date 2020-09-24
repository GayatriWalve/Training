package everyday_goodproduct.entity;

public class FoodItems implements Comparable<FoodItems> {
	
	public int itemCode;
	public String itemName;
	public double itemUnitPrice;
	public String dateOfMAnufacturer;
	public String dateOfExpiry;
	public String Vegetarian;
	public int itemQuantity;
	
	
	
	public FoodItems() {
		super();
		// TODO Auto-generated constructor stub
	}



	public FoodItems(int itemCode, String itemName, double itemUnitPrice, String dateOfMAnufacturer,
			String dateOfExpiry, String vegetarian, int itemQuantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemUnitPrice = itemUnitPrice;
		this.dateOfMAnufacturer = dateOfMAnufacturer;
		this.dateOfExpiry = dateOfExpiry;
		this.Vegetarian = vegetarian;
		this.itemQuantity = itemQuantity;
	}



	public int getItemCode() {
		return itemCode;
	}



	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}



	public String getItemName() {
		return itemName;
	}



	public void setItemName(String itemName) {
		this.itemName = itemName;
	}



	public double getItemUnitPrice() {
		return itemUnitPrice;
	}



	public void setItemUnitPrice(double itemUnitPrice) {
		this.itemUnitPrice = itemUnitPrice;
	}



	public String getDateOfMAnufacturer() {
		return dateOfMAnufacturer;
	}



	public void setDateOfMAnufacturer(String dateOfMAnufacturer) {
		this.dateOfMAnufacturer = dateOfMAnufacturer;
	}



	public String getDateOfExpiry() {
		return dateOfExpiry;
	}



	public void setDateOfExpiry(String dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}



	public String isVegetarian() {
		return Vegetarian;
	}



	public void setVegetarian(String vegetarian) {
		Vegetarian = vegetarian;
	}



	public int getItemQuantity() {
		return itemQuantity;
	}



	public void setItemQuantity(int itemQuantity) {
		this.itemQuantity = itemQuantity;
	}


  
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Vegetarian == null) ? 0 : Vegetarian.hashCode());
		result = prime * result + ((dateOfExpiry == null) ? 0 : dateOfExpiry.hashCode());
		result = prime * result + ((dateOfMAnufacturer == null) ? 0 : dateOfMAnufacturer.hashCode());
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + itemQuantity;
		long temp;
		temp = Double.doubleToLongBits(itemUnitPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItems other = (FoodItems) obj;
		if (Vegetarian == null) {
			if (other.Vegetarian != null)
				return false;
		} else if (!Vegetarian.equals(other.Vegetarian))
			return false;
		if (dateOfExpiry == null) {
			if (other.dateOfExpiry != null)
				return false;
		} else if (!dateOfExpiry.equals(other.dateOfExpiry))
			return false;
		if (dateOfMAnufacturer == null) {
			if (other.dateOfMAnufacturer != null)
				return false;
		} else if (!dateOfMAnufacturer.equals(other.dateOfMAnufacturer))
			return false;
		if (itemCode != other.itemCode)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		if (itemQuantity != other.itemQuantity)
			return false;
		if (Double.doubleToLongBits(itemUnitPrice) != Double.doubleToLongBits(other.itemUnitPrice))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "FoodItems [itemCode=" + itemCode + ", itemName=" + itemName + ", itemUnitPrice=" + itemUnitPrice
				+ ", dateOfMAnufacturer=" + dateOfMAnufacturer + ", dateOfExpiry=" + dateOfExpiry + ", Vegetarian="
				+ Vegetarian + ", itemQuantity=" + itemQuantity + "]";
	}


//here we are comparing the quantity so that the Collections.sort(); will sort the list by quantity attribute
	@Override
	public int compareTo(FoodItems o) {
		if(this.itemQuantity<o.itemQuantity)return 1;
		if(this.itemQuantity>o.itemQuantity) return -1;
		return 0;
	}
	
	

	
}
