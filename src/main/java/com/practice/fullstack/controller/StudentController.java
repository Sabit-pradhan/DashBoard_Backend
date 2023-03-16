package com.practice.fullstack.controller;

import com.practice.fullstack.model.Student;
import com.practice.fullstack.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/fullstack")
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity<Student>(studentService.saveStudent(student), HttpStatus.CREATED);
    }
}
