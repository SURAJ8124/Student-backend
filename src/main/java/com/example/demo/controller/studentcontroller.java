package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.studentrepository.studentrepository;
import com.example.demo.model.student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
    @GetMapping("/students")
    public ResponseEntity<List<student>>getAllstudents(){
        List<student> studList= new ArrayList<>();
        studentrepository.findAll().forEach(studList::add );
        return new ResponseEntity<List<student>>(studList, HttpStatus.OK);
    }
    @GetMapping("/students/{studid}")
    public ResponseEntity<student> getStudentbyId(@PathVariable long studid){
        Optional<student> stud= studentrepository.findById(studid);
        if(stud.isPresent()){
            return new ResponseEntity<student>(stud.get(),HttpStatus.FOUND);
        }
        else {
            return new ResponseEntity<student>(HttpStatus.NOT_FOUND);
        }
    }

}
