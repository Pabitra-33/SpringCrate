package com.webcrudapp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	
	@GetMapping("/getbyid/{id}")
	public Employee getById(@PathVariable int id) {
		
		Employee emp = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee with Id "+id+" not found"));
		return emp;
	}
	
	
	//while updating full object we need to go for put-mapping
	@PutMapping("/update") 
	public String update(@RequestBody Employee emp) {
		int id = emp.getId();//get the id
		Employee existingEmp = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee with Id "+id+" not found"));
		System.out.println(existingEmp);
		employeeRepository.save(emp);
		return "Data updated";
	}
	
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteData(@PathVariable int id) {
		
		boolean flag = employeeRepository.existsById(id);
		if(flag) {
			employeeRepository.deleteById(id);
			return "Employee Data deleted";
		}
		else {
			return "Id not found";
		}
	}
	
	
	//creating our own custom methods
	
	@GetMapping("/getallbycode")
	public List<Employee> getallByCode(@RequestParam int code){
		
		return employeeRepository.getAllByCode(code);
	}
	
	
	
	@GetMapping("/getallbyname")
	public List<Employee> getallByName(@RequestParam String name){
		
		return employeeRepository.getAllByName(name);
	}
}