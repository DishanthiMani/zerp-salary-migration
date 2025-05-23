package com.zirius.zerp.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class SalaryReportingCodeDetailsDTO {

    private Integer SALARY_REPORTING_CODE_ID;
    private String SALARY_REPORTING_CODE;
    private String SALARY_REPORTING_CODE_NAME;
    private Long ACCOUNT_ID;
    private Long CREDIT_ACCOUNT_ID;
    private Long SALARY_TYPE_ID;
    private Double COST_PRICE;
    private Double SALE_PRICE;
    private boolean IS_ACTIVE;
    private Integer SALARY_DESCRIPTION;
    private Integer BENEFITS;
    private boolean IS_SPECIFICATION;
    private boolean IS_HOLIDAY_PAY;
    private boolean IS_PAYROLL_TAX;
    private boolean IS_UNION;
    private Integer TAXES_ID;
    private Integer PENSION_ID;
    private Integer SSB_ID;
    private Integer SALARY_CODE_RATE_TYPE_ID;
    private Integer SALARY_CODE_YEARLY_RATE_TYPE_ID;
    private Integer COMPANY_ID;
    private Integer VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;
}
