package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.studentrepository.studentrepository;
import com.example.demo.model.student;

@RestController
@RequestMapping("/api")
public class studentcontroller {

    @Autowired
    studentrepository studentrepository;

    @PostMapping("/students")
    public String createNewStudent(@RequestBody student student) {
        System.out.println("Student input is " + student);
        studentrepository.save(student);
        return "Student Created in database";
    }

}
