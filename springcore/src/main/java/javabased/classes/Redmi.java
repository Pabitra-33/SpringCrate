package javabased.classes;

import org.springframework.stereotype.Component;

@Component
public class Redmi implements Mobile {

	@Override
	public void call() {
		System.out.println("Calling via Redmi..");
	}
}