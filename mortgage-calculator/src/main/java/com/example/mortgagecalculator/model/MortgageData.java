package com.example.mortgagecalculator.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mortgage_data")
public class MortgageData {
    @Id
    private String id;
    private double loanAmount;
    private double interestRate;
    private int loanTerm;
    private String creditScore;
    private String propertyType;
    private double propertyTaxRate;
    private double insuranceCost;
    private double adjustedInterestRate;
    private double monthlyPrincipalAndInterest;
    private double monthlyPropertyTax;
    private double monthlyInsurance;
    private double totalMonthlyPayment;
    private double totalLoanCost;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getLoanTerm() {
        return loanTerm;
    }

    public void setLoanTerm(int loanTerm) {
        this.loanTerm = loanTerm;
    }

    public String getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(String creditScore) {
        this.creditScore = creditScore;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public double getPropertyTaxRate() {
        return propertyTaxRate;
    }

    public void setPropertyTaxRate(double propertyTaxRate) {
        this.propertyTaxRate = propertyTaxRate;
    }

    public double getInsuranceCost() {
        return insuranceCost;
    }

    public void setInsuranceCost(double insuranceCost) {
        this.insuranceCost = insuranceCost;
    }

    public double getAdjustedInterestRate() {
        return adjustedInterestRate;
    }

    public void setAdjustedInterestRate(double adjustedInterestRate) {
        this.adjustedInterestRate = adjustedInterestRate;
    }

    public double getMonthlyPrincipalAndInterest() {
        return monthlyPrincipalAndInterest;
    }

    public void setMonthlyPrincipalAndInterest(double monthlyPrincipalAndInterest) {
        this.monthlyPrincipalAndInterest = monthlyPrincipalAndInterest;
    }

    public double getMonthlyPropertyTax() {
        return monthlyPropertyTax;
    }

    public void setMonthlyPropertyTax(double monthlyPropertyTax) {
        this.monthlyPropertyTax = monthlyPropertyTax;
    }

    public double getMonthlyInsurance() {
        return monthlyInsurance;
    }

    public void setMonthlyInsurance(double monthlyInsurance) {
        this.monthlyInsurance = monthlyInsurance;
    }

    public double getTotalMonthlyPayment() {
        return totalMonthlyPayment;
    }

    public void setTotalMonthlyPayment(double totalMonthlyPayment) {
        this.totalMonthlyPayment = totalMonthlyPayment;
    }

    public double getTotalLoanCost() {
        return totalLoanCost;
    }

    public void setTotalLoanCost(double totalLoanCost) {
        this.totalLoanCost = totalLoanCost;
    }
}
