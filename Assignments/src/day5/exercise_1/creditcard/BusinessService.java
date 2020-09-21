package day5.exercise_1.creditcard;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

import javax.management.RuntimeErrorException;

public class BusinessService {
	
	public void storeCardDetails(CreditCardDetails[] cardDetails, String filename, int choice)
	{
		switch (choice) {
		case 1:
			System.out.println("Details Written in character format:"+writeToFile(filename,cardDetails));
			break;
		case 2:
			System.out.println("Details Written in byte format:"+writeToObject(filename,cardDetails));
			break;
		default:
			throw new RuntimeErrorException(null, "Invalid choice - try again");
		}
		
	}
	public void storeCardDetails(CreditCardDetails[] cardDetails, int choice)
	{
		switch (choice) {
		case 1:
			System.out.println("Details Written in character format:"+writeToFile("CardInformation.txt",cardDetails));
			break;
		case 2:
			System.out.println("Details Written in byte format:"+writeToObject("CardInformation.ser",cardDetails));
			break;
		default:
			throw new RuntimeErrorException(null, "Invalid choice - try again");
		}
		
	}

	public boolean writeToFile(String file,CreditCardDetails[] cardDetails)
	{
		boolean result = false;
		PrintWriter writer = null;
			
		try {
			 writer = new PrintWriter(new FileWriter(file,true));
			 System.out.println(cardDetails);
			 
			 for(int i =0;i<cardDetails.length;i++)
			 {
				 /*writer.print(cardDetails[i].getCardHolderName());
				 writer.print(cardDetails[i].getCardNumber());
				 writer.print(cardDetails[i].getCreditCardLimit());
				 writer.print(cardDetails[i].getExpiryDate());*/
				 
				 writer.println(cardDetails[i].toString());
				
			 }
			 result = true; 
			 
		} catch (FileNotFoundException e) {
		
			System.err.println(e);
			e.printStackTrace();
		}catch(IOException e)
		{
			System.err.println(e);
			e.getStackTrace();
		}
		finally
		{
			writer.close();
		}
		
		return result;
	}
	
	public boolean writeToObject(String file,CreditCardDetails[] cardDetails)
	{
		boolean result = false;
		ObjectOutputStream outputStream= null;
		try {
			outputStream = new ObjectOutputStream(new FileOutputStream(new File(file)));
			outputStream.writeObject(cardDetails);
			result = true;
			}
			catch(FileNotFoundException e)
			{
				e.getStackTrace();
			}
			catch(IOException e)
			{
				e.getStackTrace();
			}
			catch(ClassCastException e)
			{
				e.getStackTrace();
			}
			finally {
				
				try {
					outputStream.close();
				}
				catch(IOException e) {
					e.getStackTrace();
				}
			}
			
		return result;	
	}

	
	
	public CreditCardDetails[] retrieveCardDetails(CreditCardDetails[] cardDetails)
	{
		ObjectInputStream inputStream = null ;		
		CreditCardDetails[] newCard = new CreditCardDetails[5] ;		
		
		try {
		inputStream = new ObjectInputStream(new FileInputStream(new File("book.ser")));
		for(int i=0;i<cardDetails.length;i++)
		{
		newCard[i]= (CreditCardDetails)inputStream.readObject();
		}
		}
		catch(FileNotFoundException e)
		{
			e.getStackTrace();
		}
		catch(ClassNotFoundException e)
		{
			e.getStackTrace();
		}
		catch(IOException e)
		{
			e.getStackTrace();
		}
		catch(ClassCastException e)
		{
			e.getStackTrace();
		}
		finally {
			
			try {
				inputStream.close();
			}
			catch(IOException e) {
				e.getStackTrace();
			}
		}
		
		
		return newCard;
	}
	
	public CreditCardDetails[] retrieveCardDetails(CreditCardDetails[] cardDetails,String file)
	{
		BufferedReader br = null ;		
		CreditCardDetails[] newCard = new CreditCardDetails[5] ;	
		int k=0;
		String line = null;
		try {
		br = new BufferedReader(new FileReader(file));
		while((line = br.readLine())!= null)
		{
			String[] temp = line.split(",",0);
			CreditCardDetails card = new CreditCardDetails();
			card.setCardHolderName(temp[0]);
			card.setCardNumber(Long.parseLong(temp[1]));
			card.setExpiryDate(Long.parseLong(temp[2]));
			card.setCreditCardLimit(Double.parseDouble(temp[3]));
			newCard[k]=card;
			k++;
		}
		
		}
		catch(FileNotFoundException e)
		{
			e.getStackTrace();
		}
		catch(IOException e)
		{
			e.getStackTrace();
		}
		catch(ClassCastException e)
		{
			e.getStackTrace();
		}
		finally {
			
			try {
				br.close();
			}
			catch(IOException e) {
				e.getStackTrace();
			}
		}
		
		
		return newCard;
	}
	
	
	public CreditCardDetails[] deleteCardDetails(CreditCardDetails[] cardDetails,String name)
	{
		
		int indexToDelete=0;
		for(int i=0;i<cardDetails.length;i++)
		{
		 if(cardDetails[i].getCardHolderName()==name) {
			 indexToDelete = i;
			 break;			 
		 }
		}
		 CreditCardDetails[] newCards = new CreditCardDetails[cardDetails.length-1];
		 int index=0;
			for(int j=0;j<cardDetails.length;j++)
			{
				if(j!= indexToDelete)
				{
					 newCards[index] =cardDetails[j];	
					 index++;
				}
			   	 
			 }
		 
		
		
		return newCards;
	}
}
