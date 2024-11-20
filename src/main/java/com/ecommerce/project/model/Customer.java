package com.ecommerce.project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cust_id;
    private String name;
    private String email;
    private String password;
    private String phone;
    private String address;
    @OneToOne(mappedBy = "customer", cascade = CascadeType.ALL)
    private Cart cart;
}
