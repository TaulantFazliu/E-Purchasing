package com.epurchasing.shipping.Repository;

import com.epurchasing.shipping.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByCustomerId(int customerId);
}
