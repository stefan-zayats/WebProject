package org.example.webproject.entity;

public class DepResult {

    private double cleanProfitAmount;
    private double cleanProfitPercentage;
    private String currency;


    public DepResult(double cleanProfitAmount, double cleanProfitPercentage, String currency) {
        this.cleanProfitAmount = cleanProfitAmount;
        this.cleanProfitPercentage = cleanProfitPercentage;
        this.currency = currency;
    }

    @Override
    public String toString() {

        return "{" + "Чистая прибыль сумма: " + getCleanProfitAmount() + " " + currency + ", " +
                "Чистая прибыль процент: " + getCleanProfitPercentage() + "% " +
                "}";
    }

    public double getCleanProfitAmount() {
        return cleanProfitAmount;
    }

    public void setCleanProfitAmount(double cleanProfitAmount) {
        this.cleanProfitAmount = cleanProfitAmount;
    }

    public double getCleanProfitPercentage() {
        return cleanProfitPercentage;
    }

    public void setCleanProfitPercentage(double cleanProfitPercentage) {
        this.cleanProfitPercentage = cleanProfitPercentage;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
