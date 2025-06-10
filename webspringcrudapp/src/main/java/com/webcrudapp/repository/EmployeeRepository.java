package com.webcrudapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.webcrudapp.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	//creation of own custom method
	
	@Query("FROM Employee where code=:code") //using named query parameter we are writing dynamic query
	public List<Employee> getAllByCode(int code);
	
	
	@Query("FROM Employee where name=:name")
	public List<Employee> getAllByName(String name);
	
	
	@Query("FROM Employee where code=:code AND name=:name")
	public List<Employee> getAllByCodeAndName(int code, String name);
	
	
	@Query("FROM Employee where code>:code")
	public List<Employee> getAllByGreaterThanCode(int code);
	
	@Query("FROM Employee where code<:code")
	public List<Employee> getAllByLesserThanCode(int code);
	
	@Query("from Employee where code between :code1 And :code2")
    List<Employee> getAllWhereCodeeBetween(int code1, int code2);
}