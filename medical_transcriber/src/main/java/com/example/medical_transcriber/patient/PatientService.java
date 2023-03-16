package com.example.medical_transcriber.patient;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class PatientService {

    public List<Patient> getPatientList() {
        return List.of(
                new Patient(1, "Patient 1", LocalDate.of(2001, Month.DECEMBER, 24), 21, "sadfasjf@fadfas.com")
        );
    }

//    @Override
//    public String login(String email, String password) {
//
//        Patient patient = userRepo.findByEmailIgnoreCase(email);
//        if(patient == null) return "not-found";
//        if(!patient.getPassword().equals(password)){
//            return "incorrect-password";
//        }
//        return patient.getAuthToken();
//    }
}
