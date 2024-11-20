package com.ecommerce.project.controller;

import com.ecommerce.project.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @GetMapping("load")
    public String load() {
        return customerService.load();
    }
}
