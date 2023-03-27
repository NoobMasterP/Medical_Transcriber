package com.example.medical_transcriber.patient;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name="central")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private LocalDate dob;
    private String phone;
    private String authToken;
    private String type = "patient";
    @Transient
    private Integer age;

    public Patient(Integer id) {
        this.id = id;
    }

    public Patient() {
    }

    public Patient(Integer id, String name, LocalDate dob, String phone) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.phone = phone;
    }

    public Patient(String name, LocalDate dob, String phone) {
        this.name = name;
        this.dob = dob;
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {

        return Period.between(this.dob, LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

//    @Override
//    public String toString() {
//        return "Patient{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", dob=" + dob +
//                ", age=" + age +
//                ", phone='" + phone + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", authToken='" + authToken + '\'' +
                ", type=" + type +
                '}';
    }
}
