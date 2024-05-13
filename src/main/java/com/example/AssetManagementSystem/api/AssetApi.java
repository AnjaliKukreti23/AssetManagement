package com.example.AssetManagementSystem.api;


import com.example.AssetManagementSystem.core.AssetService;
import com.example.AssetManagementSystem.data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/asset")
@RestController
public class AssetApi {
    @Autowired
    private AssetService assetService;


    @GetMapping("/assetList")
    public ResponseEntity<GetAssetListResponse> assetValue(final GetAssetListRequest request){
        return ResponseEntity.ok(assetService.getValueOfAssets(request));
    }

    @GetMapping("/totalDetails")
    public ResponseEntity<GetTotalSummaryOfAssetsResponse> assetDetails(final GetTotalSummaryOfAssetsRequest request){
        return ResponseEntity.ok(assetService.getTotalAssets(request));
    }

}
