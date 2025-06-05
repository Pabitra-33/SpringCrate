package com.webcrudapp.service;

import java.util.List;

import com.webcrudapp.entity.Employee;

public interface EmployeeService {

	//creating abstract methods
	
	public Employee save(Employee employee);//to save data
	
	public Employee update(Employee employee);//to update data
	
	public List<Employee> getAll();//to get the data
	
	public Employee deleteById(int id);//to delete the data

	public Employee getById(int id);//to find a data by id
}