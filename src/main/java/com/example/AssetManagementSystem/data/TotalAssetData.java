package com.example.AssetManagementSystem.data;

import java.math.BigDecimal;

public class TotalAssetData {

    /**
     * Total number of Assets.
     */
    private long assetCount;


    /**
     * Total cost of Assets.
     */
    private BigDecimal totalCostOfAssets;


    /**
     * Sum of Depreciated Values of Assets.
     */
    private Double totalValueOfAssets;


    private String currency;
    /**
     * 
     * @param assetCount
     * @param totalCostOfAssets
     * @param totalValueOfAssets
     */

    public TotalAssetData(final long assetCount,final BigDecimal totalCostOfAssets,final Double totalValueOfAssets,final String currency) {
        this.assetCount = assetCount;
        this.totalCostOfAssets = totalCostOfAssets;
        this.totalValueOfAssets = totalValueOfAssets;
        this.currency=currency;
    }


    /**
     *
     * @return total number of assets.
     */
    public long getAssetCount() {
        return assetCount;
    }


    /**
     *
     * @return total cost of all assets.
     */
    public BigDecimal getTotalCostOfAssets() {
        return totalCostOfAssets;
    }

    /**
     *
     * @return total depreciated values of all assets.
     */
    public Double getTotalValueOfAssets() {
        return totalValueOfAssets;
    }

    public String getCurrency(){return currency;}
}
