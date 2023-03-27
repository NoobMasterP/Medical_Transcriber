package com.example.medical_transcriber.patient;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name="central")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "dob")
    private LocalDate dob;
    @Column(name = "age")
    private Integer age;
    @Column(name = "phone")
    private String phone;
    @Column(name = "auth_token")
    private String authToken;
    @Column(name = "type")
    private String type = "patient";

    public Patient(Integer id) {
        this.id = id;
    }

    public Patient() {
    }

    public Patient(Integer id, String name, LocalDate dob, Integer age, String phone) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.phone = phone;
    }

    public Patient(String name, LocalDate dob, Integer age, String phone) {
        this.name = name;
        this.dob = dob;
        this.age = age;
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
        return age;
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
