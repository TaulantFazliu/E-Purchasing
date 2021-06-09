package com.epurchasing.paymet.Service;

import com.epurchasing.paymet.Repository.PaypalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaypalService {

    @Autowired
    private PaypalRepository paypalRepository;
}
