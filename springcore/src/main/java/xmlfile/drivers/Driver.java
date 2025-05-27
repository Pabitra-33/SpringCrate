package xmlfile.drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xmlfile.classes.Mobile;
import xmlfile.classes.Person;

public class Driver {
	public static void main(String[] args) {
		//IOC Container-1
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		//down-cast to get Person type data
		Person per = (Person)context.getBean("person");
		
		//call the person method
		per.walk();
		
		
		//IOC Container-1
		ApplicationContext context1 = new ClassPathXmlApplicationContext("config.xml");
				
		//down-cast to get Person type data
		Mobile mob = (Mobile)context1.getBean("mobile");
				
	    //call the person method
		mob.call();
	}
}