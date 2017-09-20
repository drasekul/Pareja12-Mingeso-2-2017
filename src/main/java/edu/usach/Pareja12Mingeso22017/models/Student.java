package edu.usach.Pareja12Mingeso22017.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name="student")

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private long student_id;

    // Student's name
    @NotNull
    private String name;

    // Student's r.u.t.
    @NotNull
    private String rut;

    // Student's email
    @NotNull
    private String email;

    // Student's career
    @NotNull
    private String career;

    // Student's income_year year
    @NotNull
    private int income_year;

    ////////////////////////////////////////////
    //////////// Setters and Getters ///////////
    ////////////////////////////////////////////

    public long getStudent_id() {
        return student_id;
    }

    public void setStudent_id(long student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getIncome_year() {
        return income_year;
    }

    public void setIncome_year(int income_year) {
        this.income_year = income_year;
    }

    ////////////////////////////////////
    //////////  Constructors  //////////
    ////////////////////////////////////

    public Student(){

    }

    public Student(String name, String rut, String email, String career, int income_year) {
        this.name = name;
        this.rut = rut;
        this.email = email;
        this.career = career;
        this.income_year = income_year;
    }
}
