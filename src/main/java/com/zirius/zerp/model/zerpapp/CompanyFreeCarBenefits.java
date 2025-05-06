package com.zirius.zerp.model.zerpapp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "company_free_car_benefits")
public class CompanyFreeCarBenefits {

    @Id
    private Long COMPANY_FREE_CAR_BENEFITS_ID;
    private Integer SALARY_REPORTING_CODE_ID;
    private Double ANNUAL_BENEFIT;
    private Double AMOUNT_PER_SETTLEMENT;
    private Double PRICE;
    private Integer COMPANY_ID;
    private int VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

    public Long getCompanyFreeCarBenefitId() {
        return COMPANY_FREE_CAR_BENEFITS_ID;
    }

    public void setCompanyFreeCarBenefitId(Long companyFreeCarBenefitId) {
        this.COMPANY_FREE_CAR_BENEFITS_ID = companyFreeCarBenefitId;
    }

    public Integer getSalaryReportingCodeId() {
        return SALARY_REPORTING_CODE_ID;
    }

    public void setSalaryReportingCodeId(Integer salaryReportingCodeId) {
        this.SALARY_REPORTING_CODE_ID = salaryReportingCodeId;
    }

    public Double getANNUAL_BENEFIT() {
        return ANNUAL_BENEFIT;
    }

    public void setANNUAL_BENEFIT(Double ANNUAL_BENEFIT) {
        this.ANNUAL_BENEFIT = ANNUAL_BENEFIT;
    }

    public Double getAMOUNT_PER_SETTLEMENT() {
        return AMOUNT_PER_SETTLEMENT;
    }

    public void setAMOUNT_PER_SETTLEMENT(Double AMOUNT_PER_SETTLEMENT) {
        this.AMOUNT_PER_SETTLEMENT = AMOUNT_PER_SETTLEMENT;
    }

    public Double getPRICE() {
        return PRICE;
    }

    public void setPRICE(Double PRICE) {
        this.PRICE = PRICE;
    }

    public Integer getCOMPANY_ID() {
        return COMPANY_ID;
    }

    public void setCOMPANY_ID(Integer COMPANY_ID) {
        this.COMPANY_ID = COMPANY_ID;
    }

    public int getVersion() {
        return VERSION;
    }

    public void setVersion(int version) {
        this.VERSION = version;
    }

    public Date getCREATED_DATETIME() {
        return CREATED_DATETIME;
    }

    public void setCREATED_DATETIME(Date CREATED_DATETIME) {
        this.CREATED_DATETIME = CREATED_DATETIME;
    }

    public Date getModifiedDateTime() {
        return MODIFIED_DATETIME;
    }

    public void setModifiedDateTime(Date modifiedDateTime) {
        this.MODIFIED_DATETIME = modifiedDateTime;
    }

}


