package com.example.AssetManagementSystem.data;

import java.util.ArrayList;
import java.util.Collection;

public class GetAssetListResponse {

    private Collection<AssetSummary> assetSummaryCollection;


    public void addAssetList(final AssetSummary assetSummary){
        if(assetSummaryCollection==null){
            assetSummaryCollection=new ArrayList<>();
        }
        assetSummaryCollection.add(assetSummary);
    }

    public Collection<AssetSummary> getAssetSummaryCollection(){
        return assetSummaryCollection;
    }

}
