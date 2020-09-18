package day2.exercise_2;

public class VehicleInsurance extends Insurance{
	
	public int vehicleModel;
	public long yearofManufacture;
	public double costOfVehicle;
	
	
	public VehicleInsurance(int policyNumber, String policyHolderName, int policyHolderAge, double insuredAmount,
			int vehicleModel, long yearofManufacture, double costOfVehicle) {
		super(policyNumber, policyHolderName, policyHolderAge, insuredAmount);
		this.vehicleModel = vehicleModel;
		this.yearofManufacture = yearofManufacture;
		this.costOfVehicle = costOfVehicle;
	}
	


	public int getVehicleModel() {
		return vehicleModel;
	}



	public void setVehicleModel(int vehicleModel) {
		this.vehicleModel = vehicleModel;
	}



	public long getYearofManufacture() {
		return yearofManufacture;
	}



	public void setYearofManufacture(long yearofManufacture) {
		this.yearofManufacture = yearofManufacture;
	}



	public double getCostOfVehicle() {
		return costOfVehicle;
	}



	public void setCostOfVehicle(double costOfVehicle) {
		this.costOfVehicle = costOfVehicle;
	}



	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium=0.0;
		if(this.vehicleModel==2)
		{
			if(this.yearofManufacture < 2018)
				premium = this.getInsuredAmount() * 0.5;
			else
				premium = this.getInsuredAmount() * 0.6;
		}
		else 
		{
			if(this.yearofManufacture < 2018)
				premium = this.getInsuredAmount() * 0.4;
			else
				premium = this.getInsuredAmount() * 0.5;
		}
		return premium;
	}
	
	
	
	

}
