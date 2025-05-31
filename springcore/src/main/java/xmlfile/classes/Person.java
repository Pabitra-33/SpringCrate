package xmlfile.classes;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {
	@Autowired
	private Mobile mob;
	
	public void walk() {
		System.out.println("Person can Walk...!");
	}
}