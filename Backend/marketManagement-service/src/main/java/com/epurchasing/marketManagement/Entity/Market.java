package com.epurchasing.marketManagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "market")
public class Market {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int marketId;
    private String marketName;
    @OneToOne
    private Owner marketOwner;
    private String marketAddress;
    private String marketPhone;

}
