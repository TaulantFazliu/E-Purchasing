package com.epurchasing.paymet.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shipping {
    private int shippingId;
    private String shippingStatus;
    private Customer recipient;
    private Date shippingDate;
}
