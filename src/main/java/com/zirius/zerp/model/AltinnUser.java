package com.zirius.zerp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "altinn_user")
public class AltinnUser {

    @Id
    private Long ALTINN_USER_ID;
    private Long USER_ID;
    private Long USER_COMPANY_ID;
    private String ssn;
    private String SYSTEM_NAME;
    private String SYSTEM_PASSWORD;
    private String USER_NAME;
    private String USER_PASSWORD;
    private String PHONE_NUMBER;
    private String DESCRIPTION;
    private Boolean IS_DEFAULT;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;
    private Integer VERSION;

    public Long getALTINN_USER_ID() {
        return ALTINN_USER_ID;
    }

    public void setALTINN_USER_ID(Long ALTINN_USER_ID) {
        this.ALTINN_USER_ID = ALTINN_USER_ID;
    }

    public Long getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Long USER_ID) {
        this.USER_ID = USER_ID;
    }

    public Long getUSER_COMPANY_ID() {
        return USER_COMPANY_ID;
    }

    public void setUSER_COMPANY_ID(Long USER_COMPANY_ID) {
        this.USER_COMPANY_ID = USER_COMPANY_ID;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getSYSTEM_NAME() {
        return SYSTEM_NAME;
    }

    public void setSYSTEM_NAME(String SYSTEM_NAME) {
        this.SYSTEM_NAME = SYSTEM_NAME;
    }

    public String getSYSTEM_PASSWORD() {
        return SYSTEM_PASSWORD;
    }

    public void setSYSTEM_PASSWORD(String SYSTEM_PASSWORD) {
        this.SYSTEM_PASSWORD = SYSTEM_PASSWORD;
    }

    public String getUSER_NAME() {
        return USER_NAME;
    }

    public void setUSER_NAME(String USER_NAME) {
        this.USER_NAME = USER_NAME;
    }

    public String getUSER_PASSWORD() {
        return USER_PASSWORD;
    }

    public void setUSER_PASSWORD(String USER_PASSWORD) {
        this.USER_PASSWORD = USER_PASSWORD;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public void setPHONE_NUMBER(String PHONE_NUMBER) {
        this.PHONE_NUMBER = PHONE_NUMBER;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public Boolean getIS_DEFAULT() {
        return IS_DEFAULT;
    }

    public void setIS_DEFAULT(Boolean IS_DEFAULT) {
        this.IS_DEFAULT = IS_DEFAULT;
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

    public Integer getVERSION() {
        return VERSION;
    }

    public void setVERSION(Integer VERSION) {
        this.VERSION = VERSION;
    }



}

