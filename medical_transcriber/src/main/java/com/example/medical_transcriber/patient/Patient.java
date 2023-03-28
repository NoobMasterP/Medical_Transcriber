package com.example.medical_transcriber.patient;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.Period;

@Entity
@Getter
@Setter
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

//    @Override
//    public String toString() {
//        return "Patient{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", dob=" + dob +
//                ", age=" + age +
//                ", phone='" + phone + '\'' +
//                ", authToken='" + authToken + '\'' +
//                ", type=" + type +
//                '}';
//    }
}
