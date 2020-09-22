package day5.exercise_1.creditcard;

import java.util.Scanner;

public class ClientApplication {

	public static void main(String[] args) {
		
		CreditCardDetails[] cardDetails = new CreditCardDetails[2];
		Scanner sc = new Scanner(System.in);
		
		String format = null;
		String fileName = null;
		
		
		CreditCardDetails creditCard = new CreditCardDetails("Rohan Pagare",454567,0523,50000.00);
		CreditCardDetails creditCard1 = new CreditCardDetails("Nikita rahane",451367,0325,25000.00);
		cardDetails[0] = creditCard;
		cardDetails[1] = creditCard1;
		BusinessService bs = new BusinessService();
		
		System.out.println("Enter the choice For user define values: 1.Write in file 2.Write to object");
		int choice = sc.nextInt();
			
			System.out.println("Enter the filename:");
			fileName = sc.next();
			
					
		 bs.storeCardDetails(cardDetails,fileName,choice);
		
		bs.storeCardDetails(cardDetails,choice);
		
		bs.retrieveCardDetails(cardDetails);
		bs.retrieveCardDetails(cardDetails,fileName);
		bs.deleteCardDetails(cardDetails, "Nikita rahane");
		
	}

}
