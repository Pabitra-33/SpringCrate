package com.webcrudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcrudapp.entity.Employee;
import com.webcrudapp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImplementation implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return null;
	}

	
	@Override
	public Employee updateEmployee(Employee employee) {
		int id = employee.getId();
		Employee emp = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee with Id "+id+" not found"));
		employeeRepository.save(employee);
		return emp;
	}

	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	
	@Override
	public Employee deleteEmployeeById(int id) {
		Employee em = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee with id "+id+" not exist"));
		employeeRepository.deleteById(id);
		return em;
	}

	
	@Override
	public Employee getEmployeeById(int id) {
		Employee emp = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee with Id "+id+" not found"));
		return emp;
	}


	@Override
	public List<Employee> getAllEmployeeByCode(int code) {
		return employeeRepository.getAllByCode(code);
	}


	@Override
	public List<Employee> getAllEmployeeByName(String name) {
		return employeeRepository.getAllByName(name);
	}


	@Override
	public List<Employee> getByCodeAndName(int code, String name) {
		return employeeRepository.getAllByCodeAndName(code, name);
	}
	
	
}