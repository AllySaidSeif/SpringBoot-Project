package com.hospital.hospitalManagement.service;


import com.hospital.hospitalManagement.model.Doctors;

import java.util.List;

public interface DoctorsService {

    public Doctors saveDoctors(Doctors doctors);
    public List<Doctors> getAllDoctor();
    public Doctors updateDoctor(Doctors doctors);
    public void deleteDoctor(Integer id);
}
