package com.epurchasing.paymet.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
    private int purchaseId;
    private String purchaseStatus;
    private String paymentType;
    private double totalPrice;
}
