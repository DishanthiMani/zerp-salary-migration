package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "pay_slip_log")
public class PaySlipLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer PAY_SLIP_LOG_ID;

    private Integer SALARY_RUN_LOG_ID;

    private Integer EMPLOYEE_ID;

    private String employee_number;

    private String ACCOUNT_NO;

    private Integer USER_ID;

    private Integer USER_COMPANY_ID;

    private String USER_NAME;

    private String USER_ADDRESS1;

    private String USER_ADDRESS2;

    private String USER_CITY;

    private String USER_POSTAL_CODE;

    private String HOLIDAY_CASH_BASIS;

    private BigDecimal HOLIDAY_PAY_PERCENT;

    private String PAYROLL_WITH_HOLDING_TAX;

    private String PAID_AMOUNT;

    private Boolean IS_PAY_ABLE;

    private String SALARY_WITH_ADVANCE;
}
