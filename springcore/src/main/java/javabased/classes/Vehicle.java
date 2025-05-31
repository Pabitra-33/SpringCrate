package javabased.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	
	@Autowired
	private Truck truck;
	
	public void engine() {
		System.out.println("Vehicle has engine..!");
		truck.start();
	}
}