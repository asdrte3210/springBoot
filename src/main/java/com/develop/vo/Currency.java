package com.develop.vo;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Currency {

    @Id
    private String code;
    private String symbol;
    private String rate;
    private String description;



    public Currency(String code, String symbol, String rate, String description) {
        this.code = code;
        this.symbol = symbol;
        this.rate = rate;
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

  
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
    public String getRate() {
        return rate;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }


}