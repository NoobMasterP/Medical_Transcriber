package com.example.medical_transcriber.patient;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired private PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }


    public List<Patient> getPatientList() {
        return patientRepository.findAll();
    }

    public Patient getPatientByID(Integer id) {
        return patientRepository.getReferenceById(id);
    }

    public void addNewPatient(Patient patient) {
        Optional<Patient> patientOptional = patientRepository.findPatientByPhone(patient.getphone());
        if (patientOptional.isPresent()) {
            throw new IllegalStateException("Phone is registered");
        }

        patientRepository.save(patient);
    }

    public void deletePatient(Integer patientID) {
        boolean exists = patientRepository.existsById(patientID);
        if (!exists) {
            throw new IllegalStateException("Patient with ID " + patientID + " does not exist");
        }

        patientRepository.deleteById(patientID);
    }

    @Transactional
    public void updatePatient(Integer patientID, String name, String phone) {

        Patient patient = patientRepository.findById(patientID)
                .orElseThrow(() -> new IllegalStateException("Patient with id " + patientID + " does not exist"));

        if (name != null && name.length() > 0 && !Objects.equals(patient.getName(), name)) {
            patient.setName(name);
        }

        if (phone != null && phone.length() == 10 && !Objects.equals(patient.getphone(), phone)) {
            Optional<Patient> patientOptional = patientRepository.findPatientByPhone(phone);
            if (patientOptional.isPresent()) {
                throw new IllegalStateException("Phone number is already taken");
            }

            patient.setphone(phone);
        }
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
