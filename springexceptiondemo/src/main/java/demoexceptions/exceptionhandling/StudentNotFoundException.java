package demoexceptions.exceptionhandling;

@SuppressWarnings("serial")
public class StudentNotFoundException extends RuntimeException{

	public StudentNotFoundException(String msg) {
		super(msg);
	}
	
	
}
