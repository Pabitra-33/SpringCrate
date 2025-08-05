package demoexceptions.exceptionhandling;

@SuppressWarnings("serial") //added this line to avoid that coming warning.
public class IdNotFoundException extends RuntimeException
{
	public IdNotFoundException(String msg) {
		super(msg);
	}
}