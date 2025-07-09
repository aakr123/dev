package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepository repository;
    @Override
    public Student createStudent(Student student) {
        repository.save(student);
        return student;
    }
//    public void updateStudent (Long id, Student student){}
//    public List<Student> getAllStudents(){}
//    public Student getStudent(Long id){}

}
