package com.epurchasing.tracking.Service;

import com.epurchasing.tracking.Repository.TrackingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrackingService {

    @Autowired
    private TrackingRepository trackingRepository;
}
