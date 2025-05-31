package xmlfile.beanlifecycleDriver;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BikeDriver {
	//main method
	public static void main(String[] args) {
		//IOC Container created
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle.xml");
		
		//to close our application
		context.close();
	}
}