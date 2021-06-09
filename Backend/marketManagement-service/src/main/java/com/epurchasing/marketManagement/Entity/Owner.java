package com.epurchasing.marketManagement.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "owner")
public class Owner {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ownerId;
    private String ownerFirstName;
    private String ownerLastName;
    private String email;
    private String phoneNr;
    private int roli;
}
