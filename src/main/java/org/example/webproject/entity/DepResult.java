package org.example.webproject.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class DepResult {
    private double initAmount;
    private double totalAmount;
    private double cleanProfitAmount;
    private double cleanProfitPercentage;
    private String currency;
}