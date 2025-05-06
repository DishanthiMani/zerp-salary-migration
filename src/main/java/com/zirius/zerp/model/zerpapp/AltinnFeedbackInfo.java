package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "altinn_feedback_info")
public class AltinnFeedbackInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ALTINN_FEEDBACK_INFO_ID;

    private Integer SALARY_RUN_ID;

    private String CALENDER_MONTH;

    private String A_MESSAGE_ID;

    private String REPLACE_A_MESSAGE_ID;

    private String ACCOUNT_NO;

    private String KID_COMPANY_TAX;

    private String KID_PERSON_TAX;

    private String KID_FINANCE_TAX;

    private String KID_TAX_CLAIM;

    private Date PAYMENT_DUE_DATE;

    private String REFERENCE;

    private String TOTAL_PERSON_TAX;

    private String TOTAL_COMPANY_TAX;

    private Integer TOTAL_FINANCE_TAX;

    private String TOTAL_TAX_CLAIM;

    private String RECEIVING_STATUS;

    private String SOURCE_SYSTEM;

    private Date CREATED_DATETIME;
}
