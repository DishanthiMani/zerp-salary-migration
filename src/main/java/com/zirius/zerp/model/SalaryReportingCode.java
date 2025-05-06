package com.zirius.zerp.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "salary_reporting_code")
public class SalaryReportingCode {

    @Id
    private Integer SALARY_REPORTING_CODE_ID;

    private String SALARY_REPORTING_CODE;

    private String SALARY_REPORTING_CODE_NAME;

    private Double COST_PRICE;

    private Double SALE_PRICE;

    private Boolean  IS_ACTIVE;

    private Boolean  IS_DEFAULT;

    private Integer COMPANY_ID;

    private Long ACCOUNT_ID;

    private Long CREDIT_ACCOUNT_ID;

    private Long SALARY_TYPE_ID;

    private Long ICON_ID;

    private Integer VERSION;

    private Date CREATED_DATETIME;

    private Date MODIFIED_DATETIME;


    public Integer getSalaryReportingCodeId() {
        return SALARY_REPORTING_CODE_ID;
    }

    public void setSalaryReportingCodeId(Integer salaryReportingCodeId) {
        this.SALARY_REPORTING_CODE_ID = salaryReportingCodeId;
    }

    public String getSalaryReportingCode() {
        return SALARY_REPORTING_CODE;
    }

    public void setSalaryReportingCode(String salaryReportingCode) {
        this.SALARY_REPORTING_CODE = salaryReportingCode;
    }

    public String getSalaryReportingCodeName() {
        return SALARY_REPORTING_CODE_NAME;
    }

    public void setSalaryReportingCodeName(String salaryReportingCodeName) {
        this.SALARY_REPORTING_CODE_NAME = salaryReportingCodeName;
    }

    public Double getCostPrice() {
        return COST_PRICE;
    }

    public void setCostPrice(Double costPrice) {
        this.COST_PRICE = costPrice;
    }

    public Double getSalePrice() {
        return SALE_PRICE;
    }

    public void setSalePrice(Double salePrice) {
        this.SALE_PRICE = salePrice;
    }

    public Boolean  getIsActive() {return IS_ACTIVE;}

    public void setIsActive(Boolean  isActive) {
        this.IS_ACTIVE = isActive;
    }

    public Integer getCompanyId() {
        return COMPANY_ID;
    }

    public void setCompanyId(Integer companyId) {
        this.COMPANY_ID = companyId;
    }

    public Integer getVersion() {
        return VERSION;
    }

    public void setVersion(Integer version) {
        this.VERSION = version;
    }

    public Date getCreatedDateTime() {
        return CREATED_DATETIME;
    }

    public void setCreatedDateTime(Date createdDateTime) {
        this.CREATED_DATETIME = createdDateTime;
    }

    public Date getModifiedDateTime() {
        return MODIFIED_DATETIME;
    }

    public void setModifiedDateTime(Date modifiedDateTime) {
        this.MODIFIED_DATETIME = modifiedDateTime;
    }

    public Long getAccountId() {
        return ACCOUNT_ID;
    }

    public void setAccountId(Long accountId) {
        this.ACCOUNT_ID = accountId;
    }

    public Long getCreditAccountId() {
        return CREDIT_ACCOUNT_ID;
    }

    public void setCreditAccountId(Long creditAccountId) {
        this.CREDIT_ACCOUNT_ID = creditAccountId;
    }

    public Long getTypeId() {
        return SALARY_TYPE_ID;
    }

    public void setTypeId(Long typeId) {
        this.SALARY_TYPE_ID = typeId;
    }

    public Long getIconId() {
        return ICON_ID;
    }

    public void setIconId(Long iconId) {
        this.ICON_ID = iconId;
    }


    public Boolean  getIsDefault() {
        return IS_DEFAULT;
    }

    public void setIsDefault(Boolean  isDefault) {
        this.IS_DEFAULT = isDefault;
    }
}
