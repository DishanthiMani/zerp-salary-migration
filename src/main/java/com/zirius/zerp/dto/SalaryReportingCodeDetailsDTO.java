package com.zirius.zerp.dto;

import lombok.Data;
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
    private Boolean IS_ACTIVE;
    private Integer COMPANY_ID;
    private Integer SALARY_DESCRIPTION;
    private Integer BENEFITS;
    private Boolean IS_SPECIFICATION;
    private Boolean IS_HOLIDAY_PAY;
    private Boolean IS_PAYROLL_TAX;
    private Boolean IS_UNION;
    private Boolean IS_PENSION;
    private Long TAXES_ID;
    private Long PENSION_ID;
    private Integer SSB_ID;
    private Long SALARY_CODE_RATE_TYPE_ID;
    private Integer SALARY_CODE_YEARLY_RATE_TYPE_ID;
    private Integer VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

    public SalaryReportingCodeDetailsDTO(
            Integer SALARY_REPORTING_CODE_ID,
            String SALARY_REPORTING_CODE,
            String SALARY_REPORTING_CODE_NAME,
            Long ACCOUNT_ID,
            Long CREDIT_ACCOUNT_ID,
            Long SALARY_TYPE_ID,
            Double COST_PRICE,
            Double SALE_PRICE,
            Boolean IS_ACTIVE,
            Integer COMPANY_ID,
            Integer SALARY_DESCRIPTION,
            Integer BENEFITS,
            Boolean IS_SPECIFICATION,
            Boolean IS_HOLIDAY_PAY,
            Boolean IS_PAYROLL_TAX,
            Boolean IS_UNION,
            Boolean IS_PENSION,
            Long TAXES_ID,
            Long PENSION_ID,
            Integer SSB_ID,
            Long SALARY_CODE_RATE_TYPE_ID,
            Integer SALARY_CODE_YEARLY_RATE_TYPE_ID,
            Integer VERSION,
            Date CREATED_DATETIME,
            Date MODIFIED_DATETIME
    ) {
        this.SALARY_REPORTING_CODE_ID = SALARY_REPORTING_CODE_ID;
        this.SALARY_REPORTING_CODE = SALARY_REPORTING_CODE;
        this.SALARY_REPORTING_CODE_NAME = SALARY_REPORTING_CODE_NAME;
        this.ACCOUNT_ID = ACCOUNT_ID;
        this.CREDIT_ACCOUNT_ID = CREDIT_ACCOUNT_ID;
        this.SALARY_TYPE_ID = SALARY_TYPE_ID;
        this.COST_PRICE = COST_PRICE;
        this.SALE_PRICE = SALE_PRICE;
        this.IS_ACTIVE = IS_ACTIVE;
        this.COMPANY_ID = COMPANY_ID;
        this.SALARY_DESCRIPTION = SALARY_DESCRIPTION;
        this.BENEFITS = BENEFITS;
        this.IS_SPECIFICATION = IS_SPECIFICATION;
        this.IS_HOLIDAY_PAY = IS_HOLIDAY_PAY;
        this.IS_PAYROLL_TAX = IS_PAYROLL_TAX;
        this.IS_UNION = IS_UNION;
        this.IS_PENSION = IS_PENSION;
        this.TAXES_ID = TAXES_ID;
        this.PENSION_ID = PENSION_ID;
        this.SSB_ID = SSB_ID;
        this.SALARY_CODE_RATE_TYPE_ID = SALARY_CODE_RATE_TYPE_ID;
        this.SALARY_CODE_YEARLY_RATE_TYPE_ID = SALARY_CODE_YEARLY_RATE_TYPE_ID;
        this.VERSION = VERSION;
        this.CREATED_DATETIME = CREATED_DATETIME;
        this.MODIFIED_DATETIME = MODIFIED_DATETIME;
    }
}
