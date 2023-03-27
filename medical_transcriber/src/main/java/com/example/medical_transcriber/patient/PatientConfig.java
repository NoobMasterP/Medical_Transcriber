package com.example.medical_transcriber.patient;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PatientConfig {

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository repository) {
        return args -> {
            Patient patient4 = new Patient(
                    "Patient 4", LocalDate.of(2001, Month.DECEMBER, 24), "987654321"
            );

            Patient patient5 = new Patient(
                    "Patient 5", LocalDate.of(2001, Month.SEPTEMBER, 15), "9875464321"
            );

            repository.saveAll(
                    List.of(patient4, patient5)
            );
        };
    }
}
