package demoexceptions.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demoexceptions.entity.Student;
import demoexceptions.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/save") //will trigger for the "/students/save" URL
	public Student saveStudent(Student student) {
		return studentService.saveStudent(student);
	}
	
}