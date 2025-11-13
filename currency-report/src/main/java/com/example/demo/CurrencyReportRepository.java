package com.example.demo;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CurrencyReportRepository extends
        CrudRepository<CurrencyReport, Long> {
    Optional <CurrencyReport> findByFromAndTo(String from, String to);
}