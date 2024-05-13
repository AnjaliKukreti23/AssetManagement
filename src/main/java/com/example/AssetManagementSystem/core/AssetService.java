package com.example.AssetManagementSystem.core;


import com.example.AssetManagementSystem.data.*;

import com.example.AssetManagementSystem.domain.Asset;
import com.example.AssetManagementSystem.persistence.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

import java.time.Period;
import java.time.ZoneId;

import java.util.Date;

@Service
public class AssetService {

@Autowired
private AssetRepository assetRepository;


    /**
     *
     * @param request: for list of assets.
     * @return list of assets.
     */
  /* public GetAssetListResponse getListOfAssets(final GetAssetListRequest request) {

        var response = new GetAssetListResponse();

        var assetList=assetRepository.getAssets();
       for(var list:assetList){
           response.addAssetList(new AssetSummary(list.getCost(),list.getDepreciationRate(),list.getDate(),list.getTitle()));
       }

       return response;

    }
*/

    /**
     *
     * @param request for the list of assets.
     * @return the list of assets.
     */
    public GetAssetListResponse getValueOfAssets(final GetAssetListRequest request) {

        var response = new GetAssetListResponse();

        var assetValues=assetRepository.getAssetTimePeriod();


        for(var list:assetValues){
            String monthAndYear=list.getYearPeriod()+"y"+list.getMonthPeriod()+"m";
            response.addAssetList(new AssetSummary(list.getTitle(),list.getDepreciationRate(),list.getCost(),monthAndYear,list.getAssetValue()));
        }
        return response;

    }


    /**
     *
     * @param request:total of assets
     * @return:total of assets.
     */
    public GetTotalSummaryOfAssetsResponse getTotalAssets(final GetTotalSummaryOfAssetsRequest request){
        var response=new GetTotalSummaryOfAssetsResponse();

        for(var totalAssets:assetRepository.getTotalSummaryOfAssets()){
            response.addTotalDetailsOfAsset(new TotalAssetData(totalAssets.getAssetCount(), totalAssets.getTotalCostOfAssets(), totalAssets.getTotalValueOfAssets(),totalAssets.getCurrency()));

        }
        return response;
    }



    /**
     *
     * @param request
     * @return saving the asset details.
     */
    public SaveResponse saveAssets(final SaveRequest request){
        var response=new SaveResponse();

        Asset asset=new Asset(request.getTitle(),request.getDate(),request.getCost(),request.getDepreciationRate(),request.getCurrency());
        assetRepository.save(asset);

        return response;
    }







/**
 * function for computing period in years.
 */

 /*private int calculateDuration(Date assetPurchaseDate,Date currentDate){

      LocalDate assetPurchaseLocalDate=LocalDate.ofInstant(assetPurchaseDate.toInstant(), ZoneId.systemDefault());
      LocalDate currentLocalDate=LocalDate.ofInstant(currentDate.toInstant(),ZoneId.systemDefault());

      Period period=Period.between(assetPurchaseLocalDate,currentLocalDate);
      return period.getYears();
  }
*/

    /**
     * Checking for period and depreciated values:
     *
     */


}

