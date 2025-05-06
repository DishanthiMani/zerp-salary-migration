package com.zirius.zerp.model.zerpapp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "bank_account")
public class BankAccounts {

    @Id
    private Integer BANK_ACCOUNT_ID;
    private String BANK_ACCOUNT_NO;
    private String BANK_ACCOUNT_NAME;
    private String BANK_NAME;
    private String BIC;
    private String IBAN_NO;
    private String CLEARING_CODE;
    private Integer REGULATORY_CODE;
    private Integer CURRENCY_ID;
    private String UUID;
    private Boolean  IS_DEFAULT;
    private Boolean  IS_ACTIVE;
    private Integer COMPANY_ID;
    private Boolean  ENTITY_TYPE_ID;
    private String FOREIGN_REFERENCE;
    private Boolean  IS_MULTI_APPROVER;
    private Integer VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

}
