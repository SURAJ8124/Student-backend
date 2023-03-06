package com.example.demo.studentrepository;
import com.example.demo.model.student;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface studentrepository extends JpaRepository <student,Long>  {


}
