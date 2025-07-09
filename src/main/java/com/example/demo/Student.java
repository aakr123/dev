package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity

public class Student {
    @Id
    private Integer rollNo;
    private String name;
    private String department;

}
