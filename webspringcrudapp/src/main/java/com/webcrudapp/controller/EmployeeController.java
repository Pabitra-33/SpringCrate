package com.webcrudapp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
		return "Data Saved Successfully!";
	}
	
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return employeeRepository.findAll();
	}
	
	
	@PutMapping("/update") //while updating full object we need to go for putmapping
	public String update(@RequestBody Employee emp) {
		int id = emp.getId();//get the id
		Optional<Employee> optional = employeeRepository.findById(id);
		Employee e1 = optional.get();
		System.out.println(e1);
		employeeRepository.save(emp);
		return "data updated";
	}
}