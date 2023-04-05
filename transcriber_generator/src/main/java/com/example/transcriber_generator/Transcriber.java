package com.example.transcriber_generator;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="report")
public class Transcriber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer report_id;
    private Integer patient_id;
    private String description;

    public Transcriber() {
    }

    public Transcriber(Integer patient_id, String description) {
        this.patient_id = patient_id;
        this.description = description;
    }

    public Transcriber(Integer report_id, Integer patient_id, String description) {
        this.report_id = report_id;
        this.patient_id = patient_id;
        this.description = description;
    }
}
