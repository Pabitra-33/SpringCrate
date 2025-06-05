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
	public Employee save(Employee employee) {
		
		return null;
	}

	@Override
	public Employee update(Employee employee) {
		int id = employee.getId();
		Employee emp = employeeRepository.findById(id).orElseThrow(() -> new RuntimeException("Employee with Id "+id+" not found"));
		employeeRepository.save(employee);
		return emp;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee deleteById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee getById(int id) {
		
		return null;
	}
}