package com.epurchasing.marketManagement.Repository;

import com.epurchasing.marketManagement.Entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends JpaRepository<Market, Integer> {
}
