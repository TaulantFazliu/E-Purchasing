package com.epurchasing.searchEngine.Entity;

import com.epurchasing.searchEngine.VO.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "searchengine")
public class SearchEngine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int searchId;
    @Embedded //is used to embed a type into another entity.
    private Product product;
}
