package com.example.AssetManagementSystem.data;

import java.util.ArrayList;
import java.util.Collection;

public class GetTotalSummaryOfAssetsResponse {
    private Collection<TotalAssetData> totalAssetDataCollection;

    public void addTotalDetailsOfAsset(TotalAssetData totalAssetData){
        if(totalAssetDataCollection==null){
            totalAssetDataCollection=new ArrayList<>();
        }
        totalAssetDataCollection.add(totalAssetData);
    }

    public Collection<TotalAssetData> getTotalAssetDataCollection(){
        return totalAssetDataCollection;
    }


}
