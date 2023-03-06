package com.example.demo.model;
import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Entity
@Table(name="Student")
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stud_id;

    @Column(name=" Stud_name")
    private String stud_name;

    @Column(name=" Stud_phone")
    private String  stud_phone;


    @Column(name=" Stud_email")
    private String stud_email;

    @Column(name=" Stud_gender")
    private String stud_gender;


    @Column(name=" Stud_div")
    private String stud_div;


    @Column(name=" Stud_classs")
    private String stud_classs;


    @Column(name=" Stud_dob")
    private Date stud_dob;


    public Long getStud_id() {
        return stud_id;
    }


    public void setStud_id(Long stud_id) {
        this.stud_id = stud_id;
    }


    public String getStud_name() {
        return stud_name;
    }


    public void setStud_name(String stud_name) {
        this.stud_name = stud_name;
    }


    public String getStud_phone() {
        return stud_phone;
    }


    public void setStud_phone(String stud_phone) {
        this.stud_phone = stud_phone;
    }


    public String getStud_email() {
        return stud_email;
    }


    public void setStud_email(String stud_email) {
        this.stud_email = stud_email;
    }


    public String getStud_gender() {
        return stud_gender;
    }


    public void setStud_gender(String stud_gender) {
        this.stud_gender = stud_gender;
    }


    public String getStud_div() {
        return stud_div;
    }


    public void setStud_div(String stud_div) {
        this.stud_div = stud_div;
    }


    public String getStud_classs() {
        return stud_classs;
    }


    public void setStud_classs(String stud_classs) {
        this.stud_classs = stud_classs;
    }


    public Date getStud_dob() {
        return stud_dob;
    }


    public void setStud_dob(Date stud_dob) {
        this.stud_dob = stud_dob;
    }


    @Override
    public String toString() {
        return "Student [stud_id=" + stud_id + ", stud_name=" + stud_name + ", stud_phone=" + stud_phone
                + ", stud_email=" + stud_email + ", stud_gender=" + stud_gender + ", stud_div=" + stud_div
                + ", stud_classs=" + stud_classs + ", stud_dob=" + stud_dob + "]";
    }


    public student(Long stud_id, String stud_name, String stud_phone, String stud_email, String stud_gender,
                   String stud_div, String stud_classs, Date stud_dob) {
        super();
        this.stud_id = stud_id;
        this.stud_name = stud_name;
        this.stud_phone = stud_phone;
        this.stud_email = stud_email;
        this.stud_gender = stud_gender;
        this.stud_div = stud_div;
        this.stud_classs = stud_classs;
        this.stud_dob = stud_dob;
    }


    public student() {
        super();
        // TODO Auto-generated constructor stub
    }
}
