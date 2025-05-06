package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name ="company_salary_details")
public class CompanySalaryDetails {

    @Id
    private Long COMPANY_ID;
    private Integer MUNICIPALITY_ID;
    private Date CHANGED_SALARY_DETAILS;
    private String NACE_CODE;
    private Boolean IS_PENSION_SCHEME;
    private String PENSION_PROVIDER;
    private Boolean LIMIT_TO_SIX_G;
    private Integer COMPANY_ORGANIZATION_TYPE_ID;
    private Boolean IS_FINANCIAL_DIFFICULTY_ENABLED;
    private Long VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

    public Long getCOMPANY_ID() {
        return COMPANY_ID;
    }

    public void setCOMPANY_ID(Long COMPANY_ID) {
        this.COMPANY_ID = COMPANY_ID;
    }

    public Integer getMUNICIPALITY_ID() {
        return MUNICIPALITY_ID;
    }

    public void setMUNICIPALITY_ID(Integer MUNICIPALITY_ID) {
        this.MUNICIPALITY_ID = MUNICIPALITY_ID;
    }

    public Date getCHANGED_SALARY_DETAILS() {
        return CHANGED_SALARY_DETAILS;
    }

    public void setCHANGED_SALARY_DETAILS(Date CHANGED_SALARY_DETAILS) {
        this.CHANGED_SALARY_DETAILS = CHANGED_SALARY_DETAILS;
    }

    public String getNACE_CODE() {
        return NACE_CODE;
    }

    public void setNACE_CODE(String NACE_CODE) {
        this.NACE_CODE = NACE_CODE;
    }

    public Boolean getIS_PENSION_SCHEME() {
        return IS_PENSION_SCHEME;
    }

    public void setIS_PENSION_SCHEME(Boolean IS_PENSION_SCHEME) {
        this.IS_PENSION_SCHEME = IS_PENSION_SCHEME;
    }

    public String getPENSION_PROVIDER() {
        return PENSION_PROVIDER;
    }

    public void setPENSION_PROVIDER(String PENSION_PROVIDER) {
        this.PENSION_PROVIDER = PENSION_PROVIDER;
    }

    public Boolean getLIMIT_TO_SIX_G() {
        return LIMIT_TO_SIX_G;
    }

    public void setLIMIT_TO_SIX_G(Boolean LIMIT_TO_SIX_G) {
        this.LIMIT_TO_SIX_G = LIMIT_TO_SIX_G;
    }

    public Integer getCOMPANY_ORGANIZATION_TYPE_ID() {
        return COMPANY_ORGANIZATION_TYPE_ID;
    }

    public void setCOMPANY_ORGANIZATION_TYPE_ID(Integer COMPANY_ORGANIZATION_TYPE_ID) {
        this.COMPANY_ORGANIZATION_TYPE_ID = COMPANY_ORGANIZATION_TYPE_ID;
    }

    public Boolean getIS_FINANCIAL_DIFFICULTY_ENABLED() {
        return IS_FINANCIAL_DIFFICULTY_ENABLED;
    }

    public void setIS_FINANCIAL_DIFFICULTY_ENABLED(Boolean IS_FINANCIAL_DIFFICULTY_ENABLED) {
        this.IS_FINANCIAL_DIFFICULTY_ENABLED = IS_FINANCIAL_DIFFICULTY_ENABLED;
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
