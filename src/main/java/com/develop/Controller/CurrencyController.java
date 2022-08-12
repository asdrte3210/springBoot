package com.develop.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.develop.Dao.CurrencyRepository;
import com.develop.vo.Currency;


@RestController
@RequestMapping("/api")
public class CurrencyController {

    @Autowired
    private CurrencyRepository currencyRepository;

    //查詢
    @GetMapping("/currency")
    public Collection<Currency> currencys() {
        return currencyRepository.findAll();
    }

    //查詢
    @GetMapping("/currency/{id}")
    public ResponseEntity<?> getCurrency(@PathVariable Long id) {
        java.util.Optional<Currency> currency = currencyRepository.findById(id);
        return currency.map(response -> ResponseEntity.ok().body(response))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    //更新
    @PutMapping("/currency/{id}")
    public boolean updateCurrency(@PathVariable Long id) {
        return true;
    }

    //新增
    @PostMapping("/currency/{id}")
    public boolean insertCurrency(@PathVariable Currency currency) {
        return true;
    }

    //刪除
    @DeleteMapping("/currency/{id}")
    public boolean deleteCurrency(@PathVariable Currency currency) {
        return true;
    }




}