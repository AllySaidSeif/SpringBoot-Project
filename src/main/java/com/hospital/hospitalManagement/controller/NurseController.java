package com.hospital.hospitalManagement.controller;


import com.hospital.hospitalManagement.model.Nurse;
import com.hospital.hospitalManagement.service.NurseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nurse")
@CrossOrigin
public class NurseController {
    @Autowired
    private NurseService nurseService;

    @PostMapping("/addNurse")
    public String addNurse(@RequestBody Nurse nurse){
        nurseService.saveNurse(nurse);
        return "new nurse was added";
    }

    @GetMapping("/getAllNurse")
    public List<Nurse> getAllNurse(){
        return nurseService.getAllNurse();
    }

    @PutMapping("/update/{id}")
    public Nurse updateNurse(@PathVariable Integer id,@RequestBody Nurse nurse){
        nurse.setId(id);
        return  nurseService.updateNurse(nurse);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestParam Integer id){
        nurseService.deleteNurse(id);
    }
}
