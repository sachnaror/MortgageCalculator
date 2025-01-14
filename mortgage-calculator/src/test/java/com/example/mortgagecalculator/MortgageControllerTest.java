package com.example.mortgagecalculator;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.mortgagecalculator.controller.MortgageController;
import com.example.mortgagecalculator.model.MortgageData;
import com.example.mortgagecalculator.service.MortgageService;

class MortgageControllerTest {

    @Mock
    private MortgageService mortgageService;

    @InjectMocks
    private MortgageController mortgageController;

    private MockMvc mockMvc;

    @BeforeEach
    void setup() {
        // Initialize mocks
        MockitoAnnotations.openMocks(this);

        // Set up MockMvc
        mockMvc = MockMvcBuilders.standaloneSetup(mortgageController).build();
    }

    @Test
    void calculateMortgageTest() throws Exception {
        // Arrange
        MortgageData inputData = new MortgageData();
        inputData.setLoanAmount(100000);
        inputData.setInterestRate(3.5);
        inputData.setLoanTerm(30);

        MortgageData responseData = new MortgageData();
        responseData.setLoanAmount(100000);
        responseData.setInterestRate(3.5);
        responseData.setLoanTerm(30);
        responseData.setMonthlyPrincipalAndInterest(449.04); // Example value

        when(mortgageService.calculateAndSave(any(MortgageData.class))).thenReturn(responseData);

        String requestJson = """
                {
                    "loanAmount": 100000,
                    "interestRate": 3.5,
                    "loanTerm": 30
                }
                """;

        // Act & Assert
        mockMvc.perform(post("/api/mortgage/calculate")
                .contentType(MediaType.APPLICATION_JSON)
                .content(requestJson))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.loanAmount").value(100000))
                .andExpect(jsonPath("$.interestRate").value(3.5))
                .andExpect(jsonPath("$.loanTerm").value(30))
                .andExpect(jsonPath("$.monthlyPrincipalAndInterest").value(449.04));
    }
}
