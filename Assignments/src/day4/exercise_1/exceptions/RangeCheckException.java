package day4.exercise_1.exceptions;

public class RangeCheckException extends Exception {

	String msg = " ";
//	String throwablemsg = " ";
	public RangeCheckException(String message) {
		super(message);
		
		msg = message;
		//throwablemsg = cause.getMessage();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.msg;
	}

	
	
	
}
