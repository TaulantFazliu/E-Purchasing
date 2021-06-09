package com.epurchasing.paymet.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "creditcard")
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cardId;
    private long cardNr;
    private int CVV;
    private Date EXPdate;
    private String cardHolder;
}
