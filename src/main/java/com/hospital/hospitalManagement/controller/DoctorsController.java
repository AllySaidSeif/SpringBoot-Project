package com.hospital.hospitalManagement.controller;

import com.hospital.hospitalManagement.model.Doctors;
import com.hospital.hospitalManagement.service.DoctorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
@CrossOrigin
public class DoctorsController {
    @Autowired
    private DoctorsService doctorsService;

    @PostMapping("/add")
    public String add(@RequestBody Doctors doctors){
        doctorsService.saveDoctors(doctors);
        return "new doctor is added";
    }

    @GetMapping("/getAll")
    public List<Doctors> getAllDoctor(){
        return  doctorsService.getAllDoctor();
    }

    @PutMapping("/update/{id}")
    public Doctors updateDoctor(@PathVariable Integer id,@RequestBody Doctors doctors){
        doctors.setId(id);
        return doctorsService.updateDoctor(doctors);
    }
    @DeleteMapping("/delete")
    public void deleteDoctor(@RequestParam Integer id){
        doctorsService.deleteDoctor(id);
    }
}
