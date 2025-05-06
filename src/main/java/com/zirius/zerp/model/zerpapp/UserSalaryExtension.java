package com.zirius.zerp.model.zerpapp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "user_company_salary_extension")
public class UserSalaryExtension {

    @Id
    private Integer SALARY_EXTENSION_ID;
    private Integer USER_COMPANY_ID;
    private Integer COMPANY_ID;
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
    private Integer EXT_FREE_CAR_DETAILS_ID;
    private Date EXT_FREE_CAR_START_DATE;
    private Date EXT_FREE_CAR_END_DATE;
    private Boolean  IS_REMOVED;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;
    private Integer VERSION;
}
