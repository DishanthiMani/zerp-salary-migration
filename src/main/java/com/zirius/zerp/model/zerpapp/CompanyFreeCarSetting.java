package com.zirius.zerp.model.zerpapp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "company_free_car_settings")
public class CompanyFreeCarSetting {
    @Id
    private Long COMPANY_FREE_CAR_SETTINGS_ID;
    private Boolean  IS_CAR_POOL;
    private Boolean  IS_DRIVING_OVER_40000;
    private Boolean  IS_ELECTRIC_CAR;
    private Boolean  IS_COMMERCIAL_VEHICLE;
    private Integer COMPANY_ID;
    private int VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

    public Long getCOMPANY_FREE_CAR_SETTINGS_ID() {
        return COMPANY_FREE_CAR_SETTINGS_ID;
    }

    public void setCOMPANY_FREE_CAR_SETTINGS_ID(Long COMPANY_FREE_CAR_SETTINGS_ID) {
        this.COMPANY_FREE_CAR_SETTINGS_ID = COMPANY_FREE_CAR_SETTINGS_ID;
    }

    public Boolean  isIS_CAR_POOL() {
        return IS_CAR_POOL;
    }

    public void setIS_CAR_POOL(Boolean  IS_CAR_POOL) {
        this.IS_CAR_POOL = IS_CAR_POOL;
    }

    public Boolean  isIS_DRIVING_OVER_40000() {
        return IS_DRIVING_OVER_40000;
    }

    public void setIS_DRIVING_OVER_40000(Boolean  IS_DRIVING_OVER_40000) {
        this.IS_DRIVING_OVER_40000 = IS_DRIVING_OVER_40000;
    }

    public Boolean  isIS_ELECTRIC_CAR() {
        return IS_ELECTRIC_CAR;
    }

    public void setIS_ELECTRIC_CAR(Boolean  IS_ELECTRIC_CAR) {
        this.IS_ELECTRIC_CAR = IS_ELECTRIC_CAR;
    }

    public Boolean  isIS_COMMERCIAL_VEHICLE() {
        return IS_COMMERCIAL_VEHICLE;
    }

    public void setIS_COMMERCIAL_VEHICLE(Boolean  IS_COMMERCIAL_VEHICLE) {
        this.IS_COMMERCIAL_VEHICLE = IS_COMMERCIAL_VEHICLE;
    }

    public Integer getCOMPANY_ID() {
        return COMPANY_ID;
    }

    public void setCOMPANY_ID(Integer COMPANY_ID) {
        this.COMPANY_ID = COMPANY_ID;
    }

    public int getVERSION() {
        return VERSION;
    }

    public void setVERSION(int VERSION) {
        this.VERSION = VERSION;
    }

    public Date getCREATED_DATETIME() {
        return CREATED_DATETIME;
    }

    public void setCREATED_DATETIME(Date CREATED_DATETIME) {
        this.CREATED_DATETIME = CREATED_DATETIME;
    }

    public Date getMODIFIED_DATETIME() {
        return MODIFIED_DATETIME;
    }

    public void setMODIFIED_DATETIME(Date MODIFIED_DATETIME) {
        this.MODIFIED_DATETIME = MODIFIED_DATETIME;
    }
}
