package com.epurchasing.marketManagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.File;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    private String productName;
    private String productDescription;
    private String productBarcode;
    private File image;
    private double productPrice;
    private String prodhuesi;
    private Date dataProdhimit;
    private Date dataSkadimit;
    private String masa;
}
