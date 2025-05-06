package com.zirius.zerp.model.zerpapp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "claim_collectors_values")
public class ClaimCollectorValues {

    @Id
    private Long CLAIM_COLLECTORS_VALUES_ID;
    private String KID_NO;
    private Double TOTAL_AMOUNT;
    private Double PERCENTAGE;
    private Boolean  IS_STARTING_BALANCE;
    private Double MIN_AMOUNT;
    private Double MAX_AMOUNT;
    private Long VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

    public Long getCLAIM_COLLECTORS_VALUES_ID() {
        return CLAIM_COLLECTORS_VALUES_ID;
    }

    public void setCLAIM_COLLECTORS_VALUES_ID(Long CLAIM_COLLECTORS_VALUES_ID) {
        this.CLAIM_COLLECTORS_VALUES_ID = CLAIM_COLLECTORS_VALUES_ID;
    }

    public String getKID_NO() {
        return KID_NO;
    }

    public void setKID_NO(String KID_NO) {
        this.KID_NO = KID_NO;
    }

    public Double getTOTAL_AMOUNT() {
        return TOTAL_AMOUNT;
    }

    public void setTOTAL_AMOUNT(Double TOTAL_AMOUNT) {
        this.TOTAL_AMOUNT = TOTAL_AMOUNT;
    }

    public Double getPERCENTAGE() {
        return PERCENTAGE;
    }

    public void setPERCENTAGE(Double PERCENTAGE) {
        this.PERCENTAGE = PERCENTAGE;
    }

    public Boolean  isIS_STARTING_BALANCE() {
        return IS_STARTING_BALANCE;
    }

    public void setIS_STARTING_BALANCE(Boolean  IS_STARTING_BALANCE) {
        this.IS_STARTING_BALANCE = IS_STARTING_BALANCE;
    }

    public Double getMIN_AMOUNT() {
        return MIN_AMOUNT;
    }

    public void setMIN_AMOUNT(Double MIN_AMOUNT) {
        this.MIN_AMOUNT = MIN_AMOUNT;
    }

    public Double getMAX_AMOUNT() {
        return MAX_AMOUNT;
    }

    public void setMAX_AMOUNT(Double MAX_AMOUNT) {
        this.MAX_AMOUNT = MAX_AMOUNT;
    }

    public Long getVERSION() {
        return VERSION;
    }

    public void setVERSION(Long VERSION) {
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
