package com.example.demo;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyReportController {
    private Logger logger = LoggerFactory.getLogger(CurrencyReportController.class);
    @Autowired
    private CurrencyReportRepository repository;
    @Autowired
    private CurrencyReportService service;

    @GetMapping ("/currency-report/health")
    public Map<String, String> healthCheck() {
        return Map.of("status", "UP");
    }

    @GetMapping ("/currency-report/quote")
    public Map <String, Object> getCurrencyReport(
        @RequestParam String from,
        @RequestParam String to
    ) {
        return service.getCurrencyReport(from.toUpperCase(), to.toUpperCase());
    }
}