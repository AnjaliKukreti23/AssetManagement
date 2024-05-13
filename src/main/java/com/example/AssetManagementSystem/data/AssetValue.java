package com.example.AssetManagementSystem.data;

import java.math.BigDecimal;

public class AssetValue{


//    private final String title;

    private final String title;

    private final BigDecimal depreciationRate;

    private final BigDecimal cost;
    private final long monthPeriod;
    private final long yearPeriod;

    private final double assetValue;

    public AssetValue(final String title,final BigDecimal depreciationRate,final BigDecimal cost,final long monthPeriod,final long yearPeriod,final double assetValue) {
        this.title=title;
        this.depreciationRate=depreciationRate;
        this.cost=cost;
        this.monthPeriod=monthPeriod;
        this.yearPeriod = yearPeriod;
        this.assetValue = assetValue;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public String getTitle() {
        return title;
    }

    public BigDecimal getDepreciationRate() {
        return depreciationRate;
    }

    public long getMonthPeriod() {
        if(monthPeriod>=12){
            return monthPeriod-12;
        }

        else{
        return monthPeriod;}
    }

    public long getYearPeriod() {
        return yearPeriod;
    }

    public double getAssetValue() {
        return assetValue;
    }
}
