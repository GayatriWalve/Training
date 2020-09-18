package day4.exercise_1.booksInfo;

import java.util.NoSuchElementException;

public class BookService {

	Book[] booklist = new Book[10];
	int k =0;
	public void addBook(Book bk)//int id,String name, String author, double price) //throws MyCustomException, RangeCheckException
	{
		booklist[k] =bk;// new Book(id,name,author,price);
		k++;
		System.out.println(bk.getBookName()+" book added successfully...");
	}
	
	public String getOneBook(int id)
	{
	 //boolean result = false;
	int result=0;
	 String name = " ";
	 for(int i=0;i<k;i++)
	 {
		if(booklist[i].getBookId()==id)
		{
			result = 1;
			name = booklist[i].getBookName();
			
		}
			 
	 }
	 if(result == 0)
	 {
		 throw new NoSuchElementException("Book not found");
	 }
	 System.out.println("Book found:"+name);
	return name;	
	}
	
	public void getAllBook()
	{
		 for(int i=0;i<booklist.length;i++)
		 {
			 System.out.println("Book name is="+booklist[i].getBookName());
				 
		 }
	}
	
}
