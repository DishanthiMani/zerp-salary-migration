package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "salary_run_log")
public class SalaryRunLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer SALARY_RUN_LOG_ID;

    private Integer CREATED_BY;

    private String OLD_PAYMENT_DATE;

    private Date PAYMENT_DATE;

    private Integer SALARY_RUN_DATE;

    private Date CREATED_TIME;

    private String SAMPLE_NO;

    private String PERIOD_TEXT;

    private Integer TAXES;

    private Integer FINANCE_TAX;

    private BigDecimal ADDITIONAL_COMPANY_TAX_BASIS;

    private BigDecimal ADJUSTED_DIFF_ADDITIONAL_TAX;

    private Integer MONTH;

    private Boolean IS_VARIABLE;

    private Integer COMPANY_ID;

    private Integer IS_AUTHORIZED;

    private Integer IS_HALF_TAX;

    private Integer IS_NO_TAX;

    private Integer IS_EMPLOYEE_INFO_UPDATE;

    private Integer IS_DELETE;

    private String ORG_NO;

    private String COMPANY_NAME;

    private String COMPANY_ADDRESS1;

    private String COMPANY_ADDRESS2;

    private String COMPANY_CITY;

    private String COMPANY_POSTALCODE;

    private Integer VERSION;

    private Boolean IS_PERMISSION;

    private Integer EMAIL_STATUS;

    private Integer IS_HOLIDAY_PAY_RUN;

    private Date CREATED_DATETIME;

    private Date MODIFIED_DATETIME;
}
