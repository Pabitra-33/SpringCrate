package javabased.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Autowired
	private Mobile mob;
	
	public void calling() {
		System.out.println("Person is Calling...");
		mob.call();
	}
}