package com.zirius.zerp.model.zerpapp;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "bank_list_line_item_log")
public class BankListLineItemLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer BANK_LIST_LINE_ITEM_LOG_ID;

    private Integer BANK_LIST_LOG_ID;

    private String ACCCOUNT_NO;

    private String IBAN_NO;

    private Integer USER_ID;

    private Integer USER_COMPANY_ID;

    private String USER_NAME;

    private String AMOUNT;

    private Boolean IS_CASH_LIST;

    private String KID_NO;
}
