package com.zirius.zerp.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "salary_yearly_constants_config")
public class SalaryYearlyConstant {

    @Id
    private Integer YEARLY_CONSTANTS_ID;

    private Double MAX_ECOM_REFUND_AMOUNT;

    private Double CAR_ALLOWANCE_WITH_TAX;

    private Double CAR_ALLOWANCE_WITHOUT_TAX;

    private Double CAR_ALLOWANCE_OVER_LIMIT;

    private Double ELECTRIC_CAR_ALLOWANCE_WITH_TAX;

    private Double ELECTRIC_CAR_ALLOWANCE_WITHOUT_TAX;

    private Double ELECTRIC_CAR_ALLOWANCE_OVER_LIMIT;

    private Double KILOMETER_TRAILER;

    private Double PASSENGER_ADDITION;

    private Double FOREST_AND_CONSTRUCTION_WAY;

    private Double TOOL_ALLOWANCE_FOR_CONSTRUCTION_WORKERS_WITHOUT_TAX;

    private Double TOOL_ALLOWANCE_FOR_FOREST_WORKERS;

    private Double FREE_CAR_BASE_VALUE;

    private Double HOLIDAY_PAY_OVER_60_YRS;

    private Long YEAR;

    private Double SALARY_CODE_CONSTANT;

    private Double PAUL_ARB_AVG_OF_BONUS_AMOUNT_CONSTANT;

    private Double HOLIDAY_PAY_AMOUNT_CONSTANT;

    private Double ONE_G_YEARLY_CONSTANT;

    private Double ADDITIONAL_COMPANY_TAX_PERCENT;

    private Integer ADDITIONAL_COMPANY_TAX_LIMIT;

    private Integer VERSION;

    private Date CREATED_DATETIME;

    private Date MODIFIED_DATETIME;

    private Integer COMPANY_ID;

    private Boolean  IS_ACTIVE;

    private Double MAX_FREE_CARD_AMOUNT;

    private Double TRANSPORT_MAX_FREE_CARD_AMOUNT;

    private Double COMPANY_TAX_PERCENT;

    public Integer getYEARLY_CONSTANTS_ID() {
        return YEARLY_CONSTANTS_ID;
    }

    public void setYEARLY_CONSTANTS_ID(Integer YEARLY_CONSTANTS_ID) {
        this.YEARLY_CONSTANTS_ID = YEARLY_CONSTANTS_ID;
    }

    public Double getMAX_ECOM_REFUND_AMOUNT() {
        return MAX_ECOM_REFUND_AMOUNT;
    }

    public void setMAX_ECOM_REFUND_AMOUNT(Double MAX_ECOM_REFUND_AMOUNT) {
        this.MAX_ECOM_REFUND_AMOUNT = MAX_ECOM_REFUND_AMOUNT;
    }

    public Double getCAR_ALLOWANCE_WITH_TAX() {
        return CAR_ALLOWANCE_WITH_TAX;
    }

    public void setCAR_ALLOWANCE_WITH_TAX(Double CAR_ALLOWANCE_WITH_TAX) {
        this.CAR_ALLOWANCE_WITH_TAX = CAR_ALLOWANCE_WITH_TAX;
    }

    public Double getCAR_ALLOWANCE_WITHOUT_TAX() {
        return CAR_ALLOWANCE_WITHOUT_TAX;
    }

    public void setCAR_ALLOWANCE_WITHOUT_TAX(Double CAR_ALLOWANCE_WITHOUT_TAX) {
        this.CAR_ALLOWANCE_WITHOUT_TAX = CAR_ALLOWANCE_WITHOUT_TAX;
    }

    public Double getCAR_ALLOWANCE_OVER_LIMIT() {
        return CAR_ALLOWANCE_OVER_LIMIT;
    }

    public void setCAR_ALLOWANCE_OVER_LIMIT(Double CAR_ALLOWANCE_OVER_LIMIT) {
        this.CAR_ALLOWANCE_OVER_LIMIT = CAR_ALLOWANCE_OVER_LIMIT;
    }

    public Double getELECTRIC_CAR_ALLOWANCE_WITH_TAX() {
        return ELECTRIC_CAR_ALLOWANCE_WITH_TAX;
    }

    public void setELECTRIC_CAR_ALLOWANCE_WITH_TAX(Double ELECTRIC_CAR_ALLOWANCE_WITH_TAX) {
        this.ELECTRIC_CAR_ALLOWANCE_WITH_TAX = ELECTRIC_CAR_ALLOWANCE_WITH_TAX;
    }

    public Double getELECTRIC_CAR_ALLOWANCE_WITHOUT_TAX() {
        return ELECTRIC_CAR_ALLOWANCE_WITHOUT_TAX;
    }

    public void setELECTRIC_CAR_ALLOWANCE_WITHOUT_TAX(Double ELECTRIC_CAR_ALLOWANCE_WITHOUT_TAX) {
        this.ELECTRIC_CAR_ALLOWANCE_WITHOUT_TAX = ELECTRIC_CAR_ALLOWANCE_WITHOUT_TAX;
    }

    public Double getELECTRIC_CAR_ALLOWANCE_OVER_LIMIT() {
        return ELECTRIC_CAR_ALLOWANCE_OVER_LIMIT;
    }

    public void setELECTRIC_CAR_ALLOWANCE_OVER_LIMIT(Double ELECTRIC_CAR_ALLOWANCE_OVER_LIMIT) {
        this.ELECTRIC_CAR_ALLOWANCE_OVER_LIMIT = ELECTRIC_CAR_ALLOWANCE_OVER_LIMIT;
    }

    public Double getKILOMETER_TRAILER() {
        return KILOMETER_TRAILER;
    }

    public void setKILOMETER_TRAILER(Double KILOMETER_TRAILER) {
        this.KILOMETER_TRAILER = KILOMETER_TRAILER;
    }

    public Double getPASSENGER_ADDITION() {
        return PASSENGER_ADDITION;
    }

    public void setPASSENGER_ADDITION(Double PASSENGER_ADDITION) {
        this.PASSENGER_ADDITION = PASSENGER_ADDITION;
    }

    public Double getFOREST_AND_CONSTRUCTION_WAY() {
        return FOREST_AND_CONSTRUCTION_WAY;
    }

    public void setFOREST_AND_CONSTRUCTION_WAY(Double FOREST_AND_CONSTRUCTION_WAY) {
        this.FOREST_AND_CONSTRUCTION_WAY = FOREST_AND_CONSTRUCTION_WAY;
    }

    public Double getTOOL_ALLOWANCE_FOR_CONSTRUCTION_WORKERS_WITHOUT_TAX() {
        return TOOL_ALLOWANCE_FOR_CONSTRUCTION_WORKERS_WITHOUT_TAX;
    }

    public void setTOOL_ALLOWANCE_FOR_CONSTRUCTION_WORKERS_WITHOUT_TAX(Double TOOL_ALLOWANCE_FOR_CONSTRUCTION_WORKERS_WITHOUT_TAX) {
        this.TOOL_ALLOWANCE_FOR_CONSTRUCTION_WORKERS_WITHOUT_TAX = TOOL_ALLOWANCE_FOR_CONSTRUCTION_WORKERS_WITHOUT_TAX;
    }

    public Double getTOOL_ALLOWANCE_FOR_FOREST_WORKERS() {
        return TOOL_ALLOWANCE_FOR_FOREST_WORKERS;
    }

    public void setTOOL_ALLOWANCE_FOR_FOREST_WORKERS(Double TOOL_ALLOWANCE_FOR_FOREST_WORKERS) {
        this.TOOL_ALLOWANCE_FOR_FOREST_WORKERS = TOOL_ALLOWANCE_FOR_FOREST_WORKERS;
    }

    public Double getFREE_CAR_BASE_VALUE() {
        return FREE_CAR_BASE_VALUE;
    }

    public void setFREE_CAR_BASE_VALUE(Double FREE_CAR_BASE_VALUE) {
        this.FREE_CAR_BASE_VALUE = FREE_CAR_BASE_VALUE;
    }

    public Double getHOLIDAY_PAY_OVER_60_YRS() {
        return HOLIDAY_PAY_OVER_60_YRS;
    }

    public void setHOLIDAY_PAY_OVER_60_YRS(Double HOLIDAY_PAY_OVER_60_YRS) {
        this.HOLIDAY_PAY_OVER_60_YRS = HOLIDAY_PAY_OVER_60_YRS;
    }

    public Long getYEAR() {
        return YEAR;
    }

    public void setYEAR(Long YEAR) {
        this.YEAR = YEAR;
    }

    public Double getSALARY_CODE_CONSTANT() {
        return SALARY_CODE_CONSTANT;
    }

    public void setSALARY_CODE_CONSTANT(Double SALARY_CODE_CONSTANT) {
        this.SALARY_CODE_CONSTANT = SALARY_CODE_CONSTANT;
    }

    public Double getPAUL_ARB_AVG_OF_BONUS_AMOUNT_CONSTANT() {
        return PAUL_ARB_AVG_OF_BONUS_AMOUNT_CONSTANT;
    }

    public void setPAUL_ARB_AVG_OF_BONUS_AMOUNT_CONSTANT(Double PAUL_ARB_AVG_OF_BONUS_AMOUNT_CONSTANT) {
        this.PAUL_ARB_AVG_OF_BONUS_AMOUNT_CONSTANT = PAUL_ARB_AVG_OF_BONUS_AMOUNT_CONSTANT;
    }

    public Double getHOLIDAY_PAY_AMOUNT_CONSTANT() {
        return HOLIDAY_PAY_AMOUNT_CONSTANT;
    }

    public void setHOLIDAY_PAY_AMOUNT_CONSTANT(Double HOLIDAY_PAY_AMOUNT_CONSTANT) {
        this.HOLIDAY_PAY_AMOUNT_CONSTANT = HOLIDAY_PAY_AMOUNT_CONSTANT;
    }

    public Double getONE_G_YEARLY_CONSTANT() {
        return ONE_G_YEARLY_CONSTANT;
    }

    public void setONE_G_YEARLY_CONSTANT(Double ONE_G_YEARLY_CONSTANT) {
        this.ONE_G_YEARLY_CONSTANT = ONE_G_YEARLY_CONSTANT;
    }

    public Double getADDITIONAL_COMPANY_TAX_PERCENT() {
        return ADDITIONAL_COMPANY_TAX_PERCENT;
    }

    public void setADDITIONAL_COMPANY_TAX_PERCENT(Double ADDITIONAL_COMPANY_TAX_PERCENT) {
        this.ADDITIONAL_COMPANY_TAX_PERCENT = ADDITIONAL_COMPANY_TAX_PERCENT;
    }

    public Integer getADDITIONAL_COMPANY_TAX_LIMIT() {
        return ADDITIONAL_COMPANY_TAX_LIMIT;
    }

    public void setADDITIONAL_COMPANY_TAX_LIMIT(Integer ADDITIONAL_COMPANY_TAX_LIMIT) {
        this.ADDITIONAL_COMPANY_TAX_LIMIT = ADDITIONAL_COMPANY_TAX_LIMIT;
    }

    public Integer getVERSION() {
        return VERSION;
    }

    public void setVERSION(Integer VERSION) {
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

    public Integer getCOMPANY_ID() {
        return COMPANY_ID;
    }

    public void setCOMPANY_ID(Integer COMPANY_ID) {
        this.COMPANY_ID = COMPANY_ID;
    }

    public Boolean  isIS_ACTIVE() {
        return IS_ACTIVE;
    }

    public void setIS_ACTIVE(Boolean  IS_ACTIVE) {
        this.IS_ACTIVE = IS_ACTIVE;
    }

    public Double getMAX_FREE_CARD_AMOUNT() {
        return MAX_FREE_CARD_AMOUNT;
    }

    public void setMAX_FREE_CARD_AMOUNT(Double MAX_FREE_CARD_AMOUNT) {
        this.MAX_FREE_CARD_AMOUNT = MAX_FREE_CARD_AMOUNT;
    }

    public Double getTRANSPORT_MAX_FREE_CARD_AMOUNT() {
        return TRANSPORT_MAX_FREE_CARD_AMOUNT;
    }

    public void setTRANSPORT_MAX_FREE_CARD_AMOUNT(Double TRANSPORT_MAX_FREE_CARD_AMOUNT) {
        this.TRANSPORT_MAX_FREE_CARD_AMOUNT = TRANSPORT_MAX_FREE_CARD_AMOUNT;
    }

    public Double getCOMPANY_TAX_PERCENT() {
        return COMPANY_TAX_PERCENT;
    }

    public void setCOMPANY_TAX_PERCENT(Double COMPANY_TAX_PERCENT) {
        this.COMPANY_TAX_PERCENT = COMPANY_TAX_PERCENT;
    }
}
