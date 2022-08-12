package com.develop.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.develop.vo.Currency;

@Component
public class DatabaseLoader implements CommandLineRunner {

    @Autowired
    private CurrencyRepository memberRepository;

    @Override
    public void run(String... args) throws Exception {

    Currency currency = new Currency("USD", "&#36", "23,927.8061", "United States Dollar");
    memberRepository.save(currency);

    }
}