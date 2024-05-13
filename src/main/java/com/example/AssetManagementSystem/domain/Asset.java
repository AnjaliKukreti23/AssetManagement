package com.example.AssetManagementSystem.domain;


import jakarta.persistence.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name="asset")
public class Asset {


    /**
     * unique id of records.
     */
    @Column(name="id",nullable=false,updatable=false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    /**
     * purchasing cost of assest
     */
    @Column(name="cost",nullable = false,updatable = false)
    private BigDecimal cost;


    /**
     * Depreciation rate of asset.
     */
    @Column(name="depreciationRate",nullable = false,updatable = false)
    private BigDecimal depreciationRate;


    /**
     * Date of purchase of asset.
     */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date",nullable = false,updatable = false)
    private Date date;


    /**
     * year of asset purchase.
     */
    @Column(name="year_value",nullable=false,updatable=false)
    private int yearOfPurchase;




    /**
     * The asset purchased.
     */
    @Column(name="title",nullable = false,updatable = false)
    private String title;


    /**
     * Default constructor.
     */
    Asset(){
        super();
    }


    Calendar cal1=Calendar.getInstance();



    /**
     *
     * @param title of asset.
     * @param date  of purchase of asset.
     * @param cost  of asset.
     * @param depreciationRate of asset.
     */
    public Asset(final String title,final Date date,final BigDecimal cost,final BigDecimal depreciationRate){
        super();
        this.title=title;
        this.date=date;
        cal1.setTime(date);

        this.yearOfPurchase=cal1.get(Calendar.YEAR);
        this.cost=cost;
        this.depreciationRate=depreciationRate.divide(new BigDecimal(100),2, RoundingMode.CEILING);;
    }


    /**
     *
     * @param cost of asset.
     */
    public void setCost(final BigDecimal cost) {
        this.cost = cost;
    }


    /**
     *
     * @param depreciationRate of asset.
     */
    public void setDepreciationRate(final BigDecimal depreciationRate) {
        this.depreciationRate = depreciationRate.divide(new BigDecimal(100),2, RoundingMode.CEILING);;
    }


    /**
     *
     * @param date of purchase of asset.
     */
    public void setDate(final Date date) {
        this.date = date;
    }




    /**
     *
     * @param title of the purchased asset.
     */
    public void setTitle(final String title) {
        this.title = title;
    }





    /**
     *
     * @return cost of asset.
     */
    public BigDecimal getCost() {
        return cost;
    }


    /**
     *
     * @return depreciation rate of asset.
     */
    public BigDecimal getDepreciationRate() {
        return depreciationRate;
    }



    /**
     *
     * @return date on which asset is purchased.
     */
    public Date getDate() {
        return date;
    }


    /**
     *
     * @return the purchased asset.
     */
    public String getTitle() {
        return title;
    }


    /**
     *
     * @return the year of the purchase.
     */
    public int getYear(){return yearOfPurchase;}


}
