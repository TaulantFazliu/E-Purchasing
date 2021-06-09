package com.epurchasing.tracking.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private int ZIPcode;
    private String StreetAddress;
    private String cityName;


}
