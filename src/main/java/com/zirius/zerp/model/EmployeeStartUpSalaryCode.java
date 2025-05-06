package com.zirius.zerp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "employee_startup_salary_codes")
public class EmployeeStartUpSalaryCode {

    @Id
    private Integer EMPLOYEE_STARTUP_SALARY_CODE_ID;
    private Integer USER_COMPANY_ID;
    private Integer USER_COMPANY_FREE_CAR_DETAILS_ID;
    private Integer USER_COMPANY_CLAIM_COLLECTOR_CONFIG_ID;
    private String REFERENCE_YEAR;
    private Integer SALARY_REPORTING_CODE_ID;
    private String SALARY_REPORTING_CODE;
    private String SALARY_REPORTING_CODE_NAME;
    private BigDecimal COUNT;
    private BigDecimal RATE;
    private BigDecimal AMOUNT;
    private String SICK_REFUND_YEAR;
    private Integer VERSION;
    private Integer EMPLOYEE_STARTUP_DETAILS_ID;
    private Integer WORK_PLACE_ID;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;
}

