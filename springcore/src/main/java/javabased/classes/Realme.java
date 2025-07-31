package javabased.classes;

import org.springframework.stereotype.Component;

@Component
public class Realme implements Mobile{

	@Override
	public void call() {
		System.out.println("Calling via Realme...");
	}
}
