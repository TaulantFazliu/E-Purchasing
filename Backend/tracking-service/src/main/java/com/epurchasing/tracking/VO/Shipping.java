package com.epurchasing.tracking.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Shipping {
    private int shippingId;
    private String status;
    private String trackingNr;
    private Customer recipient;
}
