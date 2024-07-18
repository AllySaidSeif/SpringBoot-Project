package com.hospital.hospitalManagement.service;

import com.hospital.hospitalManagement.model.Nurse;

import java.util.List;

public interface NurseService {

    public Nurse saveNurse(Nurse nurse);
    public List<Nurse> getAllNurse();
    public Nurse updateNurse(Nurse nurse);
    public  void deleteNurse(Integer id);
}
