package com.zirius.zerp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "claim_collectors")
public class ClaimCollectorDetails {
    @Id
    private Long CLAIM_COLLECTORS_ID;
    private String NAME;
    private String ADDRESS;
    private String ADDRESS_1;
    private String ADDRESS_2;
    private String POSTAL_CODE;
    private String BANK_ACCOUNT_NO;
    private Long BANK_ACCOUNT_ID;
    private Integer CLAIM_COLLECTORS_VALUES_ID;
    private Integer COMPANY_ID;
    private Boolean IS_ACTIVE;
    private Boolean ENABLE_BANK_PAYMENT;
    private Long VERSION;
    private Date MODIFIED_DATETIME;
    private Date CREATED_DATETIME;

    public Long getCLAIM_COLLECTORS_ID() {
        return CLAIM_COLLECTORS_ID;
    }

    public void setCLAIM_COLLECTORS_ID(Long CLAIM_COLLECTORS_ID) {
        this.CLAIM_COLLECTORS_ID = CLAIM_COLLECTORS_ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getADDRESS() {
        return ADDRESS;
    }

    public void setADDRESS(String ADDRESS) {
        this.ADDRESS = ADDRESS;
    }

    public String getADDRESS_1() {
        return ADDRESS_1;
    }

    public void setADDRESS_1(String ADDRESS_1) {
        this.ADDRESS_1 = ADDRESS_1;
    }

    public String getADDRESS_2() {
        return ADDRESS_2;
    }

    public void setADDRESS_2(String ADDRESS_2) {
        this.ADDRESS_2 = ADDRESS_2;
    }

    public String getPOSTAL_CODE() {
        return POSTAL_CODE;
    }

    public void setPOSTAL_CODE(String POSTAL_CODE) {
        this.POSTAL_CODE = POSTAL_CODE;
    }

    public String getBANK_ACCOUNT_NO() {
        return BANK_ACCOUNT_NO;
    }

    public void setBANK_ACCOUNT_NO(String BANK_ACCOUNT_NO) {
        this.BANK_ACCOUNT_NO = BANK_ACCOUNT_NO;
    }

    public Long getBANK_ACCOUNT_ID() {
        return BANK_ACCOUNT_ID;
    }

    public void setBANK_ACCOUNT_ID(Long BANK_ACCOUNT_ID) {
        this.BANK_ACCOUNT_ID = BANK_ACCOUNT_ID;
    }

    public Integer getCLAIM_COLLECTORS_VALUES_ID() {
        return CLAIM_COLLECTORS_VALUES_ID;
    }

    public void setCLAIM_COLLECTORS_VALUES_ID(Integer CLAIM_COLLECTORS_VALUES_ID) {
        this.CLAIM_COLLECTORS_VALUES_ID = CLAIM_COLLECTORS_VALUES_ID;
    }

    public Integer getCOMPANY_ID() {
        return COMPANY_ID;
    }

    public void setCOMPANY_ID(Integer COMPANY_ID) {
        this.COMPANY_ID = COMPANY_ID;
    }

    public Boolean getIS_ACTIVE() {
        return IS_ACTIVE;
    }

    public void setIS_ACTIVE(Boolean IS_ACTIVE) {
        this.IS_ACTIVE = IS_ACTIVE;
    }

    public Boolean getENABLE_BANK_PAYMENT() {
        return ENABLE_BANK_PAYMENT;
    }

    public void setENABLE_BANK_PAYMENT(Boolean ENABLE_BANK_PAYMENT) {
        this.ENABLE_BANK_PAYMENT = ENABLE_BANK_PAYMENT;
    }

    public Long getVERSION() {
        return VERSION;
    }

    public void setVERSION(Long VERSION) {
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

