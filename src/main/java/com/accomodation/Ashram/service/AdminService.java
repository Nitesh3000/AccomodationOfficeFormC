package com.accomodation.Ashram.service;

import com.accomodation.Ashram.model.Admin;
import com.accomodation.Ashram.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public boolean authenticateAdmin(String username, String password) {
        Admin admin = adminRepository.findById(username).orElse(null);
        return admin != null && admin.getPassword().equals(password);
    }
}
