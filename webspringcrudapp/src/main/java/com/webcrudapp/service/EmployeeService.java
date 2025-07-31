package com.webcrudapp.service;

import java.util.List;

import com.webcrudapp.entity.Employee;

public interface EmployeeService {

	//creating CRUD abstract methods
	public Employee saveEmployee(Employee employee);//to save data
	
	public Employee updateEmployee(Employee employee);//to update data
	
	public List<Employee> getAllEmployee();//to get the data of all employees
	
	public Employee deleteEmployeeById(int id);//to delete the data

	public Employee getEmployeeById(int id);//to find a data by id
	
	public List<Employee> getAllEmployeeByCode(int code);//finding the employees based on the code

	public List<Employee> getAllEmployeeByName(String name);//finding the employees by name
	
	public List<Employee> getByCodeAndName(int code, String name);
	
	public List<Employee> getAllByGreaterThanCode(int code);
	
	public List<Employee> getAllByLesserThanCode(int code);
	
	public List<Employee> getAllByBetweenCode(int code1, int code2);
}