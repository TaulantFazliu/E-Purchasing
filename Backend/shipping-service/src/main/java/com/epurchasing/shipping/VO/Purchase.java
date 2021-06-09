package com.epurchasing.shipping.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
    private int purchaseId;
    private String name;
    private String status;
    private String paymentType;
    private Date deliveryDate;
}
