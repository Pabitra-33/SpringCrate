package demoexceptions.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "student_info")
@Data
public class Student {
	
	@Id
	private Integer id;
	private String name;
	private int age;
	
}