package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "bimonthly_report_details")
public class BimonthlyReportDetails {

    @Id
    private Integer BIMONTHLY_REPORT_DETAILS_ID;
    private Integer SALARY_REPORT_ID;
    private String COMPANY_TAX_AMOUNT;
    private String PERSON_TAX_AMOUNT;
    private String FINANCE_TAX_AMOUNT;
    private String TAX_CLAIM_AMOUNT;
    private String COMPANY_TAX_KID;
    private String PERSON_TAX_KID;
    private String FINANCE_TAX_KID;
    private String TAX_CLAIM_KID;
    private Integer BANK_ACCOUNT_ID;
    private Date PAYMENT_DATE;
    private Date CREATED_DATETIME;
}
