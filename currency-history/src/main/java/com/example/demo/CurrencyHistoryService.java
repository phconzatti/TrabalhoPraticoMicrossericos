package com.example.demo;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class CurrencyHistoryService {

    private CurrencyHistoryRepository currencyHistoryRepository;

    public CurrencyHistoryService (CurrencyHistoryRepository currencyHistoryRepository) {
        this.currencyHistoryRepository = currencyHistoryRepository;
    }

    public List<CurrencyHistoryDTO> getValuesOnly (String from, String to) {
          List<CurrencyHistory> entities =
                currencyHistoryRepository.findByFromAndTo(from, to);

        return entities.stream()
                .map(e -> new CurrencyHistoryDTO(e.getTimestamp(), e.getHistoryMultiple()))
                .collect(Collectors.toList());
    }
}

