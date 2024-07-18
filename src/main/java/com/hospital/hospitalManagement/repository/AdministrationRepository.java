package com.hospital.hospitalManagement.repository;

import com.hospital.hospitalManagement.model.Administration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdministrationRepository extends JpaRepository<Administration,Integer> {
}
