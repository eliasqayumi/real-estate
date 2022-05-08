package com.example.realestate.controller;

import com.example.realestate.model.Currency;
import com.example.realestate.serviceImpl.CurrencyServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("currency")
public class CurrencyController {
    private CurrencyServiceImpl currencyService;

    public CurrencyController(CurrencyServiceImpl currencyService) {
        this.currencyService = currencyService;
    }

    @GetMapping
    public List<Currency> getAll() {
        return this.currencyService.getAll();
    }

    @GetMapping("/{id}")
    public Currency getById(@PathVariable("id") String currencyId) {
        return this.currencyService.getById(currencyId);
    }

    @PostMapping
    public void insert(@RequestBody Currency currency) {
        this.currencyService.insert(currency);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable("id") String currencyId, @RequestBody Currency currency) {
        this.currencyService.update(currencyId, currency);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") String currencyId) {
        this.currencyService.deleteById(currencyId);
    }
}
