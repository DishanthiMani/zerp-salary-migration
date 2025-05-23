package com.zirius.zerp.model.zerpapp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "salary_reporting_code_basis")
public class SalaryReportingCodeBasis {

    @Id
    private Integer SALARY_REPORTING_CODE_ID;
    private Boolean IS_HOLIDAY_PAY;
    private Boolean IS_PAYROLL_TAX;
    private Boolean IS_UNION;
    private Long TAXES_ID;
    private Integer PENSION_ID;
    private Long IS_PENSION;
    private Long SSB_ID;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;
    private Integer SALARY_CODE_RATE_TYPE_ID;
    private Integer SALARY_CODE_YEARLY_RATE_TYPE_ID;


    public Integer getPENSION_ID() {
        return PENSION_ID;
    }

    public void setPENSION_ID(Integer PENSION_ID) {
        this.PENSION_ID = PENSION_ID;
    }

    public Integer getSALARY_CODE_RATE_TYPE_ID() {
        return SALARY_CODE_RATE_TYPE_ID;
    }

    public void setSALARY_CODE_RATE_TYPE_ID(Integer SALARY_CODE_RATE_TYPE_ID) {
        this.SALARY_CODE_RATE_TYPE_ID = SALARY_CODE_RATE_TYPE_ID;
    }

    public Integer getSALARY_CODE_YEARLY_RATE_TYPE_ID() {
        return SALARY_CODE_YEARLY_RATE_TYPE_ID;
    }

    public void setSALARY_CODE_YEARLY_RATE_TYPE_ID(Integer SALARY_CODE_YEARLY_RATE_TYPE_ID) {
        this.SALARY_CODE_YEARLY_RATE_TYPE_ID = SALARY_CODE_YEARLY_RATE_TYPE_ID;
    }

    public Integer getSALARY_REPORTING_CODE_ID() {
        return SALARY_REPORTING_CODE_ID;
    }

    public void setSALARY_REPORTING_CODE_ID(Integer SALARY_REPORTING_CODE_ID) {
        this.SALARY_REPORTING_CODE_ID = SALARY_REPORTING_CODE_ID;
    }

    public Boolean getIS_HOLIDAY_PAY() {
        return IS_HOLIDAY_PAY;
    }

    public void setIS_HOLIDAY_PAY(Boolean IS_HOLIDAY_PAY) {
        this.IS_HOLIDAY_PAY = IS_HOLIDAY_PAY;
    }

    public Boolean getIS_PAYROLL_TAX() {
        return IS_PAYROLL_TAX;
    }

    public void setIS_PAYROLL_TAX(Boolean IS_PAYROLL_TAX) {
        this.IS_PAYROLL_TAX = IS_PAYROLL_TAX;
    }

    public Boolean getIS_UNION() {
        return IS_UNION;
    }

    public void setIS_UNION(Boolean IS_UNION) {
        this.IS_UNION = IS_UNION;
    }

    public Long getTAXES_ID() {
        return TAXES_ID;
    }

    public void setTAXES_ID(Long TAXES_ID) {
        this.TAXES_ID = TAXES_ID;
    }

    public Long getIS_PENSION() {
        return IS_PENSION;
    }

    public void setIS_PENSION(Long IS_PENSION) {
        this.IS_PENSION = IS_PENSION;
    }

    public Long getSSB_ID() {
        return SSB_ID;
    }

    public void setSSB_ID(Long SSB_ID) {
        this.SSB_ID = SSB_ID;
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

