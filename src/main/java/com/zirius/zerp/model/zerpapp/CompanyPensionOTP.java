package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "company_pension_otp")
public class CompanyPensionOTP {

    @Id
    private Long OTP_ID;
    private String ORG_NO;
    private String NAME;
    private Integer PENSION_OTP_ID;
    private Boolean  IS_ACTIVE;
    private Integer COMPANY_ID;
    private Boolean  IS_CUSTOM;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

    public Long getOTP_ID() {
        return OTP_ID;
    }

    public void setOTP_ID(Long OTP_ID) {
        this.OTP_ID = OTP_ID;
    }

    public String getORG_NO() {
        return ORG_NO;
    }

    public void setORG_NO(String ORG_NO) {
        this.ORG_NO = ORG_NO;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public Integer getPENSION_OTP_ID() {
        return PENSION_OTP_ID;
    }

    public void setPENSION_OTP_ID(Integer PENSION_OTP_ID) {
        this.PENSION_OTP_ID = PENSION_OTP_ID;
    }

    public Boolean  isIS_ACTIVE() {
        return IS_ACTIVE;
    }

    public void setIS_ACTIVE(Boolean  IS_ACTIVE) {
        this.IS_ACTIVE = IS_ACTIVE;
    }

    public Integer getCOMPANY_ID() {
        return COMPANY_ID;
    }

    public void setCOMPANY_ID(Integer COMPANY_ID) {
        this.COMPANY_ID = COMPANY_ID;
    }

    public Boolean  isIS_CUSTOM() {
        return IS_CUSTOM;
    }

    public void setIS_CUSTOM(Boolean  IS_CUSTOM) {
        this.IS_CUSTOM = IS_CUSTOM;
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
