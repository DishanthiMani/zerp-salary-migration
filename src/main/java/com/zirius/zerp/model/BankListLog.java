package com.zirius.zerp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bank_list_log")
public class BankListLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer BANK_LIST_LOG_ID;

    private Integer SALARY_RUN_LOG_ID;

    private String TOTAL_PAID_SALARY;

    private String TOTAL_CASH_PAID_SALARY;

    private String TOTAL_TAX;

    private String TOTAL_PAYROLL;

    private String TOTAL_HOLIDAYPAY;

    private String TOTAL_CLAIMANTS;

    private String TOTAL_BANK_PAY;

    private String TOTAL_ABROAD;

    private String TOTAL_CASH;

    private String TOTAL_AMOUNT;

    private String OPERATOR_NAME;

    private String CUSTOMER_NAME;

    private String USER_NAME;

    private String COMPANY_BANK_ACCOUNT_NUMBER;

    private Integer DEPARTMENT_ID;

    private String DEPARTMENT_CODE;

    private String DEPARTMENT_NAME;

    private Integer CLAIM_COLLECTORS_ID;
}
