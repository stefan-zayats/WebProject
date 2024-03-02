package org.example.webproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CreditResult {
    private double sum;
    private double allOverpayment;
    private double monthlyPayment;
    private String currency;
}