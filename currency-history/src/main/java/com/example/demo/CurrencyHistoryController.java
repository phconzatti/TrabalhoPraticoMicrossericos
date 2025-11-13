package com.example.demo;

import java.util.Map;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyHistoryController {
    private Logger logger = LoggerFactory.getLogger(CurrencyHistoryController.class);
    @Autowired
    private CurrencyHistoryRepository repository;
    @Autowired
    private CurrencyHistoryService service;

    @GetMapping ("/currency-history/health")
    public Map<String, String> healthCheck() {
        return Map.of("status", "UP");
    }

    @GetMapping ("/currency-history/history")
    public Map<String, Object> getCurrencyHist(
        @RequestParam String from,
        @RequestParam String to
    ) {
        List<CurrencyHistoryDTO> values = service.getValuesOnly(from, to);

        return Map.of(
                "from", from,
                "to", to,
                "values", values
        );
    }
}