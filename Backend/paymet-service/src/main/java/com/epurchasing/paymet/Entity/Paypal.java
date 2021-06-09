package com.epurchasing.paymet.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Tables;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "paypal")
public class Paypal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int paypalId;
    private String email;
    private String password;
}
