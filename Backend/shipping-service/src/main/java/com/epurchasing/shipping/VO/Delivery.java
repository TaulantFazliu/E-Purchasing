package com.epurchasing.shipping.VO;

import com.epurchasing.shipping.Entity.Customer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Delivery {
    private int deliveryId;
    private String status;
    private Customer recipient;
    private Date shippingDate;
    private double shippingPrice;
}
