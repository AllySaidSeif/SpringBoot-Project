package com.hospital.hospitalManagement.service;

import com.hospital.hospitalManagement.model.Nurse;
import com.hospital.hospitalManagement.repository.NurseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NurseServiceImpl implements NurseService{

    @Autowired
    private NurseRepository nurseRepository;
    @Override
    public Nurse saveNurse(Nurse nurse) {
        return nurseRepository.save(nurse);
    }

    @Override
    public List<Nurse> getAllNurse() {
        return nurseRepository.findAll();
    }

    @Override
    public Nurse updateNurse(Nurse nurse) {
        return nurseRepository.save(nurse);
    }

    @Override
    public void deleteNurse(Integer id) {
        nurseRepository.deleteById(id);
    }

}
