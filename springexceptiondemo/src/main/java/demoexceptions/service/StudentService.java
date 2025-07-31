package demoexceptions.service;

import java.util.List;

import demoexceptions.entity.Student;

public interface StudentService {

	//created some abstract methods to achieve abstraction
	public Student saveStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public List<Student> getStudents();
	
	public void removeStudent(int id);
}