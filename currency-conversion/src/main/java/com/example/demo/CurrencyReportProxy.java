package com.example.demo;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "currency-report")
public interface CurrencyReportProxy {
    @GetMapping("/currency-report/health")
    public Map<String, String> healthCheck();
}