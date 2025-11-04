package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface StudentService {
    public Student createStudent(Student student);
   public String getStudentById(Long rollNo);
   public List<Student> getStudentsList();
   public Student updateStudentById(Long id,Student student);
   public ResponseEntity<Map<String, String>> deleteStudentById (Long id);
}
