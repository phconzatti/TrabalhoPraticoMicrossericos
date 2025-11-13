package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CurrencyHistoryDTO {
    private LocalDateTime timestamp;
    private BigDecimal price;

    public CurrencyHistoryDTO(LocalDateTime timestamp, BigDecimal price) {
        this.timestamp = timestamp;
        this.price = price;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
