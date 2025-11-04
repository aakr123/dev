package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Map;

import java.util.List;
import java.util.Objects;
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

     @Override
    public Student updateStudentById(Long id,Student student){
         Student existingStudent=null;

        try {
             existingStudent = repository.findById(id).orElseThrow();


            existingStudent.setName(student.getName());
            existingStudent.setDepartment(student.getDepartment());
            repository.save(existingStudent);
        }
        catch(Exception e){
            e.getMessage();
        }

       System.out.println(existingStudent);
       return existingStudent;
     }
     public ResponseEntity<Map<String, String>> deleteStudentById(Long id){
         if(repository.existsById(id)) {
             repository.deleteById(id);
             return ResponseEntity.ok(Map.of(
                     "status", "success",
                     "message" , "Student with Id "+id+" is deleted"
             ));

         }
         else{
             return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of(
                     "status","error",
                     "message","Student is not found"));
         }


     }

}
