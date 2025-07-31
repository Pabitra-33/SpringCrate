package javabased.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javabased.classes.Car;
import javabased.config.MyConfig;

public class TestCarDriver {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
		Car car = (Car)context.getBean(Car.class);
		car.driver();
	}
}