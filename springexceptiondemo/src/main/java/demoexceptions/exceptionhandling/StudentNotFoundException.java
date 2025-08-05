package demoexceptions.exceptionhandling;

@SuppressWarnings("serial") //added this line to avoid that coming warning.
public class StudentNotFoundException extends RuntimeException{

	public StudentNotFoundException(String msg) {
		super(msg);
	}
	
	
}
