package com.example.bednova.demo.controller;

import
import com.example.bednova.demo.entity.CurrencyPairEntity;
import com.example.bednova.demo.entity.RegisterOfTransactionsEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/history")
public class Controller {

    @FeignClient(name = "Service_1")
    public interface ServiceFeignClient {

        @GetMapping(“/pair”)
        public List<UserStatisticModel> getStatistic(@PathVariable String id);

    }

    @GetMapping(value = "/AllHistory")
    public List<RegisterOfTransactionsEntity> showMeRegisterOfTransaction (@RequestParam int id, @RequestParam
    CurrencyPairEntity CurrencyP, @RequestParam int price, @RequestParam Date data, Date time) {
        return service.showMeRegisterOfTransaction(id, CurrencyP, price, data, time);
    }
}
