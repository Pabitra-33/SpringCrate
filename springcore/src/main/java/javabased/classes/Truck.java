package javabased.classes;

import org.springframework.stereotype.Component;

@Component
public class Truck {
	
	private String tname = "TATA";
	
	public void start() {
		System.out.println("Truck get started...");
	}
}