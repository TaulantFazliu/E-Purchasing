package com.epurchasing.tracking.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Purchase {
    private int purchaseId;
    private String status;
    private Date deliveryDate;
}
