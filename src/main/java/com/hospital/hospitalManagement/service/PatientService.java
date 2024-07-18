package com.hospital.hospitalManagement.service;


import com.hospital.hospitalManagement.model.Patient;

import java.util.List;

public interface PatientService {
    public Patient savePatient(Patient patient);
    public List<Patient> getAllPatient();
    public Patient updatePatient(Patient patient);
    public void deletePatient(Integer id);
}
