package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "work_place")
public class CompanyWorkPlace {

    @Id
    private Integer WORK_PLACE_ID;

    private String WORK_PLACE_CODE;

    private String WORK_PLACE_NAME;

    private String BUSINESS_NUMBER;

    private Integer MUNICIPALITY_ID;

    private Boolean  IS_DELETED;

    private Boolean  IS_FLOATING_WORK_PLACE;

    private Date CREATED_DATETIME;

    private Date MODIFIED_DATETIME;

    private Integer COMPANY_ID;

    private Integer VERSION;

    public Integer getWORK_PLACE_ID() {
        return WORK_PLACE_ID;
    }

    public void setWORK_PLACE_ID(Integer WORK_PLACE_ID) {
        this.WORK_PLACE_ID = WORK_PLACE_ID;
    }

    public String getWORK_PLACE_CODE() {
        return WORK_PLACE_CODE;
    }

    public void setWORK_PLACE_CODE(String WORK_PLACE_CODE) {
        this.WORK_PLACE_CODE = WORK_PLACE_CODE;
    }

    public String getWORK_PLACE_NAME() {
        return WORK_PLACE_NAME;
    }

    public void setWORK_PLACE_NAME(String WORK_PLACE_NAME) {
        this.WORK_PLACE_NAME = WORK_PLACE_NAME;
    }

    public String getBUSINESS_NUMBER() {
        return BUSINESS_NUMBER;
    }

    public void setBUSINESS_NUMBER(String BUSINESS_NUMBER) {
        this.BUSINESS_NUMBER = BUSINESS_NUMBER;
    }

    public Integer getMUNICIPALITY_ID() {
        return MUNICIPALITY_ID;
    }

    public void setMUNICIPALITY_ID(Integer MUNICIPALITY_ID) {
        this.MUNICIPALITY_ID = MUNICIPALITY_ID;
    }

    public Boolean  getIS_DELETED() {
        return IS_DELETED;
    }

    public void setIS_DELETED(Boolean  IS_DELETED) {
        this.IS_DELETED = IS_DELETED;
    }

    public Boolean  isIS_FLOATING_WORK_PLACE() {
        return IS_FLOATING_WORK_PLACE;
    }

    public void setIS_FLOATING_WORK_PLACE(Boolean  IS_FLOATING_WORK_PLACE) {
        this.IS_FLOATING_WORK_PLACE = IS_FLOATING_WORK_PLACE;
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

    public Integer getCOMPANY_ID() {
        return COMPANY_ID;
    }

    public void setCOMPANY_ID(Integer COMPANY_ID) {
        this.COMPANY_ID = COMPANY_ID;
    }

    public Integer getVERSION() {
        return VERSION;
    }

    public void setVERSION(Integer VERSION) {
        this.VERSION = VERSION;
    }
}
