package com.practice.fullstack.service;

import com.practice.fullstack.model.Student;
import com.practice.fullstack.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
   private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


}
