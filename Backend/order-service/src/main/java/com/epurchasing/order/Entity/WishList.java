package com.epurchasing.order.Entity;

import com.epurchasing.order.VO.Customer;
import com.epurchasing.order.VO.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "wishlist")
public class WishList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int wishlistId;
    private Date createdDate;
    @Embedded
    private Customer customer;
    @Embedded
    private Product product;
}
