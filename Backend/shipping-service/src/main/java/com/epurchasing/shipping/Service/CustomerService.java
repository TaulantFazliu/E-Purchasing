package com.epurchasing.shipping.Service;

import com.epurchasing.shipping.Entity.Customer;
import com.epurchasing.shipping.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer findByCustomerId(int customerId) {
        return customerRepository.findByCustomerId(customerId);
    }
}
