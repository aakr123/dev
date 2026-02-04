package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.antlr.v4.runtime.misc.NotNull;
import jakarta.validation.constraints.*;


@Entity
@Data

public class Student {
    @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long rollNo;
    @NotEmpty
    private String name;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    @NotEmpty
    private String department;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public Long getRollNo() {
        return rollNo;
    }

    public void setRollNo(Long rollNo) {
        this.rollNo = rollNo;
    }


}
