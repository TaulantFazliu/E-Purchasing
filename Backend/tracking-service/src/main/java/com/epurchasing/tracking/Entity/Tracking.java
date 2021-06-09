package com.epurchasing.tracking.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tracking")
public class Tracking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int trackingId;
    private String trackPlace;
    private String trackDescription;
    private String trackStatus;
    private Date trackDate;
}
