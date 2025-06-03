package com.webcrudapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webcrudapp.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	//creation of own custom method
	
	@Query("FROM Employee where code=:code")
	public List<Employee> getAllByCode(int code);
	
	
}