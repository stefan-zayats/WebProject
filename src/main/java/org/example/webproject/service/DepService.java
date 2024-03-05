package org.example.webproject.service;

import org.example.webproject.entity.CapitalizationType;
import org.example.webproject.entity.DepResult;
import org.springframework.stereotype.Service;

@Service
public class DepService {

    public DepResult calculateProfit(double amount, int term, String currency, double interestRate, String cap) {
        CapitalizationType type = CapitalizationType.valueOf(cap.toUpperCase());
        double capValue =
                switch (type) {
                    case DAY -> (double) 365 / 12;
                    case MOUTH -> 1.0;
                    case QUARTER -> 0.25;
                    case YEAR -> (double) 1 / 12;
                };

        double totalAmount = amount * Math.pow(1 + (interestRate / 100 / (capValue * term)), capValue * term);

        double cleanProfitAmount = totalAmount - amount;

        double cleanProfitPercentage = (cleanProfitAmount / amount) * 100;

        // Builder(prefer)
        return DepResult.builder()
                .initAmount(amount)
                .totalAmount(totalAmount)
                .cleanProfitAmount(cleanProfitAmount)
                .cleanProfitPercentage(cleanProfitPercentage)
                .currency(currency)
                .build();

//        // Constructor(not prefer)
//        return new DepResult(totalAmount, amount, cleanProfitAmount, cleanProfitPercentage, currency);
    }
}
