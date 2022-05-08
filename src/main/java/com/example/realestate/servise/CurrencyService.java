package com.example.realestate.servise;


import com.example.realestate.model.Currency;

import java.util.List;

public interface CurrencyService {
    List<Currency> getAll();
    void insert(Currency currency);
    void update(String currencyId,Currency currency);
    void deleteById(String currencyId);
    Currency getById(String currencyId);
}