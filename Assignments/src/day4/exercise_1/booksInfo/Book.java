package day4.exercise_1.booksInfo;

import day4.exercise_1.exceptions.MyCustomException;
import day4.exercise_1.exceptions.RangeCheckException;

public class Book{

	public int bookId;
	public String bookName;
	public String bookAuthor;
	public double bookCost;
	
	public Book(int bookId, String bookName, String bookAuthor, double bookCost)throws MyCustomException, RangeCheckException{
		super();
		this.bookId = bookId;
		try {
			this.bookName = bookName;
		} catch (NullPointerException ne) {
			// TODO Auto-generated catch block
			throw new MyCustomException("Book name should not be the null...", ne);
		}
		this.bookAuthor = bookAuthor;
		
		if(bookCost<100 || bookCost>500)
		{
			throw new RangeCheckException("Book cost is out of range...");
		}
		this.bookCost = bookCost;	
		
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		
		return bookName;
	}

	public void setBookName(String bookName)throws MyCustomException{
		try {
			this.bookName = bookName;
		} catch(NullPointerException ne) {
			// TODO Auto-generated catch block
			throw new MyCustomException("Book name should not be the null...", ne);
		}
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public double getBookCost()throws RangeCheckException{
		
		if(bookCost<100 || bookCost>500)
		{
			throw new RangeCheckException("Invalid mobile number");
		}
		return bookCost;
	}

	public void setBookCost(double bookCost) {
		this.bookCost = bookCost;
	}
	
	
	
	
}
