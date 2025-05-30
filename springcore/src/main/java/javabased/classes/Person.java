package javabased.classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("vivo")
public class Person {
	
	@Autowired
	private Mobile mob;
	
	public void calling() {
		System.out.println("Person is Calling...");
		mob.call();
	}
}