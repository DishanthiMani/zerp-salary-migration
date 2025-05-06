package com.zirius.zerp.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "employee_salary_accounts")
public class EmployeeSalaryAccounts {

    @Id
    private Integer USER_COMPANY_ID;
    private String ACCOUNT_NO;
    private String ACCOUNT_NAME;
    private String BANK_NAME;
    private Integer BANK_ACCOUNT_ID;
    private Integer VERSION;
    private Date CREATED_DATETIME;
    private Date MODIFIED_DATETIME;

}

