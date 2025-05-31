package javabased.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import javabased.classes.Car;

@Configuration
@ComponentScan(basePackages = "javabased.classes")
public class MyConfig {
	
	//creating a method to return the pre-defined class object
	//as we don't have access to it, so we use @bean annotation.
	@Bean
	public Car getCar() {
		return new Car();
	}
}