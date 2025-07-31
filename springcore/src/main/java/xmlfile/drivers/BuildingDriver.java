package xmlfile.drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xmlfile.classes.Building;

public class BuildingDriver {
	public static void main(String[] args) {
		//IOC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("testconfig.xml");
		
		Building b1 = (Building) context.getBean("building");
		b1.details();
	}
}