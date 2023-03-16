package com.example.medical_transcriber.patient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/patient")
public class PatientController {

    private final PatientService patientService;

    @Autowired
    public PatientController(PatientService patientService) {
        this.patientService = new PatientService();
    }

    @GetMapping
    public List<Patient> getPatient() {
        return patientService.getPatientList();
    }

    private HashMap<String, String> convert(String res) {
        HashMap<String, String> map = new HashMap<>();
        map.put("response", res);
        return map;
    }

//    @PostMapping("/login")
//    public ResponseEntity<?> login(@RequestHeader("email") String email, @RequestHeader("password") String password) {
//        String response = patientService.login(email, password);
//        if(response.equals("not-found") || response.equals("incorrect-passowrd")){
//            return ResponseEntity.badRequest().body(convert(response));
//        }
//        return ResponseEntity.accepted().body(convert(response));
//    }
}
