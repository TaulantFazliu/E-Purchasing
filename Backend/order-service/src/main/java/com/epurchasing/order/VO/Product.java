package com.epurchasing.order.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.Embeddable;
import java.io.File;
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int productId;
    private String productName;
    private String productDescription;
    private String productBarcode;
    private File image;
    private double productPrice;
}


