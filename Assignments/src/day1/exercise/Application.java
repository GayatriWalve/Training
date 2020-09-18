package day1.exercise;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Greeting grtobj = new Greeting();
    
    System.out.println(grtobj.getMessage());
    
    
    Book headFirst = new Book();
    headFirst.setBookNumber(1234);
    headFirst.setBookName("Hello Jungle");
    System.out.println(headFirst.getBookName());
    Book spring = new Book(2020,456,"Master piece","orielly","Ramesh");
    
    System.out.println(spring.getBookName());
    System.out.println(spring.getBookNumber());
	}

}
