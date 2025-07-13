package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    public StudentService service;
    @GetMapping("/")
    public String testCall(){
        return "hellospringboot";
    }

    @PostMapping("/student")
    public Student createStudent(  @RequestBody  Student student){
        return service.createStudent(student);
    }
    @GetMapping("/getStudentById")
    public String getStudentById(@RequestParam("rollNo") Long rollNo){
        return service.getStudentById(rollNo);
    }

    @GetMapping("/getStudentList")
    public List<Student> getAllStudents(){
        return service.getStudentsList();
    }
    @PutMapping("/updateStudentById")
    public Student updateStudentById(@RequestParam("rollNo") Long rollNo, @RequestBody  Student student){
        return service.updateStudentById(rollNo,student);
    }
    @DeleteMapping("/deleteStudentById/{id}")
    public String deleteStudentById(@PathVariable Long id ){
        return service.deleteStudentById(id);
    }

}
