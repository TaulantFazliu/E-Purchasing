package com.epurchasing.paymet.Controller;

import com.epurchasing.paymet.Service.PaypalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/paypal")
public class PaypalController {

    @Autowired
    private PaypalService paypalService;
}
