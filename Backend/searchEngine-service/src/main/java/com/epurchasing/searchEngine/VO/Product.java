package com.epurchasing.searchEngine.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.File;

@Data
@AllArgsConstructor //generates a constructor requiring an argument for every field in the annotated class
@NoArgsConstructor //generates a default constructor with no parameters
@Embeddable //used to declare that a class will be embedded by other entities.
public class Product {
    private int productId;
    private String productName;
    private String productDescription;
    private String productBarcode;
    private File image;
    private double productPrice;
}
