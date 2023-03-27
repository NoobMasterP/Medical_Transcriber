package com.example.medical_transcriber.patient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

    // SELECT * FROM central WHERE phone = ?
//    @Query("SELECT p FROM Patient p WHERE p.phone = ?1")  // not mysql
    Optional<Patient> findPatientByPhone(String phone);
}
