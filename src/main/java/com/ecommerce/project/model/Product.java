package com.ecommerce.project.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Component
@Data
public class Product {
    @Id
    private int product_id;
    private String product_name;
    private String product_description;
    private double product_price;
    private int product_quantity;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] image;
    public Product(int id){
        this.product_id = id;
    }
}
