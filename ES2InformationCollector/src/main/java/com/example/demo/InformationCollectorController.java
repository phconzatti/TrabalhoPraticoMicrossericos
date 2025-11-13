package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/historico")
public class InformationCollectorController {
    
    private final InformationCollectorRepository repository;

    public InformationCollectorController(InformationCollectorRepository repository) {
        this.repository = repository;
    } 

    @PostMapping
    public InformationCollector salvar(@RequestBody InformationCollector dto) {
        return repository.save(dto);
    }
}
