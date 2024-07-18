package com.hospital.hospitalManagement.controller;


import com.hospital.hospitalManagement.model.Patient;
import com.hospital.hospitalManagement.repository.PatientRepository;
import com.hospital.hospitalManagement.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;


    @PostMapping("/add")
    public String addPatient(@RequestBody Patient patient){
        patientService.savePatient(patient);
        return "patient was added";
    }

    @GetMapping("/getPatient")
    public List<Patient> getAllPatient(){
        return patientService.getAllPatient();
    }

    @PutMapping("/update/{id}")
    public Patient updatePatient(@PathVariable Integer id, @RequestBody Patient patient){
        patient.setId(id);
        return  patientService.updatePatient(patient);
    }

    @DeleteMapping("/delete")
    public void deletePatient(@RequestParam Integer id){
        patientService.deletePatient(id);
    }

}
