package com.example.medical_transcriber.patient;

import java.time.LocalDate;

public class Patient {
    private Integer id;
    private String name;
    private LocalDate dob;
    private Integer age;
    private String email;
    private String authToken;
    private String user_type = "patient";

    public Patient(Integer id) {
        this.id = id;
    }

    public Patient(Integer id, String name, LocalDate dob, Integer age, String email) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.email = email;
    }

    public Patient(String name, LocalDate dob, Integer age, String email) {
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.email = email;
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

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    @Override
//    public String toString() {
//        return "Patient{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", dob=" + dob +
//                ", age=" + age +
//                ", email='" + email + '\'' +
//                '}';
//    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", authToken='" + authToken + '\'' +
                ", user_type=" + user_type +
                '}';
    }
}
