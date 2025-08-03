package demoexceptions.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demoexceptions.entity.Student;
import demoexceptions.exceptionhandling.StudentNotFoundException;
import demoexceptions.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	
	//saving a new student data coming from the user.
	
	@PostMapping("/create") //will trigger for the "/students/save" URL
	public String saveStudent(@RequestBody Student student) {
		Student s1 = studentService.saveStudent(student);
		
		if(s1 != null) {
			return "Data Saved";
		}
		else {
			return "Data Not Saved";
		}
	}
	
	
	//saving a new student data coming from the user by validating the id.
	
	@PostMapping("/savestudentvalidateid")
	public ResponseEntity<Student> findStudentById(@RequestBody Student student)
	{
		if(student.getId() >= 100) {
			Student save = studentService.saveStudent(student);
			return new ResponseEntity<Student>(save, HttpStatus.CREATED);
		}
		else {
			System.out.println("Student Id Is Invalid...");
			throw new StudentNotFoundException("Student with this given id not exist");
		}
	}
	
	
	//updating the data by finding the record using student id.
	
	@PutMapping("/update")
	public String updateStudents(@RequestBody Student student) 
	{
		Student update = studentService.updateStudent(student);
		if(update != null) {
			return "Data Updated";
		}
		else {
			return "Student with this id not exist";
		}
	}
	
	
	//fetching all the students from our database.
	
	@GetMapping("/read")
	public List<Student> getAllStudents()
	{
		return studentService.getStudents();
	}
	
	
	//deleting the student by taking the id from the user.
	
	@DeleteMapping("/delete/{id}")
	public String deleteStudentById(@PathVariable int id)
	{
		Optional<Student> stud = studentService.getOneStudent(id);
		
		if(stud.get() != null) {
			studentService.removeStudent(id);
			return "Data Deleted";
		}
		else {
			System.out.println("Student with this id not found");
			return "Student with this id does not found";
		}
	}
	
}