package day2.exercise_2;

public class Insurance {

	private int policyNumber;
	private String policyHolderName;
	private int policyHolderAge;
	private double insuredAmount;
	
	public Insurance(int policyNumber, String policyHolderName, int policyHolderAge, double insuredAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.policyHolderAge = policyHolderAge;
		this.insuredAmount = insuredAmount;
	}

	
	
	public int getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public int getAge() {
		return policyHolderAge;
	}

	public void setAge(int age) {
		this.policyHolderAge = age;
	}

	public double getInsuredAmount() {
		return insuredAmount;
	}

	public void setInsuredAmount(double insuredAmount) {
		this.insuredAmount = insuredAmount;
	}
	

	public double calculatePremium()
	{    
		double insuredAmount = 0.0;
		if(getAge()<25)
			insuredAmount = this.getInsuredAmount() * 0.6;
		else 	
			insuredAmount = this.getInsuredAmount() * 0.7;
		
		return insuredAmount;
		
	}
	
	
	
	   
}
