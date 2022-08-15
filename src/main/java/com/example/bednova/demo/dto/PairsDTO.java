package com.example.bednova.demo.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PairsDTO {
    private int id;
    private Date date;
    private int price;
    private int time;
    private String name;

    public Object getPrice() {
        return price;
    }
    public Object getName() {
        return name;
    }
}
