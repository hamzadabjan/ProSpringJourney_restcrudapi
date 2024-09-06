package com.hamza.springboot.training.restcrudapis.rest;


import com.hamza.springboot.training.restcrudapis.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    // define endpoint for "/student" - return a list of student

    @GetMapping("/students")
    public List<Student> getStudent(){
        List<Student> theStudents = new ArrayList<>();

        theStudents.add(new Student("Hamza","Dabjan"));
        theStudents.add(new Student("Hanan","Shmiea"));
        theStudents.add(new Student("Rayhan","Dabjan"));

        return theStudents;
    }
}