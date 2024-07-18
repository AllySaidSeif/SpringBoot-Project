package com.hospital.hospitalManagement.service;

import com.hospital.hospitalManagement.model.Doctors;
import com.hospital.hospitalManagement.repository.DoctorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorsServiceImpl implements DoctorsService{

    @Autowired
    private DoctorsRepository doctorsRepository;
    @Override
    public Doctors saveDoctors(Doctors doctors) {
        return doctorsRepository.save(doctors);
    }

    @Override
    public List<Doctors> getAllDoctor() {
        return doctorsRepository.findAll();
    }

    @Override
    public Doctors updateDoctor(Doctors doctors) {
        return doctorsRepository.save(doctors);
    }

    @Override
    public void deleteDoctor(Integer id) {
        doctorsRepository.deleteById(id);
    }
}
