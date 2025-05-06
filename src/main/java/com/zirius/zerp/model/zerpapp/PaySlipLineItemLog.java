package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "pay_slip_line_item_log")
public class PaySlipLineItemLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer PAY_SLIP_LINE_ITEM_ID;

    private Integer PAY_SLIP_LOG_ID;

    private Integer USER_COMPANY_CLAIM_COLLECTOR_CONFIG_ID;

    private String SALARY_REPORTING_CODE_ID;

    private String SALARY_REPORTING_CODE;

    private String SALARY_REPORTING_CODE_NAME;

    private String DESCRIPTION;

    private Integer WORK_PLACE_ID;

    private String WORK_PLACE_NAME;

    private String TAX_TYPE;

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

    private String SICK_REFUND_YEAR;

    private String FREE_CAR_LIST_PRICE;

    private String FREE_CAR_REG_NO;

    private Boolean IS_TAX;

    private Boolean IS_TABLE_TAX;

    private Boolean IS_PERCENTAGE_TAX;

    private BigDecimal PERSON_TAX_AMOUNT;

    private Integer ACCOUNT_NO;

    private Boolean IS_COUNTABLE_LINE_ITEM;
}
