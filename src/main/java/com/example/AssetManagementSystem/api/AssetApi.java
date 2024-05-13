package com.example.AssetManagementSystem.api;


import com.example.AssetManagementSystem.core.AssetService;
import com.example.AssetManagementSystem.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.Date;

@RequestMapping("/asset")
@RestController
public class AssetApi {
    @Autowired
    private AssetService assetService;


    /**
     *
     * @param request
     * @return   list of assets.
     */
    @GetMapping("/assetList")
    public ResponseEntity<GetAssetListResponse> assetValue(final GetAssetListRequest request){
        return ResponseEntity.ok(assetService.getValueOfAssets(request));
    }

    /**
     *
     * @param request
     * @return summary of assets.
     */
    @GetMapping("/totalDetails")
    public ResponseEntity<GetTotalSummaryOfAssetsResponse> assetDetails(final GetTotalSummaryOfAssetsRequest request){
        return ResponseEntity.ok(assetService.getTotalAssets(request));
    }


    @PostMapping("/save")
    public ResponseEntity<SaveResponse> savingAssets(@RequestBody  final SaveRequest request){

        return ResponseEntity.ok(assetService.saveAssets(request));
    }

}
