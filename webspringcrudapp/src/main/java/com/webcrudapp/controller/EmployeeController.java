package com.webcrudapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webcrudapp.entity.Employee;
import com.webcrudapp.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/employee") //base end-point or url
public class EmployeeController { 
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@PostMapping("/save")
	public String savedata(@RequestBody Employee employee) {
		//calling the JPA interface save method to save data
		employeeRepository.save(employee);
		return "Data Saved...";
	}
	
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return employeeRepository.findAll();
	}
}