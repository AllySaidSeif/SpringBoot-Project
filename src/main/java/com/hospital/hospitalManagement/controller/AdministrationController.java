package com.hospital.hospitalManagement.controller;


import com.hospital.hospitalManagement.model.Administration;
import com.hospital.hospitalManagement.service.AdministrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/admin")
public class AdministrationController {
    @Autowired
    private AdministrationService adminService;


    @PostMapping("/newAdmin")
    public String saveAdmin(@RequestBody Administration admin){
        adminService.saveAdmin(admin);
        return  "admin";
    }
}
