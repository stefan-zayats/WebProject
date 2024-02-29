package org.example.webproject.service;

import org.example.webproject.entity.CreditResult;
import org.springframework.stereotype.Service;

@Service
public class CreditService {

    public CreditResult calculateLosses(double amount, int term, String currency, double interestRate, Integer interval) {

        double totalAmount = amount * Math.pow(1 + interestRate / 100, term);

        double allOverpayment = totalAmount - amount;

        double monthlyPayment = (allOverpayment / amount) * 100;

        return new CreditResult(amount, allOverpayment, monthlyPayment, currency);
    }
}
