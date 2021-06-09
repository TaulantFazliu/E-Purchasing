package com.epurchasing.marketManagement.VO;

import com.epurchasing.marketManagement.Entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tracking {
    private int trackingId;
    private String trackingStatus;
    private Product productTracking;

}
