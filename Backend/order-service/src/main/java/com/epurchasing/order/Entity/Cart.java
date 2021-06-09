package com.epurchasing.order.Entity;

import com.epurchasing.order.VO.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;
    private String cartName;
    @ElementCollection //Defines a collection of instances of a basic type or embeddable class
    private List<Product> products;
    private double total;
    private int nrOfProducts;
}
