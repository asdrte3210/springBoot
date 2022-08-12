package com.develop.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.develop.vo.Currency;


@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Long> {

}