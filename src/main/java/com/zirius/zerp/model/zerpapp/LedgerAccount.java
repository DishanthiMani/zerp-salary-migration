package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ledger_account")
public class LedgerAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ACCOUNT_ID;

    private Integer ACCOUNT_NO;

    private String ACCOUNT_NAME;

    private Short ACCOUNT_TYPE;

    private Integer TAX_SLAB_ID;

    private Integer TAX_CODE_ID;

    private String DESCRIPTION;

    private Boolean IS_VOLUME_REQD;

    private Boolean IS_ATTACHED_TO_INBOUND_INVOICE;

    private Integer COMPANY_ID;

    private Integer LEDGER_GROUP_ID;

    private Boolean PARTIAL_DEDUCTION;

    private BigDecimal PARTIAL_DEDUCTION_PERCENT;

    private Integer VERSION;

    private Boolean IS_ACTIVE;

    private Boolean IS_DEFAULT;

    private Boolean IS_GENERATED_BY_SALARY;

    private LocalDateTime CREATED_DATETIME;

    private LocalDateTime MODIFIED_DATETIME;
}
