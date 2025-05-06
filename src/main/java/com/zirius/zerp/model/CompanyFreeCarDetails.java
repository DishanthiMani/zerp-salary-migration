package com.zirius.zerp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "company_free_car_details")
public class CompanyFreeCarDetails {

    @Id
    private Long COMPANY_FREE_CAR_DETAILS_ID;
    private String REGISTER_NO;
    private Date REGISTERED_DATE;
    private String MODEL;
    private String BRAND;
    private Double LIST_PRICE;
    private Integer COMPANY_FREE_CAR_SETTINGS_ID;
    private Integer COMPANY_FREE_CAR_BENEFITS_ID;
    private Integer COMPANY_FREE_CAR_INSURANCE_ID;
    private Integer COMPANY_ID;
    private Boolean  IS_ACTIVE;
    private int VERSION;
    private Date MODIFIED_DATETIME;
    private Date CREATED_DATETIME;

    public Long getCOMPANY_FREE_CAR_DETAILS_ID() {
        return COMPANY_FREE_CAR_DETAILS_ID;
    }

    public void setCOMPANY_FREE_CAR_DETAILS_ID(Long COMPANY_FREE_CAR_DETAILS_ID) {
        this.COMPANY_FREE_CAR_DETAILS_ID = COMPANY_FREE_CAR_DETAILS_ID;
    }

    public String getREGISTER_NO() {
        return REGISTER_NO;
    }

    public void setREGISTER_NO(String REGISTER_NO) {
        this.REGISTER_NO = REGISTER_NO;
    }

    public Date getREGISTERED_DATE() {
        return REGISTERED_DATE;
    }

    public void setREGISTERED_DATE(Date REGISTERED_DATE) {
        this.REGISTERED_DATE = REGISTERED_DATE;
    }

    public String getMODEL() {
        return MODEL;
    }

    public void setMODEL(String MODEL) {
        this.MODEL = MODEL;
    }

    public String getBRAND() {
        return BRAND;
    }

    public void setBRAND(String BRAND) {
        this.BRAND = BRAND;
    }

    public Double getLIST_PRICE() {
        return LIST_PRICE;
    }

    public void setLIST_PRICE(Double LIST_PRICE) {
        this.LIST_PRICE = LIST_PRICE;
    }

    public Integer getCOMPANY_FREE_CAR_SETTINGS_ID() {
        return COMPANY_FREE_CAR_SETTINGS_ID;
    }

    public void setCOMPANY_FREE_CAR_SETTINGS_ID(Integer COMPANY_FREE_CAR_SETTINGS_ID) {
        this.COMPANY_FREE_CAR_SETTINGS_ID = COMPANY_FREE_CAR_SETTINGS_ID;
    }

    public Integer getCOMPANY_FREE_CAR_BENEFITS_ID() {
        return COMPANY_FREE_CAR_BENEFITS_ID;
    }

    public void setCOMPANY_FREE_CAR_BENEFITS_ID(Integer COMPANY_FREE_CAR_BENEFITS_ID) {
        this.COMPANY_FREE_CAR_BENEFITS_ID = COMPANY_FREE_CAR_BENEFITS_ID;
    }

    public Integer getCOMPANY_FREE_CAR_INSURANCE_ID() {
        return COMPANY_FREE_CAR_INSURANCE_ID;
    }

    public void setCOMPANY_FREE_CAR_INSURANCE_ID(Integer COMPANY_FREE_CAR_INSURANCE_ID) {
        this.COMPANY_FREE_CAR_INSURANCE_ID = COMPANY_FREE_CAR_INSURANCE_ID;
    }

    public Integer getCOMPANY_ID() {
        return COMPANY_ID;
    }

    public void setCOMPANY_ID(Integer COMPANY_ID) {
        this.COMPANY_ID = COMPANY_ID;
    }

    public Boolean  isIS_ACTIVE() {
        return IS_ACTIVE;
    }

    public void setIS_ACTIVE(Boolean  IS_ACTIVE) {
        this.IS_ACTIVE = IS_ACTIVE;
    }

    public int getVERSION() {
        return VERSION;
    }

    public void setVERSION(int VERSION) {
        this.VERSION = VERSION;
    }

    public Date getMODIFIED_DATETIME() {
        return MODIFIED_DATETIME;
    }

    public void setMODIFIED_DATETIME(Date MODIFIED_DATETIME) {
        this.MODIFIED_DATETIME = MODIFIED_DATETIME;
    }

    public Date getCREATED_DATETIME() {
        return CREATED_DATETIME;
    }

    public void setCREATED_DATETIME(Date CREATED_DATETIME) {
        this.CREATED_DATETIME = CREATED_DATETIME;
    }
}

