package org.example.webproject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class DepResult {
    private double cleanProfitAmount;
    private double cleanProfitPercentage;
    private String currency;
}