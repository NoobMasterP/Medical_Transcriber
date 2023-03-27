package com.example.medical_transcriber.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;

@Service
public class PatientService {

    @Autowired private PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }


    public List<Patient> getPatientList() {
//        return List.of(
//                new Patient(1, "Patient 1", LocalDate.of(2001, Month.DECEMBER, 24), 21, "987654321")
//        );

        return patientRepository.findAll();
    }

    public void addNewPatient(String name, LocalDate DOB, String email) {
        int age = 0;
        Period period = Period.between(DOB, LocalDate.now());
        age = period.getYears();

        Patient p = new Patient(2, name, DOB, age ,email);
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
