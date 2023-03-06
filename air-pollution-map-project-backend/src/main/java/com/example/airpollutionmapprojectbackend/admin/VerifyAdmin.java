package com.example.airpollutionmapprojectbackend.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class VerifyAdmin{
    private final AdminService adminService;
    @Autowired
    public VerifyAdmin(AdminService adminService) {
        this.adminService = adminService;
    }
    public String verifyString(Admin adminFromRequest){
        try{ // in the future here will be while not null -> compare admin data
            Admin adminFromDB = adminService.getAdminById(1L);
            return adminFromDB.toString();
//            var adminFromDB = adminRepository.findAll(PageRequest.of(0,1)).getContent().get(0);
//            return adminFromDB.toString();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "nope : < ( ";
    }
}