package com.practice.fullstack.repository;

import com.practice.fullstack.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
