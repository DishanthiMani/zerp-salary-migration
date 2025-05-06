package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ledger_account_line_item_log")
public class LedgerAccountLineItemLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer LEDGER_ACCOUNT_LINE_ITEM_LOG_ID;

    private Integer SALARY_RUN_LOG_ID;

    private Integer LEDGER_ACCOUNT_ID;

    private Integer LEDGER_ACCOUNT_NO;

    private String LEDGER_ACCOUNT_NAME;

    private String AMOUNT;

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
}
