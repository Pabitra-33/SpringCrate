package demoexceptions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demoexceptions.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}