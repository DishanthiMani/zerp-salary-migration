package com.zirius.zerp.model.zerpapp;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "user_company_salary_config")
public class UserCompanySalaryConfig {

    @Id
    private Integer USER_COMPANY_ID;
    private Integer SALARY_GROUP_ID;
    private BigDecimal ANNUAL_SALARY;
    private BigDecimal WORK_PERCENTAGE;
    private BigDecimal FIXED_SALARY;
    private BigDecimal SALARY_PER_HOUR;
    private Integer VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

}

