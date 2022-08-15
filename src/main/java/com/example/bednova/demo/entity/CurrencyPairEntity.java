package com.example.bednova.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="CurrencyPairs")
public class CurrencyPairEntity implements Serializable {

    @Id
    @Column(name="id")
    private int id;

    @Column(name="NameOfCurrencyPair")
    private String NameOfCurrencyPair;
}