package com.example.AssetManagementSystem.data;

import java.math.BigDecimal;
import java.time.Duration;
import java.util.Date;

public class AssetSummary {

    private String title;

    private BigDecimal depreciatedRate;

    private BigDecimal assetCost;

    private String monthAndYear;

    private double assetValue;

    public AssetSummary(final String title,final BigDecimal depreciatedRate,final BigDecimal assetCost,final String monthAndYear,final double assetValue) {
        this.title = title;
        this.depreciatedRate = depreciatedRate.multiply(new BigDecimal(100));
        this.assetCost = assetCost;
        this.monthAndYear = monthAndYear;
        this.assetValue = assetValue;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getDepreciatedRate() {
        return depreciatedRate;
    }

    public BigDecimal getAssetCost() {
        return assetCost;
    }

    public String getMonthAndYear() {
        return monthAndYear;
    }

    public double getAssetValue() {
        return assetValue;
    }
}
