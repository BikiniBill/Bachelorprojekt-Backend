package com.bachelorproject.LabManager.repository;

import com.bachelorproject.LabManager.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Interface to store the Student data in the database
 * -> JpaRepository has a lot of methods for this purpose
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteStudentById(Long id); // query method

    Optional<Student> findStudentById(Long id);
}
