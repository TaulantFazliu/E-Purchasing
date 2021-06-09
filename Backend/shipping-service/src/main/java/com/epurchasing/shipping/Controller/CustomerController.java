package com.epurchasing.shipping.Controller;

import com.epurchasing.shipping.Entity.Customer;
import com.epurchasing.shipping.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/{id}/get")
    public Customer findByCustomerId(@PathVariable("id") int customerId){
        return customerService.findByCustomerId(customerId);
    }
}
