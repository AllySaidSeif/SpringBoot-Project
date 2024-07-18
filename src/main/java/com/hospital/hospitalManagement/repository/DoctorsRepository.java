package com.hospital.hospitalManagement.repository;

import com.hospital.hospitalManagement.model.Doctors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DoctorsRepository extends JpaRepository<Doctors,Integer> {
}
