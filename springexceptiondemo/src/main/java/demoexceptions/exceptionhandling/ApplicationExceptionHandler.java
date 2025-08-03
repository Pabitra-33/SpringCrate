package demoexceptions.exceptionhandling;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//as we are dealing with distributed application,
//so we are using RestControllerAdvice or we should use ControllerAdvice

@RestControllerAdvice 
public class ApplicationExceptionHandler {
	
	@ExceptionHandler(value = StudentNotFoundException.class)
	public ResponseEntity<ExceptionInfo> studentIfNotFound(StudentNotFoundException stud)
	{
		ExceptionInfo info = new ExceptionInfo();
		info.setCode("EXC001");
		info.setMsg(stud.getMessage());
		info.setLocalDateTime(LocalDateTime.now());
		return new ResponseEntity<ExceptionInfo>(info, HttpStatus.CREATED);
	}
}