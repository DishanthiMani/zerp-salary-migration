package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Entity
@Table(name = "salary_payment_request_details")
public class SalaryPaymentRequestDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long SALARY_PAYMENT_REQUEST_DETAILS_ID;

    private Long PAYMENT_REQUEST_ID;

    private Long USER_COMPANY_ID;

    private Integer BANK_LIST_LINE_ITEM_LOG_ID;

    private String FROM_BANK_ACCOUNT_ID;

    private String BANK_ACCOUNT_ID;

    private String ACCOUNT_HOLDER_NAME;

    private String BANK_ACCOUNT_NO;

    private String BIC;

    private String IBAN_NO;

    private BigDecimal AMOUNT;

    private Integer PAYMENT_TYPE_ID;

    private Integer CURRENCY_ID;

    private String COUNTRY_CODE;

    private String REMITANCE_INFO;

    private String KID;

    private Integer STATUS_ID;

    private Date NETS_DATE;

    private BigDecimal NETS_EXCHANGE_RATE;

    private BigDecimal NETS_AMOUNT;

    private String TARGET_CURRENCY;
}
