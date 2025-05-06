package com.zirius.zerp.model.zerpapp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "user_company_salary_reporting_code")
public class UserCompanySalaryCode {

    @Id
    private Integer USER_COMPANY_SALARY_REPORTING_CODE_ID;
    private Integer USER_COMPANY_ID;
    private Integer SALARY_REPORTING_CODE_ID;
    private String DESCRIPTION;
    private Integer WORK_PLACE_ID;
    private Integer DEPARTMENT_ID;
    private Integer PROJECT_ID;
    private Integer DIMENSION1_ID;
    private Integer ACTIVITY_ID;
    private Integer USER_COMPANY_CLAIM_COLLECTOR_CONFIG_ID;
    private Integer USER_COMPANY_FREE_CAR_DETAILS_ID;
    private BigDecimal COUNT;
    private BigDecimal RATE;
    private BigDecimal AMOUNT;
    private String SICK_REFUND_YEAR;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;
    private Integer VERSION;
}

