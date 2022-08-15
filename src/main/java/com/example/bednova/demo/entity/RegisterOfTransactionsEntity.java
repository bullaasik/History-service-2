package com.example.bednova.demo.entity;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="RegisterOfTransactions")
public class RegisterOfTransactionsEntity implements Serializable {
    @Id
    @Column(name = "id")
    private int id;

    @MapsId
    @ManyToOne
    @JoinColumn(name = "CurrencyPair")
    private CurrencyPairEntity CurrencyP;

    @Temporal(TemporalType.TIME)
    private Date time;

    @Temporal(TemporalType.DATE)
    private Date date;

    @Column(name = "price")
    private int price;

    public RegisterOfTransactionsEntity(int id, CurrencyPairEntity CurrencyP, int price, Date time, Date date) {
        this.id = id;
        this.CurrencyP = CurrencyP;
        this.price = price;
        this.date = date;
        this.time = time;
    }

    public RegisterOfTransactionsEntity() {

    }

    public static <E extends Enum<E>> Enum<E> builder() {
        return null;
    }
}
