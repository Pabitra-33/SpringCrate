package demoexceptions.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import demoexceptions.entity.Student;
import demoexceptions.repository.StudentRepository;

@Component
public  class StudentServiceImplementation implements  StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		int id = student.getId();
		boolean stud = studentRepository.existsById(id);
		if(stud) {
			return studentRepository.save(student);
		}
		else {
			return student;
		}
	}

	@Override
	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	@Override
	public void removeStudent(int id) {
		boolean res = studentRepository.existsById(id);
		if(res) {
			studentRepository.deleteById(id);
		}
	}
}
