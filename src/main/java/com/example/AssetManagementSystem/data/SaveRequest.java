package com.example.AssetManagementSystem.data;

import java.math.BigDecimal;
import java.util.Date;

public class SaveRequest {

    /**
     * purchasing cost of assest
     */
    private BigDecimal cost;

    /**
     * Depreciation rate of asset.
     */
    private BigDecimal depreciationRate;

    /**
     * Date of purchase of asset.
     */
    private Date date;

    /**
     * The asset purchased.
     */
    private String title;

    /**
     * currency .
     */
    private String currency;


    public SaveRequest(final BigDecimal cost,final BigDecimal depreciationRate,final Date date,final String title,final String currency) {
        this.cost = cost;
        this.depreciationRate = depreciationRate;
        this.date = date;
        this.title = title;
        this.currency = currency;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public BigDecimal getDepreciationRate() {
        return depreciationRate;
    }

    public Date getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }

    public String getCurrency() {
        return currency;
    }
}
