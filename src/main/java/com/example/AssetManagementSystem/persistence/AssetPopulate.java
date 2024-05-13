package com.example.AssetManagementSystem.persistence;

import com.example.AssetManagementSystem.domain.Asset;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@Repository
public class AssetPopulate implements CommandLineRunner {


    @Autowired
    AssetRepository assetRepository;

    public void run(String...s) throws ParseException {
    SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");

    var time=Arrays.asList(new Asset("laptop",sdf.parse("20-12-2022"),new BigDecimal(80000),new BigDecimal(40),"USD"),
            new Asset("tv",sdf.parse("22-2-2023"),new BigDecimal(56000),new BigDecimal(40),"INR")
            ,new Asset("oven",sdf.parse("22-2-2023"),new BigDecimal(40000),new BigDecimal(40),"INR"));
        assetRepository.saveAll(time);



    }

}
