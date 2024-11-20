package com.ecommerce.project.service;

import com.ecommerce.project.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    public String load(){
        return "loaded";
    }
}
