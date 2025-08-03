package demoexceptions.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import demoexceptions.entity.Student;

@Service
public interface StudentService {

	//created some abstract methods to achieve abstraction
	public Student saveStudent(Student student);
	
	public Student updateStudent(Student student);
	
	public List<Student> getStudents();
	
	public Optional<Student> getOneStudent(int id);
	
	public void removeStudent(int id);
}