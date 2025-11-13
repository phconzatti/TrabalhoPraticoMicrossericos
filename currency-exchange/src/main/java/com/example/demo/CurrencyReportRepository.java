package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface CurrencyReportRepository extends
        CrudRepository<CurrencyReport, Long> {
    CurrencyReport findByFromAndTo(String from, String to);
}