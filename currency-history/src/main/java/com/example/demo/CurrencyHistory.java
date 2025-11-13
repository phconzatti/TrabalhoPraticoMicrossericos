package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "history")
public class CurrencyHistory {
    @Id
    private Long id;
    @Column(name = "currency_from")
    private String from;
    @Column(name = "currency_to")
    private String to;
    @Column(name = "history_multiple")
    private BigDecimal historyMultiple;
    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    public CurrencyHistory() {
    }

    public CurrencyHistory(Long id, String from, String to, BigDecimal historyMultiple, LocalDateTime timestamp) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.historyMultiple = historyMultiple;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getHistoryMultiple() {
        return historyMultiple;
    }

    public void setHistoryMultiple(BigDecimal historyMultiple) {
        this.historyMultiple = historyMultiple;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}