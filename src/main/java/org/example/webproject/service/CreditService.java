package org.example.webproject.service;

import org.example.webproject.entity.DurationType;
import org.example.webproject.entity.CreditResult;
import org.springframework.stereotype.Service;

@Service
public class CreditService {


    public CreditResult calculateLosses(double sum, int term, String currency, double interestRate, String duration) {

        DurationType type = DurationType.valueOf(duration.toUpperCase());
        double multiplier =
            switch (type) {
                case MOUTH -> 1;
                case YEAR -> 12;
            };

        double termInMonths = term * multiplier;

        double monthlyRate = interestRate / 12 / 100;

        double monthlyPayment = (monthlyRate * sum) / (1 - Math.pow((1 + monthlyRate), -termInMonths));

        double allOverpayment = monthlyPayment * termInMonths - sum;

        return new CreditResult(sum, allOverpayment, monthlyPayment, currency);
    }
}

