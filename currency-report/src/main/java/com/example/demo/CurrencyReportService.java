package com.example.demo;

import java.time.Instant;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class CurrencyReportService {

    private CurrencyReportRepository currencyReportRepository;

    public CurrencyReportService (CurrencyReportRepository currencyReportRepository) {
        this.currencyReportRepository = currencyReportRepository;
    }

    public Map<String, Object> getCurrencyReport (String from, String to) {
        Optional <CurrencyReport> currencyOpt = currencyReportRepository.findByFromAndTo(from, to);
        if (currencyOpt.isEmpty()) {
            throw new RuntimeException("Cotação não encontrada para " + from + "->" + to);
        }

        CurrencyReport currencyReport = currencyOpt.get();
        return Map.of (
            "from", currencyReport.getFrom(),
            "to", currencyReport.getTo(),
            "price", currencyReport.getReportMultiple(),
            "timestamp", Instant.now().toString()
        );
    }
}
