package com.hospital.hospitalManagement.repository;

import com.hospital.hospitalManagement.model.Nurse;
import com.hospital.hospitalManagement.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {

}
