package xmlfile.beanlifecycle;

public class Bike {
	
	//constructor
	public Bike() {
		System.out.println("Bike Started.!");
	}
	
	public void start() {
		System.out.println("Bike is going...");
	}
	
	public void stop() {
		System.out.println("Bike is stopped!");
	}
}