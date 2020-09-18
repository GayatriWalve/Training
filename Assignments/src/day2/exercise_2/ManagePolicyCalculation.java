package day2.exercise_2;

public class ManagePolicyCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ManagePolicy managepolicy = new ManagePolicy(1234,"Sneha",30,50000);
        
		Insurance insurance = new Insurance(1234,"Sneha",20,50000);
		
		
		VehicleInsurance vehicleinsurance = new VehicleInsurance(6789, "Ashish",43,30000,4,2019,60000);
		//VehicleInsurance vehicleinsurance = new VehicleInsurance(6789, "Ashish",23,30000,2,2009,60000);

		System.out.println("Policy Holder Name:"+vehicleinsurance.getPolicyHolderName());
		System.out.println("Policy Number="+vehicleinsurance.getPolicyNumber());
		System.out.println("Policy Holder's age="+vehicleinsurance.getAge());
		System.out.println("Insured Amount="+vehicleinsurance.getInsuredAmount());
		double premiumAmount = insurance.calculatePremium();
		System.out.println("Premium Amount of policy="+premiumAmount);
		
		
		System.out.println("Vehicle Model="+vehicleinsurance.getVehicleModel());
		System.out.println("Year of manufacture="+vehicleinsurance.getYearofManufacture());
		System.out.println("Cost of vehicle="+vehicleinsurance.getCostOfVehicle());
	    double premium = vehicleinsurance.calculatePremium();
	    
	    System.out.println("Premium amount of vehicle policy="+premium);
	
	}

}
