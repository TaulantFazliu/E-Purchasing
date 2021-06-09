package com.epurchasing.tracking.Repository;

import com.epurchasing.tracking.Entity.Tracking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackingRepository extends JpaRepository<Tracking, Integer> {
}
