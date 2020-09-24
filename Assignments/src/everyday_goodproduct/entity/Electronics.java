package everyday_goodproduct.entity;

public class Electronics implements Comparable<Electronics>{

	public int itemCode;
	public String itemName;
	public double itemUnitPrice;
	public int warranty;
	public int itemQuantity;
	
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electronics(int itemCode, String itemName, double itemUnitPrice, int warranty, int itemQuantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemUnitPrice = itemUnitPrice;
		this.warranty = warranty;
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

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
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
		result = prime * result + itemCode;
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
		result = prime * result + itemQuantity;
		long temp;
		temp = Double.doubleToLongBits(itemUnitPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + warranty;
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
		Electronics other = (Electronics) obj;
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
		if (warranty != other.warranty)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Electronics [itemCode=" + itemCode + ", itemName=" + itemName + ", itemUnitPrice=" + itemUnitPrice
				+ ", warranty=" + warranty + ", itemQuantity=" + itemQuantity + "]";
	}

	//here we are comparing the quantity so that the Collections.sort(); will sort the list by quantity attribute
	@Override
	public int compareTo(Electronics o) {
		if(this.itemQuantity<o.itemQuantity)return 1;
		if(this.itemQuantity>o.itemQuantity) return -1;
		return 0;
	}
	
	
	
}
