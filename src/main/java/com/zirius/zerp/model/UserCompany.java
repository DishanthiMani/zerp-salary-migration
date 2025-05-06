package com.zirius.zerp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user_company")
public class UserCompany {

    @Id
    private Integer USER_COMPANY_ID;
    private Integer USER_ID;
    private Integer COMPANY_ID;
    private Boolean IS_ACTIVE;
    private Integer ROLE_ID;
    private Boolean IS_EMPLOYEE;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

    public Integer getUSER_COMPANY_ID() {
        return USER_COMPANY_ID;
    }

    public void setUSER_COMPANY_ID(Integer USER_COMPANY_ID) {
        this.USER_COMPANY_ID = USER_COMPANY_ID;
    }

    public Integer getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Integer USER_ID) {
        this.USER_ID = USER_ID;
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

    public Integer getROLE_ID() {
        return ROLE_ID;
    }

    public void setROLE_ID(Integer ROLE_ID) {
        this.ROLE_ID = ROLE_ID;
    }

    public Boolean getIS_EMPLOYEE() {
        return IS_EMPLOYEE;
    }

    public void setIS_EMPLOYEE(Boolean IS_EMPLOYEE) {
        this.IS_EMPLOYEE = IS_EMPLOYEE;
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

