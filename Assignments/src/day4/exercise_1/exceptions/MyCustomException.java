package day4.exercise_1.exceptions;

public class MyCustomException extends Exception {

	String msg = " ";
	String throwablemsg = " ";
	public MyCustomException(String message, Throwable cause) {
		super(message, cause);
	     msg = message;
	     throwablemsg = cause.getMessage();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		
		
		return this.msg+this.throwablemsg;
	}
	
	

	
}
