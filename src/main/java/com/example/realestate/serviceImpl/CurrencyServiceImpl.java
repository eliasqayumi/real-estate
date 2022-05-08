package com.example.realestate.serviceImpl;

import com.example.realestate.model.Currency;
import com.example.realestate.repository.CurrencyRepository;
import com.example.realestate.servise.CurrencyService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CurrencyServiceImpl implements CurrencyService {
    private CurrencyRepository currencyRepository;

    public CurrencyServiceImpl(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    @Override
    public List<Currency> getAll() {
        return this.currencyRepository.findAll();
    }

    @Override
    public void insert(Currency currency) {
        this.currencyRepository.save(currency);
    }

    @Override
    public void update(String currencyId, Currency currency) {
        Currency updateCurrency=this.currencyRepository.getById(currencyId);
        updateCurrency.setCurrencies(currency.getCurrencies());
        this.currencyRepository.save(updateCurrency);
    }

    @Override
    public void deleteById(String currencyId) {
        this.currencyRepository.deleteById(currencyId);
    }

    @Override
    public Currency getById(String currencyId) {
        return this.currencyRepository.getById(currencyId);
    }
}
