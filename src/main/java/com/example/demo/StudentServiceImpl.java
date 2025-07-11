package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;

    @Override
    public Student createStudent(Student student) {
        Student s1 = new Student();
        s1.setName(student.getName());  // already exists in D
        s1.setRollNo(student.getRollNo());
        s1.setDepartment(student.getDepartment());
        repository.save(s1);
//        repository.save(student);
        return s1;
    }

    //    public void updateStudent (Long id, Student student){}
//    public List<Student> getAllStudents(){}
    public String getStudentById(Long rollno) {
        String found=null;
        try {
            found = repository.findById(rollno).orElseThrow(() -> new RuntimeException("Not found")).toString();
        } catch (Exception e) {
             found = String.valueOf(e.getMessage());
        }
    return found;

    }

    @Override
    public List<Student> getStudentsList() {
        return repository.findAll();
    }
}
