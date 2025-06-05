package com.webcrudapp.service;

import java.util.List;

import com.webcrudapp.entity.Employee;

public interface EmployeeService {

	//creating abstract methods
	
	public Employee saveEmployee(Employee employee);//to save data
	
	public Employee updateEmployee(Employee employee);//to update data
	
	public List<Employee> getAllEmployee();//to get the data
	
	public Employee deleteEmployeeById(int id);//to delete the data

	public Employee getEmployeeById(int id);//to find a data by id
}