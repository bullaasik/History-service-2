package com.example.bednova.demo.timer;

import com.example.bednova.demo.dto.PairsDTO;
import com.example.bednova.demo.entity.RegisterOfTransactionsEntity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TimerParser {
    public RegisterOfTransactionsEntity dtoToEntity(PairsDTO DTO) throws ParseException {
        Date time = new SimpleDateFormat("HH:mm:ss").parse(String.valueOf(DTO.getTime()));
        Date date = new SimpleDateFormat("yyyy-MM-dd")
                .parse(LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
        return RegisterOfTransactionsEntity.builder()
                .name(DTO.getName())
                .price(DTO.getPrice())
                .time(time)
                .date(date)
                //.fullDate(dateAndTime)
                .build();
    }
}
