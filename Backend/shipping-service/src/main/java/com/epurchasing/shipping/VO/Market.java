package com.epurchasing.shipping.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Market {
    private int marketId;
    private String marketname;
    private String marketPhone;
    private String marketAddress;
}
