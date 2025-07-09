package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {

    public StudentService service;

    @PostMapping("/student")
    public Student createStudent(Student student){
        return service.createStudent(student);
    }
}
