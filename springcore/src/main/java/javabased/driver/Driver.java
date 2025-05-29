package javabased.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javabased.classes.Vehicle;
import javabased.config.MyConfig;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Vehicle vcl = (Vehicle)context.getBean("vehicle");
		vcl.engine();
	}
}