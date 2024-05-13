package com.example.AssetManagementSystem.persistence;

import com.example.AssetManagementSystem.data.AssetSummary;
import com.example.AssetManagementSystem.data.AssetValue;
import com.example.AssetManagementSystem.data.TotalAssetData;
import com.example.AssetManagementSystem.domain.Asset;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AssetRepository extends CrudRepository<Asset,Long> {

  @Query(
          value="SELECT "+"new com.example.AssetManagementSystem.data.AssetSummary(asset.cost,asset.depreciationRate,asset.date,asset.title) "+
                  "FROM Asset asset"
  )

    List<AssetSummary> getAssets();


   @Query(
            value="SELECT "+"new com.example.AssetManagementSystem.data.AssetValue(asset.title,asset.depreciationRate,asset.cost,DATEDIFF(month,asset.date,current_date) as month_period,DATEDIFF(year,asset.date,current_date) as yearPeriod,(asset.cost)*POWER(1-asset.depreciationRate,DATEDIFF(year,asset.date,current_date))) "+
                    "FROM Asset asset"
    )

   List<AssetValue> getAssetTimePeriod();


   @Query(
           value="SELECT "+"new com.example.AssetManagementSystem.data.TotalAssetData(COUNT(asset.title),SUM(asset.cost),SUM((asset.cost)*POWER(1-asset.depreciationRate,DATEDIFF(year,asset.date,current_date))),asset.currency) "
           +"FROM Asset asset "
           +"GROUP BY(asset.currency) "
   )

    List<TotalAssetData> getTotalSummaryOfAssets();
 }
