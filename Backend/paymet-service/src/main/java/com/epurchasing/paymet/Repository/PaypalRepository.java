package com.epurchasing.paymet.Repository;

import com.epurchasing.paymet.Entity.Paypal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaypalRepository extends JpaRepository<Paypal,Integer> {
}
