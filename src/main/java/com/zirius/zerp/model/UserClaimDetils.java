package com.zirius.zerp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "user_company_claim_collector_config")
public class UserClaimDetils {

    @Id
    private Integer USER_COMPANY_CLAIM_COLLECTOR_CONFIG_ID;
    private Integer CLAIM_COLLECTOR_TYPE_ID;
    private Integer USER_COMPANY_ID;
    private Integer EMPLOYEE_STARTUP_DETAILS_ID;
    private Integer CLAIM_COLLECTORS_ID;
    private String REFERENCE_YEAR;
    private Integer STATUS;
    private String KID_NO;
    private BigDecimal starting_balance;
    private Boolean  CALCULATE_FROM_SALARY;
    private BigDecimal MONTHLY_PULL;
    private BigDecimal PERCENTAGE;
    private BigDecimal AMOUNT_TO_PAY;
    private BigDecimal PAID_AMOUNT;
    private Integer COMPANY_ID;
    private Integer DEPARTMENT_ID;
    private Integer ACTIVITY_ID;
    private Integer PROJECT_ID;
    private Integer DIMENSION1_ID;
    private Integer WORK_PLACE_ID;
    private Integer SALARY_REPORTING_CODE_ID;
    private Boolean  IS_ACTIVE;
    private Integer VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

}

