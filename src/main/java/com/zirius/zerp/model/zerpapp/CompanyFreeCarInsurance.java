package com.zirius.zerp.model.zerpapp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "company_free_car_insurance")
public class CompanyFreeCarInsurance {

    @Id
    private Long COMPANY_FREE_CAR_INSURANCE_ID;
    private Date INSURANCE_DATE;
    private Double DISTANCE_TRAVELLED_TILL;
    private Double DISTANCE_TRAVELLED_PER_YEAR;
    private Double DEDUCTABLE;
    private String CORPORTATION;
    private Integer COMPANY_ID;
    private int VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

    public Long getCOMPANY_FREE_CAR_INSURANCE_ID() {
        return COMPANY_FREE_CAR_INSURANCE_ID;
    }

    public void setCOMPANY_FREE_CAR_INSURANCE_ID(Long COMPANY_FREE_CAR_INSURANCE_ID) {
        this.COMPANY_FREE_CAR_INSURANCE_ID = COMPANY_FREE_CAR_INSURANCE_ID;
    }

    public Date getINSURANCE_DATE() {
        return INSURANCE_DATE;
    }

    public void setINSURANCE_DATE(Date INSURANCE_DATE) {
        this.INSURANCE_DATE = INSURANCE_DATE;
    }

    public Double getDISTANCE_TRAVELLED_TILL() {
        return DISTANCE_TRAVELLED_TILL;
    }

    public void setDISTANCE_TRAVELLED_TILL(Double DISTANCE_TRAVELLED_TILL) {
        this.DISTANCE_TRAVELLED_TILL = DISTANCE_TRAVELLED_TILL;
    }

    public Double getDISTANCE_TRAVELLED_PER_YEAR() {
        return DISTANCE_TRAVELLED_PER_YEAR;
    }

    public void setDISTANCE_TRAVELLED_PER_YEAR(Double DISTANCE_TRAVELLED_PER_YEAR) {
        this.DISTANCE_TRAVELLED_PER_YEAR = DISTANCE_TRAVELLED_PER_YEAR;
    }

    public Double getDEDUCTABLE() {
        return DEDUCTABLE;
    }

    public void setDEDUCTABLE(Double DEDUCTABLE) {
        this.DEDUCTABLE = DEDUCTABLE;
    }

    public String getCORPORTATION() {
        return CORPORTATION;
    }

    public void setCORPORTATION(String CORPORTATION) {
        this.CORPORTATION = CORPORTATION;
    }

    public Integer getCOMPANY_ID() {
        return COMPANY_ID;
    }

    public void setCOMPANY_ID(Integer COMPANY_ID) {
        this.COMPANY_ID = COMPANY_ID;
    }

    public int getVERSION() {
        return VERSION;
    }

    public void setVERSION(int VERSION) {
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

