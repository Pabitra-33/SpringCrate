package xmlfile.drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xmlfile.classes.Person;

public class Driver {
	public static void main(String[] args) {
		//IOC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		//down-cast to get Person type data
		Person per = (Person)context.getBean("person");
		
		//call the person method
		per.walk();
	}
}