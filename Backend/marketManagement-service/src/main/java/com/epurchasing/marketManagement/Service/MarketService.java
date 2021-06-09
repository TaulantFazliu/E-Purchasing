package com.epurchasing.marketManagement.Service;

import com.epurchasing.marketManagement.Repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarketService {

    @Autowired
    private MarketRepository marketRepository;
}
