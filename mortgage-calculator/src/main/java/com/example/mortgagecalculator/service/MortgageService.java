package com.example.mortgagecalculator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mortgagecalculator.model.MortgageData;
import com.example.mortgagecalculator.repository.MortgageRepository;

@Service
public class MortgageService {

    @Autowired
    private MortgageRepository mortgageRepository;

    public MortgageData calculateAndSave(MortgageData data) {
        double adjustedInterestRate = data.getInterestRate() +
                (data.getCreditScore().equals("Excellent") ? -0.5 : 0);

        double monthlyRate = adjustedInterestRate / 12 / 100;
        int payments = data.getLoanTerm() * 12;
        double monthlyPrincipal = data.getLoanAmount() * monthlyRate / (1 - Math.pow(1 + monthlyRate, -payments));
        data.setMonthlyPrincipalAndInterest(monthlyPrincipal);

        return (MortgageData) mortgageRepository.save(data);
    }
}
