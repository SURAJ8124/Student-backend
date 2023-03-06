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
    @PutMapping("/students/{studid}")
    public String updateStudentbyid(@PathVariable long studid,@RequestBody student student){
        Optional<student> stud= studentrepository.findById(studid);
        if(stud.isPresent()){
            student existStudent=stud.get();
            existStudent.setStud_name(student.getStud_name());
            existStudent.setStud_phone(student.getStud_phone());
            existStudent.setStud_email(student.getStud_email());
            existStudent.setStud_div(student.getStud_div());
            existStudent.setStud_dob(student.getStud_dob());
            existStudent.setStud_classs(student.getStud_classs());
            existStudent.setStud_gender(student.getStud_gender());
          studentrepository.save(existStudent);
          return "Student Details against Id " + studid + " updated";

        }
         else {
             return  "Student Details Not Found For StudnetId"+studid;
        }
    }


}
