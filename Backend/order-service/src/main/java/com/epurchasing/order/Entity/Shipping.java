package com.epurchasing.order.Entity;

import com.epurchasing.order.VO.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "shipping")
public class Shipping {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int shippingId;
    private String status;
    private String trackingNr;
    @Embedded
    private Customer recipient;


}
