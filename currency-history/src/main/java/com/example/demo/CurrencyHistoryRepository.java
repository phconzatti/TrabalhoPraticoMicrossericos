package com.example.demo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CurrencyHistoryRepository extends
        CrudRepository<CurrencyHistory, Long> {
    List <CurrencyHistory> findByFromAndTo(String from, String to);
}