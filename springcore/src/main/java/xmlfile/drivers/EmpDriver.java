package xmlfile.drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import xmlfile.classes.Company;
import xmlfile.classes.Employee;

public class EmpDriver {
	public static void main(String[] args) {
		
		//IOC Container-1
		ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
		Employee emp = (Employee)context.getBean("employee");
		emp.work();
		
		//IOC Container-1
		ApplicationContext context1 =  new ClassPathXmlApplicationContext("beans.xml");
		Company cmp = (Company)context.getBean("company");
		cmp.details();
	}
}