package com.hospital.hospitalManagement.service;

import com.hospital.hospitalManagement.model.Administration;
import com.hospital.hospitalManagement.repository.AdministrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdministrationServiceImpl implements AdministrationService{

    @Autowired
    private AdministrationRepository adminRepository;
    @Override
    public Administration saveAdmin(Administration admin) {
        return adminRepository.save(admin);
    }
}
