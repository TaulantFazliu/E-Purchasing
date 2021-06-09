package com.epurchasing.order.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Market {
    private int marketId;
    private String marketName;
    private String marketPhone;
}
