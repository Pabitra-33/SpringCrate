package javabased.classes;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Redmi implements Mobile {

	@Override
	public void call() {
		System.out.println("Calling via Redmi..");
	}
}