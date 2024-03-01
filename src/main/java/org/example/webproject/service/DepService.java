package org.example.webproject.service;

import org.example.webproject.entity.DepResult;
import org.springframework.stereotype.Service;

@Service
public class DepService {

    public DepResult calculateProfit(double amount, int term, String currency, double interestRate, String cap) {
        double capValue = 1;
        switch (cap) {
            case "day":
                capValue = (double) 365 / 12;
                break;
            case "month":
                capValue = 1;
                break;
            case "quarter":
                capValue = (double) 4 / 12;
                break;
            case "year":
                capValue = (double) 1 / 12;
                break;
        }

        double totalAmount = amount * Math.pow(1 + (interestRate / 100 / (capValue * term)), capValue * term);

        double cleanProfitAmount = totalAmount - amount;

        double cleanProfitPercentage = (cleanProfitAmount / amount) * 100;

        return new DepResult(cleanProfitAmount, cleanProfitPercentage, currency);
    }


}
