package com.example.mortgagecalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.mortgagecalculator.model.MortgageData;
import com.example.mortgagecalculator.repository.MortgageRepository;
import com.example.mortgagecalculator.service.MortgageService;

class MortgageServiceTest {

    @Mock
    private MortgageRepository repository;

    @InjectMocks
    private MortgageService service;

    @BeforeEach
    void setup() {
        // Initialize mocks before each test
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void calculateAndSaveTest() {
        // Arrange
        MortgageData inputData = new MortgageData();
        inputData.setLoanAmount(100000);
        inputData.setInterestRate(3.5);
        inputData.setLoanTerm(30);

        // Expected adjusted data
        MortgageData expectedData = new MortgageData();
        expectedData.setLoanAmount(100000);
        expectedData.setInterestRate(3.5);
        expectedData.setLoanTerm(30);
        expectedData.setMonthlyPrincipalAndInterest(449.04); // Example value (actual logic should calculate this)

        when(repository.save(any(MortgageData.class))).thenReturn(expectedData);

        // Act
        MortgageData result = service.calculateAndSave(inputData);

        // Assert
        assertEquals(100000, result.getLoanAmount());
        assertEquals(3.5, result.getInterestRate());
        assertEquals(30, result.getLoanTerm());
        assertEquals(449.04, result.getMonthlyPrincipalAndInterest(), 0.01);
    }
}
