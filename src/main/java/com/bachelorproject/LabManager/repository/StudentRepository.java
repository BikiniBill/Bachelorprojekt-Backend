package com.bachelorproject.LabManager.repository;

import com.bachelorproject.LabManager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Interface to store the Student data in the database
 * -> JpaRepository has a lot of methods for this purpose
 */
public interface StudentRepository extends JpaRepository<Student, Long> {

}
