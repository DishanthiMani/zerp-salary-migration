package com.zirius.zerp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ledger_account_salary_reporting_code_line_item_log")
public class LedgerAccountSalaryReportingCodeLineItemLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer LEDGER_ACCOUNT_SALARY_REPORTING_CODE_LINE_ITEM_LOG_ID;

    private Integer SALARY_RUN_LOG_ID;

    private String SALARY_REPORTING_CODE_ID;

    private String SALARY_REPORTING_CODE;

    private String SALARY_REPORTING_CODE_NAME;

    private String DESCRIPTION;

    private Integer LEDGER_ACCOUNT_NO;

    private Integer CREDIT_LEDGER_ACCOUNT_NO;

    private Integer DEPARTMENT_ID;

    private String DEPARTMENT_CODE;

    private String DEPARTMENT_NAME;

    private Integer PROJECT_ID;

    private String PROJECT_CODE;

    private String PROJECT_NAME;

    private Integer DIMENSION1_ID;

    private String DIMENSION1_NO;

    private String DIMENSION1_NAME;

    private Integer ACTIVITY_ID;

    private String ACTIVITY_CODE;

    private String ACTIVITY_NAME;

    private String COUNT;

    private String RATE;

    private String AMOUNT;

    private Boolean IS_TAX;

    private Boolean IS_TABLE_TAX;

    private Boolean IS_PERCENTAGE_TAX;
}
