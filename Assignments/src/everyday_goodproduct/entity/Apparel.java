package everyday_goodproduct.entity;

public class Apparel implements Comparable<Apparel>{

	public int itemCode;
	public String itemName;
	public double itemUnitPrice;
	public String size;
	public String typeOfMaterial;
	public int itemQuantity;
	
	public Apparel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Apparel(int itemCode, String itemName, double itemUnitPrice, String size, String typeOfMaterial,
			int itemQuantity) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemUnitPrice = itemUnitPrice;
		this.size = size;
		this.typeOfMaterial = typeOfMaterial;
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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getTypeOfMaterial() {
		return typeOfMaterial;
	}

	public void setTypeOfMaterial(String typeOfMaterial) {
		this.typeOfMaterial = typeOfMaterial;
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
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		result = prime * result + ((typeOfMaterial == null) ? 0 : typeOfMaterial.hashCode());
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
		Apparel other = (Apparel) obj;
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
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		if (typeOfMaterial == null) {
			if (other.typeOfMaterial != null)
				return false;
		} else if (!typeOfMaterial.equals(other.typeOfMaterial))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Apparel [itemCode=" + itemCode + ", itemName=" + itemName + ", itemUnitPrice=" + itemUnitPrice
				+ ", size=" + size + ", typeOfMaterial=" + typeOfMaterial + ", itemQuantity=" + itemQuantity + "]";
	}

	//here we are comparing the quantity so that the Collections.sort(); will sort the list by quantity attribute
	@Override
	public int compareTo(Apparel o) {
		if(this.itemQuantity<o.itemQuantity)return 1;
		if(this.itemQuantity>o.itemQuantity) return -1;
		return 0;
	}
	
	
	
}
