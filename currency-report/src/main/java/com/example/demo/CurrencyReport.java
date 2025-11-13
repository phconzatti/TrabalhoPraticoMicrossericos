package com.example.demo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "quote")
public class CurrencyReport {
    @Id
    private Long id;
    @Column(name = "currency_from")
    private String from;
    @Column(name = "currency_to")
    private String to;
    @Column(name = "report_multiple")
    private BigDecimal reportMultiple;

    public CurrencyReport() {
    }

    public CurrencyReport(Long id, String from, String to, BigDecimal reportMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.reportMultiple = reportMultiple;
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

    public BigDecimal getReportMultiple() {
        return reportMultiple;
    }

    public void setReportMultiple(BigDecimal reportMultiple) {
        this.reportMultiple = reportMultiple;
    }
}