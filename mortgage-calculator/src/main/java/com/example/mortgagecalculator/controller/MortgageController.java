package com.example.mortgagecalculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.mortgagecalculator.model.MortgageData;
import com.example.mortgagecalculator.service.MortgageService;

@RestController
@RequestMapping("/api/mortgage")
public class MortgageController {

    @Autowired
    private MortgageService mortgageService;

    @PostMapping("/calculate")
    public MortgageData calculateMortgage(@RequestBody MortgageData data) {
        return mortgageService.calculateAndSave(data);
    }
}
