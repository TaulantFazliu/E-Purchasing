package com.epurchasing.order.Entity;

import com.epurchasing.order.VO.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "purchase")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int purchaseId;
    private String purchaseName;
    @ElementCollection
    private List<Product> products;
    private String status;
    private String paymentType;
    private Date deliveryDate;
    private double total;
    private Date orderDate;
}
