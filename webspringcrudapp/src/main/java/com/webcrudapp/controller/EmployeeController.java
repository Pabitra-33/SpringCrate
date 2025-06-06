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
import com.webcrudapp.service.EmployeeService;

@RestController
@RequestMapping("/api/employee") //base end-point or url
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

	
	@PostMapping("/save")
	public String savedata(@RequestBody Employee employee) {
		//calling the JPA interface save method to save data
		Employee s1 = employeeService.saveEmployee(employee);
		if(s1 != null) {
			return "Data Saved Successfully!";
		}
		else {
			return "Data not Saved!";
		}
	}
	
	
	@GetMapping("/getall")
	public List<Employee> getAll(){
		return employeeService.getAllEmployee();
	}
	
	
	@GetMapping("/getbyid/{id}")
	public Employee getById(@PathVariable int id) {
		Employee emp = employeeService.getEmployeeById(id);
		return emp;
	}
	
	
	//while updating full object we need to go for put-mapping
	@PutMapping("/update") 
	public String update(@RequestBody Employee emp) {
		Employee em = employeeService.updateEmployee(emp);
		if(em != null) {
			return "Data updated";
		}
		else {
			return "Data not updated";
		}
	}
	
	
	@DeleteMapping("/deletebyid/{id}")
	public String deleteData(@PathVariable int id) {
		Employee emp = employeeService.deleteEmployeeById(id);
		if(emp != null) {
			return "Employee data deleted";
		}
		else {
			return "Data not deleted!!!";
		}
	}
	
	
	//creating our own custom methods
	
	@GetMapping("/getallbycode")
	public List<Employee> getallByCode(@RequestParam int code){
		return employeeService.getAllEmployeeByCode(code);
	}
	
	
	@GetMapping("/getallbyname")
	public List<Employee> getallByName(@RequestParam String name){
		return employeeService.getAllEmployeeByName(name);
	}
	
	
	@GetMapping("/getallbycodename")
	public List<Employee> getallByCodeAndName(@RequestParam int code, @RequestParam String name){
		
		return null;
	}
	
	
	@GetMapping("/getallbygreaterthancode")
	public List<Employee> getallByGreaterThanCode(@RequestParam int code){
		
		return null;
	}
}