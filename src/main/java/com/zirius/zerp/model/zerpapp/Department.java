package com.zirius.zerp.model.zerpapp;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "department")
public class Department {

    @Id
    private Long DEPARTMENT_ID;
    private String DEPARTMENT_CODE;
    private String DEPARTMENT_NAME;
    private Integer USER_ID;
    private Integer COMPANY_ID;
    private boolean IS_ENABLE_BANK_LEDGER;
    private Long BANK_ACCOUNT;
    private Long LEDGER_ACCOUNT;
    private Integer VERSION;
    private LocalDateTime CREATED_DATETIME;
    private LocalDateTime MODIFIED_DATETIME;
    private boolean isActive;

}

