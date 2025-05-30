package javabased.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javabased.classes.Person;
import javabased.config.MyConfig;

public class DriverTest {
	public static void main(String[] args) {
		
		ApplicationContext context =  new AnnotationConfigApplicationContext(MyConfig.class);
		Person p1 = (Person)context.getBean(Person.class);
		p1.calling();
	}
}