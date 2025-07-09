package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentService {
    public Student createStudent(Student student);
//    public void updateStudent (Long id);
//    public List<Student> getAllStudents();
//    public Student getStudentById(Long id);
}
