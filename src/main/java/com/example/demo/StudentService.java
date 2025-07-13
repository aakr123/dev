package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentService {
    public Student createStudent(Student student);
   public String getStudentById(Long rollNo);
   public List<Student> getStudentsList();
   public Student updateStudentById(Long id,Student student);
   public String deleteStudentById (Long id);
}
