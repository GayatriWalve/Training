package day5.exercise_1.creditcard;
import java.io.Serializable;
public class CreditCardDetails implements Serializable {
	
	private static final long serialVersionUID = 28L;
	public String cardHolderName;
	public long cardNumber;
	public long expiryDate;
	public transient double creditCardLimit;
	public CreditCardDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CreditCardDetails(String cardHolderName, long cardNumber, long expiryDate, double creditCardLimit) {
		super();
		this.cardHolderName = cardHolderName;
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.creditCardLimit = creditCardLimit;
	}
	public String getCardHolderName() {
		return cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public long getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(long expiryDate) {
		this.expiryDate = expiryDate;
	}
	public double getCreditCardLimit() {
		return creditCardLimit;
	}
	public void setCreditCardLimit(double creditCardLimit) {
		this.creditCardLimit = creditCardLimit;
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cardHolderName == null) ? 0 : cardHolderName.hashCode());
		result = prime * result + (int) (cardNumber ^ (cardNumber >>> 32));
		long temp;
		temp = Double.doubleToLongBits(creditCardLimit);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (int) (expiryDate ^ (expiryDate >>> 32));
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
		CreditCardDetails other = (CreditCardDetails) obj;
		if (cardHolderName == null) {
			if (other.cardHolderName != null)
				return false;
		} else if (!cardHolderName.equals(other.cardHolderName))
			return false;
		if (cardNumber != other.cardNumber)
			return false;
		if (Double.doubleToLongBits(creditCardLimit) != Double.doubleToLongBits(other.creditCardLimit))
			return false;
		if (expiryDate != other.expiryDate)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Card Holder Name :"+this.cardHolderName+", Card Number: "+this.cardNumber+", Expiry Date:"+this.expiryDate+"And Card Limits:"+this.creditCardLimit;
	}
	
	

}
