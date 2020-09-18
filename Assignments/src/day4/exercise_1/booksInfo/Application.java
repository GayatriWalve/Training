package day4.exercise_1.booksInfo;

import day4.exercise_1.exceptions.MyCustomException;
import day4.exercise_1.exceptions.RangeCheckException;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BookService bs = new BookService();
	 	
		Book b1,b2;
		try {
			b1 = new Book(123,"First head","S.R.vani",400);
			bs.addBook(b1);
			b2 = new Book(124,"First Head Java","S.R.vani",500);
			bs.addBook(b2);
			String bookPresent = bs.getOneBook(124);
			System.out.println("Book name is :"+bookPresent);
			System.out.println("just checking");
			bs.getAllBook();
		} catch (MyCustomException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		} catch (RangeCheckException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		
		
	}

}
